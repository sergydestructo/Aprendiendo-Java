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
    private BirdList list;

    public UI(Scanner scanner, BirdList list) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String input = scanner.nextLine();

            if (input.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine();
                
                this.list.addBird(name, latinName);                
            }
            else if (input.equals("Observation")) {
                System.out.print("Bird? ");
                String bird = scanner.nextLine();
                
                this.list.observe(bird);
            }
            else if (input.equals("All")) {
                this.list.printAll();
            }
            else if (input.equals("One")) {
                System.out.print("Bird? ");
                String bird = scanner.nextLine();
                
                System.out.println(this.list.printOne(bird));
            }
            else if (input.equals("Quit")) {
                break;
            }
            
        }
    }

}
