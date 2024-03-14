package curs0;

public class CarRunner {
    public static void main(String[] args) {
        // Creating three Car objects
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        // Assigning user-defined values
        System.out.println("Enter details for Car 1:");
        car1.assignValues();

        System.out.println("\nEnter details for Car 2:");
        car2.assignValues();

        System.out.println("\nEnter details for Car 3:");
        car3.assignValues();

        // Displaying the data
        System.out.println("\nCar 1 Details:");
        car1.display();

        System.out.println("\nCar 2 Details:");
        car2.display();

        System.out.println("\nCar 3 Details:");
        car3.display();
    }
}
