
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String longestName = "";
        int nameLength = 0;
        int sum = 0;
        int count = 0;
        
        while(!(input.equals(""))) {
            String[] parts = input.split(",");
            count = count + 1;
            sum = sum + Integer.valueOf(parts[1]);
            
            if (nameLength < parts[0].length()) {
                    nameLength = parts[0].length();
                    longestName = parts[0];
                    }
            input = scanner.nextLine();
            
        }
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * sum / count));

    }
}
