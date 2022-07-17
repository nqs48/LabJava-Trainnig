package org.sofka.game;

import org.sofka.game.utils.Messages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {



    public int printMainMenu(String separator) {
        try {
            int user;
            Messages.printMessage("\n\t\tWHO WANTS MILLIONAIRE ? | MAIN MENU" + separator+
                "\n| 1. Start Game: (1)"+
                "\n| 2. View all Gamers: (2)"+
                "\n| 3. Search a Gamer: (3)"+
                "\n| 4. EXIT APP: (4)" + separator+
                "\nEnter the number of your process:");
            Scanner inputMain = new Scanner(System.in);
            user = inputMain.nextInt();
            return user;
        } catch (InputMismatchException e) {
            Messages.printError("\n\tIncorrect selection data, try again.\n\nError: \n" + e);
            return 0;
        }
    }

    public int printQuestionMenu(String separator, ArrayList list) {
        String question= list.get(1).toString();
        String answer1= list.get(2).toString();
        String answer2= list.get(3).toString();
        String answer3= list.get(4).toString();
        String answer4= list.get(5).toString();
        String correct= list.get(6).toString();
        list.indexOf("ghjghg");
        try {
            int user;
            Messages.printMessage("\n\t\tWHO WANTS MILLIONAIRE ? | QUESTION MENU" + separator+
                    "\n"+question+
                    "\n| 1."+answer1+" (1)"+
                    "\n| 2."+answer2+" (2)"+
                    "\n| 3."+answer3+" (3)"+
                    "\n| 4."+answer4+" (4)"+
                    "\n| 5. EXIT APP: (5)" + separator+
                    "\nEnter the number of your process:");
            Scanner inputMain = new Scanner(System.in);
            user = inputMain.nextInt();
            return user;
        } catch (InputMismatchException e) {
            Messages.printError("\n\tIncorrect selection data, try again.\n\nError: \n" + e);
            return 0;
        }
    }


    public void renderGamers(ArrayList[] gamers) {

//        for (int i = 0; i < gamers.length; i++) {
//            Messages.printMessage("\n" + gamers[i] + "\n\n");
//
//        }

        String result = String.join(",", Arrays.toString(gamers)).replace("]", "\n").replace("[", "");
        Messages.printMessage(result);

    }

}
