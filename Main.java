package oop.lsp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Moveable penguin = new Penguin();
        Flyable sparrow = new Sparrow();
        Moveable ostrich = new Ostrich();
        Flyable eagle = new Eagle();

        List<Moveable> movingBirds = new ArrayList<>();
        movingBirds.add(penguin);
        movingBirds.add(sparrow); 
        movingBirds.add(ostrich);
        movingBirds.add(eagle); 

        System.out.println("All birds moving:");
        for (Moveable bird : movingBirds) {
            bird.move(); 
        }

        
        List<Flyable> flyingBirds = new ArrayList<>();
        flyingBirds.add(sparrow);
        flyingBirds.add(eagle);

        System.out.println("\nFlying birds:");
        for (Flyable bird : flyingBirds) {
            bird.move(); 
            bird.fly(); 
            System.out.println(); 
        }

        demonstrateLSP(sparrow); 
        demonstrateLSP(eagle); 
    }

    public static void demonstrateLSP(Moveable moveable) {
        System.out.println("Demonstrating LSP with " + moveable.getClass().getSimpleName());
        moveable.move();

        if (moveable instanceof Flyable) {
            ((Flyable) moveable).fly();
        }
        System.out.println(); 
    }
}
