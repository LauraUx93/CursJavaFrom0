package curs0;

public class tema10 {

    /*
    Write a Java program to create a base class Animal with methods eat() and sound(). Create three subclasses: Lion, Tiger, and Panther. Override the eat() method in each subclass to describe what each animal eats. In addition, override the sound() method to make a specific sound for each animal.*/
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        Animal panther = new Panther();

        lion.eat();
        lion.sound();

        tiger.eat();
        tiger.sound();

        panther.eat();
        panther.sound();

        /*Write a Java program to create a base class Shape with methods draw() and calculateArea(). Create three subclasses: Circle, Square, and Triangle. Override the draw() method in each subclass to draw the respective shape, and override the calculateArea() method to calculate and return the area of each shape.*/
        Shape1 circle = new Circle1(5);
        Shape1 square = new Square1(4);
        Shape1 triangle = new Triangle1(3, 6);

        circle.draw();
        System.out.println("Area of Circle: " + circle.calculateArea());

        square.draw();
        System.out.println("Area of Square: " + square.calculateArea());

        triangle.draw();
        System.out.println("Area of Triangle: " + triangle.calculateArea());

        /*Write a Java program to create an abstract class GeometricShape with abstract methods area() and perimeter(). Create subclasses Triangle and Square that extend the GeometricShape class and implement the respective methods to calculate the area and perimeter of each shape.*/
        Triangle2 triangle1 = new Triangle2(3, 4, 5);
        Square2 square1 = new Square2(4);

        // Displaying the area and perimeter of the triangle
        System.out.println("Triangle - Area: " + triangle1.area() + ", Perimeter: " + triangle1.perimeter());

        // Displaying the area and perimeter of the square
        System.out.println("Square - Area: " + square1.area() + ", Perimeter: " + square1.perimeter());
    }
}

class Animal {
    public void eat() {
        System.out.println("This animal eats something.");
    }

    public void sound() {
        System.out.println("This animal makes a sound.");
    }
}

class Lion extends Animal {
    @Override
    public void eat() {
        System.out.println("The lion eats meat.");
    }

    @Override
    public void sound() {
        System.out.println("The lion roars.");
    }
}

class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("The tiger eats meat and occasionally hunts other animals.");
    }

    @Override
    public void sound() {
        System.out.println("The tiger growls.");
    }
}

class Panther extends Animal {
    @Override
    public void eat() {
        System.out.println("The panther is a carnivore, it eats meat.");
    }

    @Override
    public void sound() {
        System.out.println("The panther makes a fierce sound.");
    }
}
abstract class Shape1 {
    abstract void draw();
    abstract double calculateArea();
}

class Circle1 extends Shape1 {
    private double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Square1 extends Shape1 {
    private double side;

    public Square1(double side) {
        this.side = side;
    }

    @Override
    void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}

class Triangle1 extends Shape1 {
    private double base;
    private double height;

    public Triangle1(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Drawing Triangle");
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

class Fruit1 {
    protected int calories;

    public Fruit1(int calories) {
        this.calories = calories;
    }

    public void makeJuice() {
        System.out.println("Generic juice is made");
    }
}

class Apple extends Fruit1 {
    public Apple() {
        super(95); // Set the calories for an apple
    }

    public void removeSeeds() {
        System.out.println("Seeds removed from the apple");
    }

    @Override
    public void makeJuice() {
        System.out.println("Apple juice is made");
    }
}

class Banana1 extends Fruit1 {
    public Banana1() {
        super(105); // Set the calories for a banana
    }

    public void peel() {
        System.out.println("Banana peeled");
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana smoothie is made");
    }
}

abstract class GeometricShape {
    abstract double area();
    abstract double perimeter();
}

class Triangle2 extends GeometricShape {
    private double side1, side2, side3;

    public Triangle2(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double area() {
        // Using Heron's formula to calculate the area of the triangle
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    double perimeter() {
        return side1 + side2 + side3;
    }
}

class Square2 extends GeometricShape {
    private double side;

    public Square2(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }

    @Override
    double perimeter() {
        return 4 * side;
    }
}