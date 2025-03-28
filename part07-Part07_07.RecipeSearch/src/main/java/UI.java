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

    private final Scanner scanner;
    private RecipeList recipes;

    public UI(Scanner scanner) {
        this.scanner = scanner;
        this.recipes = null;
    }

    public void start() {
        System.out.print("File to read: ");
        String file = this.scanner.nextLine();
            
        this.recipes = new RecipeList(file);
        this.recipes.addRecipes();
        while (true) {         
            System.out.println("Commands:\n"
                    + "list - lists the recipes\n"
                    + "stop - stops the program \n"
                    + "find name - searches recipes by name \n"
                    + "find cooking time - searches recipes by cooking time \n");

            System.out.print("Enter command: ");
            String input = this.scanner.nextLine();

            if (input.equals("list")) {
                System.out.println("Recipes:");
                this.recipes.getList();
                System.out.println("");

            } else if (input.equals("find name")) {
                System.out.print("Searched word: ");
                input = this.scanner.nextLine();
                System.out.println("Recipes:");
                this.recipes.findByName(input);
                System.out.println("");

            } else if (input.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int intInput = Integer.parseInt(this.scanner.nextLine());
                System.out.println("Recipes:");
                this.recipes.findByTime(intInput);
                System.out.println("");

            } else if (input.equals("stop")) {
                break;
            }
        }
    }
}
