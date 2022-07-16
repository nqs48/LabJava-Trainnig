package org.sofka.game.clases;

import org.sofka.game.utils.Messages;

import java.util.ArrayList;
import java.util.Scanner;


public class Game {
    Scanner input= new Scanner(System.in);
    private Integer idGame;
    private final Gamer gamer;
    private int level;


    public Game() {
        Messages.printMessage("\nEnter your name: ");
        String nameGamer= input.nextLine();
        Messages.printMessage("\nEnter your email: ");
        String emailGamer= input.nextLine();
        this.gamer = new Gamer(nameGamer,emailGamer);
        this.level = 1;
        this.idGame= 1;
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




}
