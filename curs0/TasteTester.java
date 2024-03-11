package curs0;

public class TasteTester {
    public static void main(String[] args) {
        BirthdayCake birthdayCake = new BirthdayCake("Chocoolate", 20);
        WeddingCake weddingCake = new WeddingCake("Vanilla", 3);

        birthdayCake.setPrice(30.0);
        weddingCake.setPrice(150.0);

        System.out.println("Birthday Cake:");
        System.out.println("Flavor: " + birthdayCake.getFlavor());
        System.out.println("Price: $" + birthdayCake.getPrice());
        System.out.println("Candles: " + birthdayCake.getCandles());

        System.out.println("\nWedding Cake:");
        System.out.println("Flavor: " + weddingCake.getFlavor());
        System.out.println("Price: $" + weddingCake.getPrice());
        System.out.println("Tiers: " + weddingCake.getTiers());
    }
}
