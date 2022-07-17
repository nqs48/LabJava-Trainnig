package org.sofka.game;

import org.sofka.game.utils.Messages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Nestor Quiroga
 * @author Victor Roca
 * Class Menu
 */
public class Menu {

    /**
     * Prints the main menu.
     * @param separator String with characters for separate lines in the menu
     * @return returns the value corresponding to the option
     */
    public int printMainMenu(String separator) {
        try {
            int user;
            Messages.printMessage("\n\t\tWHO WANTS MILLIONAIRE ? | MAIN MENU" + separator+
                "\n| 1. Start Game: (1)"+
                "\n| 2. View all Gamers: (2)"+
                "\n| 3. EXIT APP: (3)" + separator+
                "\nEnter the number of your process:");
            Scanner inputMain = new Scanner(System.in);
            user = inputMain.nextInt();
            return user;
        } catch (InputMismatchException e) {
            Messages.printError("\n\tIncorrect selection data, try again.\n\nError: \n" + e);
            return 0;
        }
    }

    /**
     * Formatting the information to render in console.
     * @param gamers Arraylist with all gamers
     */
    public void renderGamers(ArrayList[] gamers) {

        String result = String.join(",", Arrays.toString(gamers)).
                replace("]", "\n").
                replace("[", "").
                replace("null","").
                replace(",","");
        Messages.printMessage("\n" +
                "|Id| Name |  Email  | Score |\n____________________________\n"+result);
    }

}
