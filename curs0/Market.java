package curs0;

public class Market {
    public static void main(String[] args) {
        Fruit1 genericFruit = new Fruit1(0);
        Apple apple = new Apple();
        Banana1 banana = new Banana1();

        // Polymorphism
        Fruit1[] fruits = {genericFruit, apple, banana};

        for (Fruit1 fruit : fruits) {
            System.out.println("\nCalories: " + fruit.calories);
            fruit.makeJuice();

            if (fruit instanceof Apple) {
                ((Apple) fruit).removeSeeds();
            } else if (fruit instanceof Banana1) {
                ((Banana1) fruit).peel();
            }
        }
    }
}
