package org.sofka.game.view;

import org.sofka.game.Menu;
import org.sofka.game.clases.Game;
import org.sofka.game.clases.Gamer;
import org.sofka.game.clases.Question;
import org.sofka.game.model.MldGamer;
import org.sofka.game.model.MldQuestion;
import org.sofka.game.utils.Messages;

import java.util.ArrayList;
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
                    ArrayList[] questions = game.getQuestions();
                    for (int i = 0; i < questions.length; i++) {
                        Question question = new Question(questions[i]);
                        System.out.println(question.getQuestionText());
                        question.showQuestionInformation();
                        System.out.println(question.getTemporalOptions());
                        System.out.println("Tu respuesta: ");
                        String answer = input.nextLine();
                        if (question.validateAnswer(answer)) {
                            System.out.println("Correcto");
                            continue;
                        } else {
                            System.out.println("Incorrecto");
                            break;
                        }
                    }
                }






                case 2 -> {
                    Messages.printMessage("\n\n\t\t\t\t+Gamers" + separator);
                    ArrayList[] gamers= mldGamer.allGamers();
                    menu.renderGamers(gamers);



//                    ArrayList[] data= mldQuestion.FindQuestions(1);
////                    for (int i=0 ; i<= data.length; i++){
////                        System.out.println(data[i]);
////                    }
//
//                    ArrayList pregunta= data[4];
//                    Question question = new Question(pregunta);
//                    System.out.println(question.getQuestionInformation());
//                    question.showQuestionInformation();
//                    System.out.println(question.getTemporalOptions());
//                    System.out.println("Respuesta");
//                    String res= input.nextLine();
//
//                    System.out.println(question.validateAnswer(res));


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
