/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sergiogmc2001
 */
import java.util.ArrayList;
public class GradeList {
    private ArrayList<Integer> grades;
    private ArrayList<Integer> gradesForStars;
    
    public GradeList() {
        this.grades = new ArrayList<>();
        this.gradesForStars = new ArrayList<>();
    }
    
    public void addGrade(int grade) {
        if (grade <= 100 && grade >= 0) {
            this.grades.add(grade);
            this.gradesForStars.add(pointsToGrade(grade));
        }
    }
    
    public boolean pass(int grade) {
        if (grade >= 50) {
            return true;
        }
        return false;
    }
    
    public double pointAverage() {
        int totalGrades = 0;
        int countGrades = 0;
        
        for (int grade: this.grades) {
            totalGrades = totalGrades + grade;
            countGrades++;
        }
        double average = 1.0 * totalGrades / countGrades;
        return average;
    }
    
    public double passingPointAverage() {
        GradeList passing = new GradeList();
        
        for (int grade: this.grades) {
            if (this.pass(grade)) {
                passing.addGrade(grade);
            }
        }
        
        double average = passing.pointAverage();
        return average;
    }
    
    public double passPercentage() {
        int passing = 0;
        
        for (int grade: this.grades) {
            if (this.pass(grade)) {
                passing++;
            }
        }
        
        double percentage = 100.0 * passing / this.grades.size();
        return percentage;
    }
    
    public int pointsToGrade(int points) {
        int grade = 0;
        
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
        
        return grade;
    }
    
    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received: this.gradesForStars) {
            if (received == grade) {
                count++;
            }
        }
        return count;
    }
}
