
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeList grades = new GradeList();
        
        
        TextUI ui = new TextUI(scanner, grades);
        
        ui.start();
        
        
        
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
    }
}
