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

public class TextUI {
    private Scanner scan;
    private GradeList grades;
    
    public TextUI(Scanner scanner, GradeList grades) {
        this.scan = scanner;
        this.grades = grades;
    }
    
    public void start() {
        while (true) {
            System.out.println("Enter point total, -1 stops:");
            String input = scan.nextLine();
            
            if (input.equals("-1")) {
                System.out.println("Point average (all): " + grades.pointAverage());
                System.out.println("Point average (passing): " + grades.passingPointAverage());
                System.out.println("Pass percentage: " + grades.passPercentage());
                System.out.println("Grade distribution:");
                printGradeDistribution();
                break;
            }
            
            this.grades.addGrade(Integer.valueOf(input));
        }
        
    }
    
    public void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
    
    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = this.grades.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println("");
            
            grade = grade - 1;
        }
    }
}
