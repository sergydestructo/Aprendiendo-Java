
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("File to read: ");
        String fileInput = scanner.nextLine();
        
        RecipeFinder searcher = new RecipeFinder(fileInput);
        
        RecipeList list = new RecipeList(fileInput);
        
      /*  UI ui = new UI(scanner, searcher);
        
        ui.start();
      */
      
      list.getList();
        

    }

}
