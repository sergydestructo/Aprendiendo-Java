/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sergi
 */
import java.util.ArrayList;
public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    
    public Hold(int max) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = max;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int currentWeight = 0;
        for (Suitcase caja: this.suitcases) {
            currentWeight = currentWeight + caja.totalWeight();
        }
        if (currentWeight + suitcase.totalWeight() <= this.maxWeight) {
            this.suitcases.add(suitcase);
        }
    }
    
    public void printItems() {
        for (Suitcase suitcase: this.suitcases) {
            suitcase.printItems();
        }
    }
    
    public String toString() {
        int currentWeight = 0;
        for (Suitcase caja: this.suitcases) {
            currentWeight = currentWeight + caja.totalWeight();
        }
        return this.suitcases.size() + " suitcases (" + currentWeight + " kg)";
    }
}
