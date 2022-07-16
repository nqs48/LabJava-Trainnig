package org.sofka.game.view;

import org.sofka.game.Menu;
import org.sofka.game.clases.Gamer;
import org.sofka.game.clases.Question;
import org.sofka.game.model.MldGamer;
import org.sofka.game.model.MldQuestion;
import org.sofka.game.utils.Messages;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String separator= "\n==================================================";
        int user=0;

        MldGamer mldGamer= new MldGamer();
        MldQuestion mldQuestion= new MldQuestion();
        Scanner input= new Scanner(System.in);
        Menu menu= new Menu();



        do {
            user=menu.printMainMenu(separator);


            switch (user) {
                case 1 -> {
                    Messages.printMessage("\n\n\t\t\t\t\t\t\t+Game" + separator);
                    String name= input.nextLine();
                    String email= input.nextLine();

                    Gamer g1= new Gamer(name,email);
                    int id=mldGamer.createGamer(g1);
                    Messages.printMessage("El ID es: "+id);


                    ArrayList[] data= mldQuestion.FindQuestions("gamer");

                    Messages.printMessage(data[4].toString()+"\n\n");

                }
                case 2 -> {
                    Messages.printMessage("\n\n\t\t\t\t+Gamers" + separator);
                    ArrayList[] data= mldQuestion.FindQuestions("gamer");
                    for (int i=0 ; i<= data.length; i++){
                        System.out.println(data[i]);
                    }
                }
                case 3 -> {
                    Messages.printMessage("\n\nThe program is over \n\nCreated By:\t< Nestor Quiroga -- Victor Roca/>");;
                }
                default -> {
                    Messages.printWarning("\nInput a valid value\n");
                }
            }
        }while(user != 3);



    }
}
