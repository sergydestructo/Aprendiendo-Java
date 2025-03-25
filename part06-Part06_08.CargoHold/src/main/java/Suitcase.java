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
public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int max) {
        this.items = new ArrayList<>();
        this.maxWeight = max;
    }
    
    public void addItem(Item item) {
        int currentWeight = 0;
        for (Item ojeto: this.items) {
            currentWeight = currentWeight + ojeto.getWeight();
        }
        if (currentWeight + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }
     
    public void printItems() {
        for (Item item: this.items) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        int currentWeight = 0;
        for (Item ojeto: this.items) {
            currentWeight = currentWeight + ojeto.getWeight();
        }
        return currentWeight;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item heaviest = this.items.get(0);
        
        for (Item item: this.items) {
            if (heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }
    
    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (" + this.totalWeight() + " kg)";
        }
        if (this.items.size() == 1) {
            return this.items.size() + " item (" + this.totalWeight() + " kg)";
        }
        
        return this.items.size() + " items (" + this.totalWeight() + " kg)";
    }
    
}
