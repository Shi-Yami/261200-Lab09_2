package oop.lsp;

public class Main {
    public static void main(String[] args) {
        // Create different bird types
        Moveable penguin = new Penguin();
        Flyable sparrow = new Sparrow();
        Moveable ostrich = new Ostrich();
        Flyable eagle = new Eagle();

        System.out.println("Demonstrating LSP with different birds:");
        System.out.println("========================================");


        demonstrateMovement(penguin);
        demonstrateMovement(sparrow);
        demonstrateMovement(ostrich);
        demonstrateMovement(eagle);

        System.out.println("Demonstrating flying birds:");
        System.out.println("===========================");

        demonstrateFlying(sparrow);
        demonstrateFlying(eagle);

        System.out.println("Using Flyable as Moveable (LSP in action):");
        System.out.println("===========================================");
        useAsMoveable(sparrow);
        useAsMoveable(eagle);
    }

    public static void demonstrateMovement(Moveable moveable) {
        System.out.print(moveable.getClass().getSimpleName() + ": ");
        moveable.move();
    }

    public static void demonstrateFlying(Flyable flyable) {
        System.out.print(flyable.getClass().getSimpleName() + ": ");
        flyable.move();
        System.out.print(flyable.getClass().getSimpleName() + ": ");
        flyable.fly();
        System.out.println();
    }

    public static void useAsMoveable(Moveable moveable) {
        System.out.print("Using " + moveable.getClass().getSimpleName() + " as Moveable: ");
        moveable.move();
    }
}
