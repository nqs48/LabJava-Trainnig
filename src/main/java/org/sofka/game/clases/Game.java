package org.sofka.game.clases;

import org.sofka.game.model.MldQuestion;
import org.sofka.game.utils.Messages;

import java.util.ArrayList;
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





        infoGame();
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


}
