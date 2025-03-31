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

public class BirdList {
    private ArrayList<Bird> birds;
    
    public BirdList() {
        this.birds = new ArrayList<>();
    }
    
    public void addBird(String name, String latinName) {
        Bird bird = new Bird(name, latinName);
        this.birds.add(bird);
    }
    
    public void observe(String name) {
        for (Bird bird: this.birds) {
            if (!this.birds.contains(bird)) {
                System.out.println("Not a bird!");
                break;
            }
            
            if (bird.getName().equals(name)) {
                bird.observe();
            }
        }
    }
    
    public String printOne(String name) {
        for (Bird bird: this.birds) {
            if (bird.getName().equals(name)) {
                return bird.toString();
            }
        }
        return "Not a bird!";
    }
    
    public void printAll() {
        for (Bird bird: this.birds) {
            System.out.println(bird.toString());
        }
    }
}


