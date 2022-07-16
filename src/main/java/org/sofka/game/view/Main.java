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
                    String name= Messages.printMessage("Name: "+input.nextLine());
                    String email= Messages.printMessage("Email: "+input.nextLine());

                    Gamer g1= new Gamer(name,email);
                    //int id=mldGamer.createGamer(g1);
                    //Messages.printMessage("El ID es: "+id);
                    ArrayList[] data= mldQuestion.FindQuestions("questions");
                    ArrayList pregunta= data[0];

                    int userRes =menu.printQuestionMenu(separator,pregunta);
                    String res= pregunta.get(userRes+1).toString();
                    String correctAns=pregunta.get(6).toString();

                    Messages.printMessage("hi"+input.nextLine());
                    if(correctAns.equals(res)){
                        Messages.printMessage("Correct");
                    }else{
                        Messages.printMessage("Incorrect");
                    }

                }
                case 2 -> {
                    Messages.printMessage("\n\n\t\t\t\t+Gamers" + separator);
                    ArrayList[] data= mldQuestion.FindQuestions("questions");
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
