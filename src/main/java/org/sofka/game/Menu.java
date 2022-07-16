package org.sofka.game;

import org.sofka.game.utils.Messages;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {



    public int printMainMenu(String separator) {
        try {
            int user;
            Messages.printMessage("\n\t\tWHO WANTS MILLIONAIRE ? | MAIN MENU" + separator+
                "\n| 1. Start Game: (1)"+
                "\n| 2. View Winners: (2)"+
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

}
