package org.sofka.game.clases;

import org.sofka.game.model.MldQuestion;
import org.sofka.game.utils.Messages;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;


public class Game {

    Random r = new Random();
    MldQuestion mldQuestion= new MldQuestion();

    Scanner input= new Scanner(System.in);
    private Integer idGame;
    private final Gamer gamer;
    private int level;
    private ArrayList[] questions;


    public Game() {
        Messages.printMessage("\nEnter your name: ");
        String nameGamer= input.nextLine();
        Messages.printMessage("\nEnter your email: ");
        String emailGamer= input.nextLine();
        comboQuestions();
        gamer = new Gamer(nameGamer,emailGamer);
        level = 1;
        idGame= 1;
        nextQuestions();





    }


    public Integer getIdGame() {
        return idGame;
    }

    public Gamer getGamer() {
        return gamer;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }



    public void comboQuestions(){
        questions =new ArrayList[5];
        for(int i=0; i<questions.length; i++){
            int random = r.nextInt(4 - 1 + 1) + 1;
            ArrayList[] questionForLevel= mldQuestion.FindQuestions(i+1);
            questions[i] =questionForLevel[random];
        }
    }

    public ArrayList[] getQuestions() {
        return questions;
    }

    public void infoGame(){
        Messages.printMessage("\nGamer: " +gamer.getName()+
                "\nEmail: " +gamer.getEmail()+
                "\nScore: " +gamer.getScore()+
                "\nGame Level: "+level);
    }

    public void nextQuestions() {
        ArrayList[] questions = getQuestions();
        try{
        for (int i = 0; i < questions.length; i++) {
            Question question = new Question(questions[i]);
            question.showQuestionInformation();
            menuAswers(question.getQuestionText(), question.getTemporalOptions(), i + 1);
                String answer = input.nextLine().toUpperCase(Locale.ROOT);
                    if(answer.equals("E")){
                        Messages.printMessage("\n\nYou left the game!!\t\tSave "+gamer.getScore()+ " points. \n\nThank You!!!");
                        break;
                    }else if (question.validateAnswer(answer)) {
                        Messages.printMessage("\n\nYou right!!\t\tEarn 1000 pts \n");
                        int actualScore= getGamer().getScore();
                        getGamer().setScore(actualScore+1000);
                        int actualLevel= getLevel();
                        setLevel(actualLevel+1);
                        continue;
                    } else {
                        Messages.printMessage("\n\nYou Failed!!\t\tLose all points. \n\nGood Bye!!!");
                        getGamer().setScore(0);
                        break;
                    }
        }
        } catch (Exception e){
            Messages.printError("Incorrect Data type option");
        }

    }


    public void menuAswers(String question ,ArrayList opcions, int ronda){
        Messages.printMessage("\n\t\tWHO WANTS MILLIONAIRE ? | ROUND "+ronda+
                "\n"+question+
                "\n\n| A. "+opcions.get(0) +" (A)"+
                "\n| B. "+opcions.get(1) +" (B)"+
                "\n| C. "+opcions.get(2) +" (C)"+
                "\n| D. "+opcions.get(3) +" (D)"+
                "\n| E. LEAVE GAME: (E)\n" +
                "\nEnter the number of your process:");

    }


}
