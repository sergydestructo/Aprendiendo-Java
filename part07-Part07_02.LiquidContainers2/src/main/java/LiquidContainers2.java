
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();


        while (true) {
            String input = scan.nextLine();
            if (input.equals("quit")) {               
                break;                
            }
            String[] parts = input.split(" ");
            
            if (parts[0].equals("add")) {
                first.add(Integer.valueOf(parts[1]));
                System.out.println("First: " + first.toString());
                System.out.println("Second: " + second.toString());
            }
            
            if (parts[0].equals("move")) {
                if (first.contains() - Integer.valueOf(parts[1]) <= 0) {
                    second.add(first.contains());
                    first.remove(first.contains());
                } else {
                    second.add(Integer.valueOf(parts[1]));
                    first.remove(Integer.valueOf(parts[1]));
                }
              
              
                System.out.println("First: " + first + "/100");
                System.out.println("Second: " + second + "/100");                                
            }
            
            if (parts[0].equals("remove")) {
                second.remove(Integer.valueOf(parts[1]));
                System.out.println("First: " + first.toString());
                System.out.println("Second: " + second.toString());               
            }
                    
            
            

        }
        System.out.println("First: " + first.toString());
        System.out.println("Second: " + second.toString());        
        

    }

}
