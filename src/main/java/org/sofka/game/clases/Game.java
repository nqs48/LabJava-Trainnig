package org.sofka.game.clases;

import org.sofka.game.model.MldQuestion;
import org.sofka.game.utils.Messages;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Nestor Quiroga
 * @author Victor Roca
 * Class Game
 */
public class Game {

    /**
     * Instance class Random
     */
    Random r = new Random();

    /**
     * Instance class modelQuestion
     */
    MldQuestion mldQuestion= new MldQuestion();

    /**
     * Instance class Scanner
     */
    Scanner input= new Scanner(System.in);

    /**
     * Game id
     */
    private Integer idGame;

    /**
     * Gamer who plays the game
     */
    private final Gamer gamer;

    /**
     * Game level
     */
    private int level;

    /**
     * Game Questions
     */
    private ArrayList[] questions;

    /**
     * Empty constructor class Game with the game's course
     */
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


    /**
     * Gets the current value for idGame
     * @return returns idGame, type integer
     */
    public Integer getIdGame() {
        return idGame;
    }

    /**
     * Gets the current value for gamer
     * @return returns gamer, type Gamer
     */
    public Gamer getGamer() {
        return gamer;
    }

    /**
     * Gets the current value for level
     * @return returns level, type integer
     */
    public int getLevel() {
        return level;
    }

    /**
     * Sets a new value for level
     * @param level Contains the new id to set, type int
     */
    public void setLevel(int level) {
        this.level = level;
    }




    /**
     * Gets the current value for questions
     * @return returns questions, type ArrayList[]
     */
    public ArrayList[] getQuestions() {
        return questions;
    }


    /**
     * Prints gamer general Information
     */
    public void infoGame(){
        Messages.printMessage("\nGamer: " +gamer.getName()+
                "\nEmail: " +gamer.getEmail()+
                "\nScore: " +gamer.getScore()+
                "\nGame Level: "+level);
    }


    /**
     * Create a arraylist with the questions of the game
     */
    public void comboQuestions(){
        questions =new ArrayList[5];
        for(int i=0; i<questions.length; i++){
            int random = r.nextInt(4 - 1 + 1) + 1;
            ArrayList[] questionForLevel= mldQuestion.FindQuestions(i+1);
            questions[i] =questionForLevel[random];
        }
    }

    /**
     * Logical game question
     */
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

    /**
     * Prints formatting Question
     * @param question Tex of the question
     * @param opcions Options for the question
     * @param round Current value of round
     */
    public void menuAswers(String question ,ArrayList opcions, int round){
        Messages.printMessage("\n\t\tWHO WANTS MILLIONAIRE ? | ROUND "+round+
                "\n"+question+
                "\n\n| A. "+opcions.get(0) +" (A)"+
                "\n| B. "+opcions.get(1) +" (B)"+
                "\n| C. "+opcions.get(2) +" (C)"+
                "\n| D. "+opcions.get(3) +" (D)"+
                "\n| E. LEAVE GAME: (E)\n" +
                "\nEnter the number of your process:");

    }


}
