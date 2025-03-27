/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sergiogmc2001
 */
import java.util.Scanner;

public class UI {

    private Scanner scanner;
    private RecipeFinder recipes;

    public UI(Scanner scanner, RecipeFinder recipes) {
        this.scanner = scanner;
        this.recipes = recipes;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:\n"
                    + "list - lists the recipes\n"
                    + "stop - stops the program");

            System.out.print("Enter command: ");
            String input = this.scanner.nextLine();

            if (input.equals("list")) {
                recipes.list();
            } else if (input.equals("stop")) {
                break;
            }
        }
    }
}
