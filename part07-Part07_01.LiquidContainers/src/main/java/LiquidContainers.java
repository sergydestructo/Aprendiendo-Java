
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;


        while (true) {
            String input = scan.nextLine();
            if (input.equals("quit")) {               
                break;                
            }
            String[] parts = input.split(" ");
            
            if (parts[0].equals("add")) {
                if (first + Integer.valueOf(parts[1]) <= 100) {
                    first = first + Integer.valueOf(parts[1]);
                } else {
                    first = 100;
                }
                System.out.println("First: " + first + "/100");
                System.out.println("Second: " + second + "/100");
            }
            
            if (parts[0].equals("move")) {
                if (first - Integer.valueOf(parts[1]) <= 0) {
                    second = second + first;
                    first = 0;
                } else {
                    second = second + Integer.valueOf(parts[1]);
                    first = first - Integer.valueOf(parts[1]);
                }
                
                if (second >= 100) {
                    second = 100;
                }
                System.out.println("First: " + first + "/100");
                System.out.println("Second: " + second + "/100");
            }
            
            if (parts[0].equals("remove")) {
                if (second - Integer.valueOf(parts[1]) <= 0) {
                    second = 0;
                } else {
                    second = second - Integer.valueOf(parts[1]);
                }
                System.out.println("First: " + first + "/100");
                System.out.println("Second: " + second + "/100");                
            }
                    
            
            

        }
        
        System.out.println("First: " + first + "/100");
        System.out.println("Second: " + second + "/100");
    }

}
