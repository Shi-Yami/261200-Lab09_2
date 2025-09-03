package oop.lsp;

public class Sparrow implements Flyable {
    @Override
    public void move() {
        System.out.println("Sparrow is hopping");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}
