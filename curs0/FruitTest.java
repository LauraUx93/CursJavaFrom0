package curs0;

public class FruitTest {
    public static void main(String[] args) {
        Fruit genericFruit = new Fruit("GenericFruit", "Neutral");
        Banana banana = new Banana("Sweet");
        Mango mango = new Mango("Sweet and Juicy");

        // Demonstrate overriding
        genericFruit.eat();
        banana.eat();
        mango.eat();
    }
}
