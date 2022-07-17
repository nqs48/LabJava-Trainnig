package org.sofka.game.view;

import org.sofka.game.Menu;
import org.sofka.game.clases.Game;
import org.sofka.game.clases.Gamer;
import org.sofka.game.clases.Question;
import org.sofka.game.model.MldGamer;
import org.sofka.game.model.MldQuestion;
import org.sofka.game.utils.Messages;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String separator= "\n==================================================";
        int user=0;

        Random r = new Random();

        MldGamer mldGamer= new MldGamer();
        MldQuestion mldQuestion= new MldQuestion();
        Scanner input= new Scanner(System.in);
        Menu menu= new Menu();



        do {
            user=menu.printMainMenu(separator);


            switch (user) {
                case 1 -> {
                    Messages.printMessage("\n\n\t\t\t\t\t\t\t+Game" + separator);
                    Game game = new Game();
                    Gamer gamer= game.getGamer();
                    mldGamer.createGamer(gamer);

                }
                case 2 -> {
                    Messages.printMessage("\n\n\t\t\t\t+Gamers" + separator);
                    ArrayList[] gamers= mldGamer.allGamers();
                    menu.renderGamers(gamers);



                }
                case 3 -> {


                }
                case 4 ->{
                    Messages.printMessage("\n\nThe program is over \n\nCreated By:\t< Nestor Quiroga -- Victor Roca/>");
                }
                default -> {
                    Messages.printWarning("\nInput a valid value\n");
                }
            }
        }while(user != 4);

    }



}
