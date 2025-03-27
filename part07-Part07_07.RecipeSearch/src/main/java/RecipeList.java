/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sergiogmc2001
 */
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class RecipeList {

    private ArrayList<Recipe> list;
    private File file;

    public RecipeList(String file) {
        this.list = new ArrayList<>();
        this.file = new File(file);
    }
    
    public void readFile() {
        try (Scanner scanner = new Scanner(this.file)) {
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                int time = Integer.valueOf(scanner.nextLine());
                
                Recipe recipe = new Recipe(name, time);
                while (!(scanner.nextLine().isEmpty())) {
                    recipe.addIngredients(scanner.nextLine());
                }
                this.list.add(recipe);
            }
        
        } catch (FileNotFoundException e) {
            
        }
    }
    
    public void getList() {
        for  (Recipe recipe: this.list) {
            recipe.getName();
        }
    }

    public void addRecipe() {
        
    }

}
