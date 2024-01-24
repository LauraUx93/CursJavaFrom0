package curs0;

import java.util.Scanner;

public class tema6 {
    public static void main(String[] args) {
        //1.
        int result = countNumbersDivisibleBy67WithRemainder23();
        System.out.println("Numarul total de numere de patru cifre divizibile cu 67 și cu restul 23 este: " + result);

        //2.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti un numar intreg: ");
        int number = scanner.nextInt();
        displayDivisors(number);

        scanner.close();

        //3.
        int a = 5;
        int b = 10;
        int c = 8;

        calculateAndDisplayResults(a, b, c);

        //4.
        String inputString = "Exemplu de sir";

        boolean containsA = containsLetterA(inputString);

        System.out.println("Sirul contine litera 'A': " + containsA);

        //5.
        generateSeries1();
        generateSeries2();
        generateSeries3();

        //6.
        int startRange = 10;
        int endRange = 50;

        System.out.println("Prime numbers in the range [" + startRange + ", " + endRange + "]:");
        printPrimesInRange(startRange, endRange);
    }
    public static int countNumbersDivisibleBy67WithRemainder23() {
        int counter = 0;

        for (int i = 1000; i <= 9999; i++) {
            if (i % 67 == 23) {
//                System.out.println(i);
                counter++;
            }
        }

        return counter;
    }

    public static void displayDivisors(int number) {
        System.out.println("Divizorii numarului " + number + " sunt:");

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void calculateAndDisplayResults(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        double average = (a + b + c) / 3.0;

        System.out.println("Maximul: " + max);
        System.out.println("Minimul: " + min);
        System.out.println("Media aritmetica: " + average);
    }

    public static boolean containsLetterA(String input) {
        boolean containsA = false;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'A' || input.charAt(i) == 'a') {
                containsA = true;
                break;
            }
        }
        return containsA;
    }

    public static void generateSeries1() {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i % 2 != 0) {
                    System.out.print("- ");
                } else {
                    if (j % 2 != 0) {
                        System.out.print("+ ");
                    } else {
                        System.out.print("- ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void generateSeries2() {

        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print("  ");
            }

            for (int j = rows; j >= i; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = 2; i <= rows; i++) {
            for (int k = rows - 1; k >= i; k--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void generateSeries3() {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int k = rows - i; k > 0; k--) {
                System.out.print(" ");
            }

            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            num = 2 * i - 2;
            for (int j = 1; j < i; j++) {
                System.out.print(num);
                num--;
            }

            System.out.println();
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimesInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
