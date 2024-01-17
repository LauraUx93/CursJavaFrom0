package curs0;

import java.util.Random;
import java.util.Scanner;

public class tema5 {
    public static void main(String[] args) {
//        //1.Write a program to print numbers from 1 to 10.
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //2.Write a program to calculate the sum of first 10 natural number.
        int n = 10;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        //3.Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
//        scanner.close();
        if (number > 0) {
            System.out.println("Multiplication table for " + number + ":");
            for (int i = 1; i <= 10; i++) {
                int result = number * i;
                System.out.println(number + " * " + i + " = " + result);
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
        //4.Write a program to find the factorial value of any number entered through the keyboard.
        System.out.print("Enter a number to find its factorial: ");
        int userInput = scanner.nextInt();

        if (userInput >= 0) {
            int factorialResult = 1;
            for (int i = 1; i <= userInput; i++) {
                factorialResult *= i;
            }
            System.out.println("The factorial of " + userInput + " is: " + factorialResult);
        } else {
            System.out.println("Please enter a non-negative number.");
        }

        //5.Write a program to print all even numbers between 1 to 100
        for (int num = 2; num <= 100; num += 2) {
            System.out.println(num);
        }

        //6.Write a program to print all odd number between 1 to 100
        for (int oddNum = 1; oddNum <= 100; oddNum += 2) {
            System.out.println(oddNum);
        }

        //7.Write a program to find sum of all natural numbers between 1 to n
        System.out.print("Enter a value for n: ");
        int n1 = scanner.nextInt();
        if (n1 > 0) {
            int sum1 = 0;
            for (int i = 1; i <= n1; i++) {
                sum1 += i;
            }
            System.out.println("The sum of natural numbers from 1 to " + n1 + " is: " + sum1);
        } else {
            System.out.println("Please enter a positive value for n.");
        }

        //8.Write a program to find sum of all even numbers between 1 to n
        System.out.print("Enter a value for: ");
        int limit = scanner.nextInt();

        if (limit > 0) {
            int result = 0;
            for (int currentNum = 2; currentNum <= limit; currentNum += 2) {
                result += currentNum;
            }
            System.out.println("The sum of even numbers from 1 to " + limit + " is: " + result);
        } else {
            System.out.println("Please enter a positive value for n.");
        }

        //9.Write a Program to Check Given String is a Palindrome or Not
        Scanner scanner3 = new Scanner(System.in);

        System.out.print("Enter a string to check for palindrome: ");
        String inputString = scanner3.nextLine();
        inputString = inputString.toLowerCase();

        boolean isPalindrome = true;
        int length = inputString.length();

        for (int i = 0; i < length / 2; i++) {
            if (inputString.charAt(i) != inputString.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The entered string is a palindrome.");
        } else {
            System.out.println("The entered string is not a palindrome.");
        }

        //10.Read a number > 3 digits ;write a program to sum of its Digits
        System.out.print("Introduceti un numar mai mare de 3 cifre: ");
        int inputNumber = scanner.nextInt();
        if (inputNumber > 999) {
            int sumaa = 0;
            for (int tempNumber = inputNumber; tempNumber != 0; tempNumber /= 10) {
                int digit = tempNumber % 10;
                sumaa += digit;
            }
            System.out.println("Suma cifrelor din numarul introdus este: " + sumaa);
        } else {
            System.out.println("Vă rugam să introduceti un numar mai mare de 3 cifre.");
        }

        //11.Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        if (exponent >= 0) {
            int result = 1;
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
            System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        } else {
            System.out.println("Please enter a non-negative exponent.");
        }

        //12.Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.
        System.out.print("Introduceti un numar intreg: ");
        int inputNumber1 = scanner.nextInt();
        int reversedNumber = 0;
        for (int tempNumber1 = inputNumber1; tempNumber1 != 0; tempNumber1 /= 10) {
            int digit = tempNumber1 % 10;
            reversedNumber = reversedNumber * 10 + digit;
        }
        System.out.println("Numarul cu cifrele inversate este: " + reversedNumber);

        //13.Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
        System.out.print("Enter the number of integers: ");
        int count = scanner.nextInt();
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < count; i++) {
            System.out.print("Enter an integer: ");
            int currentNumber = scanner.nextInt();

            if (currentNumber % 2 == 0) {
                sumEven += currentNumber;
            } else {
                sumOdd += currentNumber;
            }
        }
        System.out.println("Sum of even integers: " + sumEven);
        System.out.println("Sum of odd integers: " + sumOdd);

        //14.Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;
        for (int number0 = 1; number0 != 0; countPositive++) {
            System.out.print("Enter a number (enter 0 to stop): ");
            number0 = scanner.nextInt();
            if (number0 > 0) {
                countPositive++;
            } else if (number0 < 0) {
                countNegative++;
            } else {
                countZero++;
            }
        }
        System.out.println("Count of positive numbers: " + countPositive);
        System.out.println("Count of negative numbers: " + countNegative);
        System.out.println("Count of zero numbers: " + countZero);

        //15.Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered.
        System.out.println("Introduceti numere intregi (pentru a opri, introduceti orice litera sau simbol):");
        int largest, smallest;
        if (scanner.hasNextInt()) {
            int firstNum = scanner.nextInt();
            largest = firstNum;
            smallest = firstNum;
            for (int num1 = firstNum; scanner.hasNextInt(); num1 = scanner.nextInt()) {
                if (num1 > largest) {
                    largest = num1;
                } else if (num1 < smallest) {
                    smallest = num1;
                }
            }

            System.out.println("Cel mai mare numar introdus este: " + largest);
            System.out.println("Cel mai mic numar introdus este: " + smallest);
        } else {
            System.out.println("Nu s-au introdus numere intregi.");
        }

        //16.Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
        //For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
        System.out.println("Armstrong numbers between 1 and 500:");

        for (int number3 = 1; number3 <= 500; number3++) {
            int originalNum = number3;
            int digitCount = 0;
            int temp = number3;

            while (temp != 0) {
                temp /= 10;
                digitCount++;
            }

            temp = number3;
            int sum3 = 0;

            for (int i = 0; i < digitCount; i++) {
                int digit = temp % 10;
                int power = 1;

                for (int j = 0; j < digitCount; j++) {
                    power *= digit;
                }

                sum3 += power;
                temp /= 10;
            }

            if (sum3 == originalNum) {
                System.out.println(originalNum);
            }
        }

        //17.Write a program to print Fibonacci series of n terms where n is input by user :
        //0 1 1 2 3 5 8 13 24 .....
        System.out.print("Introduceti numarul de termeni pentru seria Fibonacci: ");
        int n3 = scanner3.nextInt();

        int firstTerm = 0, secondTerm = 1;

        System.out.println("Seria Fibonacci de " + n3 + " termeni:");

        if (n3 >= 1) {
            System.out.print(firstTerm + " ");
        }
        if (n3 >= 2) {
            System.out.print(secondTerm + " ");
        }

        for (int i = 3; i <= n3; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");

            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        //18.Write a program to calculate the sum of following series where n is input by user.
        //1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Introduceti numarul de termeni pentru serie: ");
        int n4 = scanner2.nextInt();

        double sum4 = 0.0;

        System.out.println("Suma seriei pentru " + n4 + " termeni:");

        for (int i = 1; i <= n4; i++) {
            sum4 += 1.0 / i;
        }

        System.out.println(sum4);

        //19.Write a program that generates a random number and asks the user to guess what the number is. If the user's guess is higher than the random number, the program should display "Too high, try again." If the user's guess is lower than the random number, the program should display "Too low, try again." The program should use a loop that repeats until the user correctly guesses the random number.
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        int userGuess;

        System.out.println("Ghiciti numarul generat (intre 1 și 100): ");

        for (int attempts = 1; ; attempts++) {
            System.out.print("Introduceti ghicirea dvs.: ");
            userGuess = scanner3.nextInt();

            if (userGuess == randomNumber) {
                System.out.println("Felicitari! Ati ghicit corect in " + attempts + " incercari.");
                break;
            } else if (userGuess > randomNumber) {
                System.out.println("Prea mare, incercati din nou.");
            } else {
                System.out.println("Prea mic, incercati din nou.");
            }
        }

        //20.Write a program to print following :
        //
        //i)
        //**********
        //**********
        //**********
        //**********
        //ii)
        //*
        //**
        //***
        //****
        //*****
        //iii)
        //    	*
        //      **
        //    ***
        //  ****
        //*****
        //
        //iv)
        //        *
        //      ***
        //    *****
        //  *******
        //*********
        //v)
        //        1
        //      222
        //    33333
        //  4444444
        //555555555
        //vi)
        //        1
        //      212
        //    32123
        //  4321234
        //543212345
        //

        //i)
        int rows = 4;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //ii)
        for (int i2 = 1; i2 <= 5; i2++) {
            for (int j = 1; j <= i2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //iii)
        for (int i3 = 1; i3 <= 5; i3++) {
            for (int j = 5; j >= 1; j--) {
                if (j > i3) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        //iv)
        for (int i4 = 1; i4 <= 5; i4++) {
            for (int j = 5; j > i4; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i4 * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //v)
        for (int i5 = 1; i5 <= 5; i5++) {
            for (int j = 5; j > i5; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i5 * 2 - 1; k++) {
                System.out.print(i5);
            }
            System.out.println();
        }

        //vi)
        for (int i6 = 1; i6 <= 5; i6++) {
            for (int j = 5; j > i6; j--) {
                System.out.print(" ");
            }
            for (int k = i6; k >= 1; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <= i6; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
        scanner3.close();
        scanner2.close();
        scanner.close();
    }
}
