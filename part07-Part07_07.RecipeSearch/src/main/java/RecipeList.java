/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sergiogmc2001
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeList {

    private ArrayList<Recipe> list;
    private File file;

    public RecipeList(String file) {
        this.list = new ArrayList<>();
        this.file = new File(file);
    }
    
    public void addRecipes() {
        try (Scanner scanner = new Scanner(this.file)) {
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                int time = Integer.valueOf(scanner.nextLine());
                
                Recipe recipe = new Recipe(name, time);
                String ingredient = scanner.nextLine();
                while (!(ingredient.isEmpty())) {
                    recipe.addIngredients(ingredient);
                    
                    if (!(scanner.hasNextLine())) {
                        break;
                    }
                    ingredient = scanner.nextLine();
                }             
                this.list.add(recipe);
            }
        
        } catch (FileNotFoundException e) {
            
        }
    }
    
    public void getList() {
        for  (Recipe recipe: this.list) {
            printRecipe(recipe.getName(), recipe.getTime());
        }
    }

    public void findByName(String name) {
        for (Recipe recipe: this.list) {

            if (recipe.getName().contains(name)) {
                printRecipe(recipe.getName(), recipe.getTime());
            } else {
            }
        }
    }

    public void findByTime(int time) {
        for (Recipe recipe: this.list) {
            if (recipe.getTime() <= time) {
                printRecipe(recipe.getName(), recipe.getTime());
            }

        }
    }

    public void findByIngredient(String input) {
        for (Recipe recipe: this.list) {
            for (Object ingredient : recipe.getIngredients()) {
                if (ingredient.equals(input)) {
                    printRecipe(recipe.getName(), recipe.getTime());
                    break;
                }
            }
        }

    }

    public void printRecipe(String name, int time) {
        System.out.println(name + ", cooking time: " + time);
    }

}
