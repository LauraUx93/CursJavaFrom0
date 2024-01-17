package curs0;
import java.util.Scanner;
import java.util.Random;

public class tema4 {
    public static void main(String[] args){
    //1.Write a program to print numbers from 1 to 10.
        int i00 = 1;
        while (i00 <= 10) {
            System.out.println(i00);
            i00++;
        }
        int j00 = 1;
        do {
            System.out.println(j00);
            j00++;
        } while (j00 <= 10);

        //2.Write a program to calculate the sum of first 10 natural number.
        int nr11 = 1;
        int sum11 = 0;
        while (nr11 <= 10) {
            sum11 += nr11;
            nr11++;
        }
        System.out.println("Suma primelor 10 numere naturale este: " + sum11);
        nr11 = 1;
        sum11 = 0;
        do {
            sum11 += nr11;
            nr11++;
        } while (nr11 <= 10);

        System.out.println("Suma primelor 10 numere naturale este: " + sum11);
        //3.Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un numar intreg pozitiv: ");
        int number22 = scanner.nextInt();
        if (number22 > 0) {
            int i = 1;
            System.out.println("Tabelul multiplicarii pentru " + number22 + " este:");
            while (i <= 10) {
                System.out.println(number22 + " x " + i + " = " + (number22 * i));
                i++;
            }
        } else {
            System.out.println("Introduceti un un numar intreg pozitiv.");
        }
        System.out.print("Introduceti un numar intreg pozitiv: ");
        int number9;
        do {
            number9 = scanner.nextInt();
            if (number9 <= 0) {
                System.out.println("Introduceti un numar intreg pozitiv.");
            }
        } while (number9 <= 0);

        int i9 = 1;
        System.out.println("Tabelul inmultirii pentru " + number9 + " este:");
        do {
            System.out.println(number9 + " x " + i9 + " = " + (number9 * i9));
            i9++;
        } while (i9 <= 10);
        //4.Write a program to find the factorial value of any number entered through the keyboard.
        System.out.print("Introduceti un numar pentru a calcula factorialul: ");
        int number = scanner.nextInt();

        if (number >= 0) {
            int factorial = 1;
            int i0 = 1;
            while (i0 <= number) {
                factorial *= i0;
                i0++;
            }
            System.out.println("Factorialul lui " + number + " este: " + factorial);
        } else {
            System.out.println("Introduceti un numar pozitiv sau zero pentru a calcula factorialul.");
        }

        do {
            System.out.print("Introduceți un număr pozitiv sau zero pentru a calcula factorialul: ");
            number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Introduceți un număr pozitiv sau zero.");
            }
        } while (number < 0);
        int factorial = 1;
        int i = 1;
        do {
            factorial *= i;
            i++;
        } while (i <= number);

        System.out.println("Factorialul lui " + number + " este: " + factorial);

        //5.Write a program to print all even numbers between 1 to 100
        int number11 = 1;
        while (number11 <= 100) {
            if (number11 % 2 == 0) {
                System.out.println(number11);
            }
            number11++;
        }
        do {
            if (number11 % 2 == 0) {
                System.out.println(number11);
            }
            number11++;
        } while (number11 <= 100);

        //6.Write a program to print all odd number between 1 to 100
        int nr = 1;
        while (nr <= 100) {
            if (nr % 2 != 0) {
                System.out.println(nr);
            }
            nr++;
        }
        do {
            if (nr % 2 != 0) {
                System.out.println(nr);
            }
            nr++;
        } while (nr <= 100);

        //7.Write a program to find sum of all natural numbers between 1 to n
        System.out.print("Introduceti un numar n pentru a calcula suma numerelor naturale pana la n: ");
        int n = scanner.nextInt();
        int suma = 0;
        int x = 1;
        while (x <= n) {
            suma += x;
            x++;
        }
        System.out.println("Suma numerelor naturale până la " + n + " este: " + suma);
        int suma2 = 0;
        int x2 = 1;
        do {
            suma2 += x2;
            x2++;
        } while (x2 <= n);
        System.out.println("Suma numerelor naturale până la " + n + " este: " + suma2);

        //8.Write a program to find sum of all even numbers between 1 to n
        System.out.print("Introduceti un numar n pentru a calcula suma numerelor pare pana la n: ");
        int nr1 = scanner.nextInt();
        int sum1 = 0;
        int i2 = 1;
        while (i2 <= nr1) {
            if (i2 % 2 == 0) {
                sum1 += i2;
            }
            i2++;
        }
        System.out.println("Suma numerelor pare pana la " + nr1 + " este: " + sum1);
        do {
            if (i2 % 2 == 0) {
                sum1 += i2;
            }
            i2++;
        } while (i2 <= nr1);

        System.out.println("Suma numerelor pare pana la " + nr1 + " este: " + sum1);

        //9.Write a Program to Check Given String is a Palindrome or Not
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Introduceti un string pentru a verifica daca este palindrom: ");
        String str = scanner1.nextLine();
        boolean isPalindrome = true;
        int i8 = 0;
        int j = str.length() - 1;
        while (i8 < j) {
            if (str.charAt(i8) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i8++;
            j--;
        }
        if (isPalindrome) {
            System.out.println("Stringul \"" + str + "\" este un palindrom.");
        } else {
            System.out.println("Stringul \"" + str + "\" nu este un palindrom.");
        }
        do {
            if (str.charAt(i8) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i8++;
            j--;
        } while (i8 < j);

        if (isPalindrome) {
            System.out.println("Stringul \"" + str + "\" este un palindrom.");
        } else {
            System.out.println("Stringul \"" + str + "\" nu este un palindrom.");
        }

        //10.Read a number > 3 digits ;write a program to sum of its Digits
        System.out.print("Introduceti un numar cu mai mult de 3 cifre pentru a calcula suma cifrelor: ");
        int number8 = scanner.nextInt();
        if (number8 > 999) {
            int sum = 0;
            while (number8 != 0) {
                int digit = number8 % 10;
                sum += digit;
                number8 /= 10;
            }
            System.out.println("Suma cifrelor numarului este: " + sum);
        } else {
            System.out.println("Introduceti un numar cu mai mult de 3 cifre.");
        }
        int number0;
        do {
            System.out.print("Introduceti un numar cu mai mult de 3 cifre pentru a calcula suma cifrelor: ");
            number0 = scanner.nextInt();
        } while (number0 <= 999);

        int sum = 0;
        do {
            int digit = number0 % 10;
            sum += digit;
            number0 /= 10;
        } while (number0 != 0);

        System.out.println("Suma cifrelor numarului este: " + sum);

        //11.Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)
        System.out.print("Introduceti numarul de baza: ");
        double base = scanner.nextDouble();
        System.out.print("Introduceti exponentul: ");
        int exponent = scanner.nextInt();
        double result = 1;
        int absExponent = Math.abs(exponent);
        while (absExponent > 0) {
            result *= base;
            absExponent--;
        }
        if (exponent < 0) {
            result = 1 / result;
        }
        System.out.println(base + " ridicat la puterea " + exponent + " este: " + result);

        //12.Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.
        System.out.print("Introduceti un numar intreg: ");
        int number1 = scanner.nextInt();
        int reversedNumber = 0;
        while (number1 != 0) {
            int digit = number1 % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number1 = number1 / 10;
        }
        System.out.println("Numarul inversat este: " + reversedNumber);

        //13.Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
        int evenSum = 0;
        int oddSum = 0;
        System.out.println("Introduceti numere intregi (pentru a incheia introducerea numerelor, introduceti 0):");
        int num;
        while ((num = scanner.nextInt()) != 0) {
            if (num % 2 == 0) {
                evenSum += num; // Adaugă numărul la suma numerelor pare
            } else {
                oddSum += num; // Adaugă numărul la suma numerelor impare
            }
        }
        System.out.println("Suma numerelor pare este: " + evenSum);
        System.out.println("Suma numerelor impare este: " + oddSum);

        //14.Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        char choice;
        do {
            System.out.print("Introduceti un numar: ");
            int number4 = scanner.nextInt();
            if (number4 > 0) {
                positiveCount++;
            } else if (number4 < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
            System.out.print("Doriti sa introduceti un alt numar? (Da = 'Y', Nu = alt caracter): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');
        System.out.println("Numere pozitive introduse: " + positiveCount);
        System.out.println("Numere negative introduse: " + negativeCount);
        System.out.println("Numere zero introduse: " + zeroCount);

        //15.Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered.
        int largest, smallest;
        System.out.println("Introduceti numere intregi (pentru a opri, introduceti orice litera sau simbol):");
        if (scanner.hasNextInt()) {
            int firstNum = scanner.nextInt();
            largest = firstNum;
            smallest = firstNum;
            while (scanner.hasNextInt()) {
                int num1 = scanner.nextInt();
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
        int numberr = 1;
        while (numberr <= 500) {
            int originalNumber = numberr;
            int sum0 = 0;
            int temp = originalNumber;
            int numOfDigits = 0;

            while (temp != 0) {
                numOfDigits++;
                temp /= 10;
            }
            temp = originalNumber;
            while (temp != 0) {
                int digit = temp % 10;

                int power = 1;
                int i1 = 1;
                while (i1 <= numOfDigits) {
                    power *= digit;
                    i1++;
                }
                sum0 += power;
                temp /= 10;
            }
            if (sum0 == originalNumber) {
                System.out.println(originalNumber + " este un numar Armstrong.");
            }
            numberr++;
        }

        //17.Write a program to print Fibonacci series of n terms where n is input by user :
        //0 1 1 2 3 5 8 13 24 .....
        Scanner scanner3 = new Scanner(System.in);

        System.out.print("Introduceti numarul de termeni din seria Fibonacci: ");
        int n2 = scanner3.nextInt();

        int firstTerm = 0, secondTerm = 1;
        int count = 0;

        while (count < n2) {
            if (count <= 1) {
                System.out.print(firstTerm + " ");
            } else {
                int nextTerm = firstTerm + secondTerm;
                System.out.print(nextTerm + " ");
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
            count++;
        }

        //18.Write a program to calculate the sum of following series where n is input by user.
        //1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
        System.out.print("Introduceti valoarea lui n pentru seria: ");
        int n3 = scanner3.nextInt();

        int i3 = 1;
        double sum2 = 0;

        while (i3 <= n3) {
            sum2 += 1.0 / i3;
            i3++;
        }

        System.out.println("Suma seriei pentru n = " + n3 + " este: " + sum2);

        //19.Write a program that generates a random number and asks the user to guess what the number is. If the user's guess is higher than the random number, the program should display "Too high, try again." If the user's guess is lower than the random number, the program should display "Too low, try again." The program should use a loop that repeats until the user correctly guesses the random number.
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        int userGuess;

        System.out.println("Ghiciti numarul generat (intre 1 și 100): ");

        do {
            System.out.print("Introduceti numarul dvs.: ");
            userGuess = scanner.nextInt();

            if (userGuess > randomNumber) {
                System.out.println("Prea mare, incercati din nou.");
            } else if (userGuess < randomNumber) {
                System.out.println("Prea mic, incercati din nou.");
            } else {
                System.out.println("Felicitari! Ati ghicit numarul corect: " + randomNumber);
            }
        } while (userGuess != randomNumber);

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
        int i4 = 1;
        while (i4 <= 4) {
            int j1 = 1;
            while (j1 <= 10) {
                System.out.print("*");
                j1++;
            }
            System.out.println();
            i4++;
        }
        //ii)
        int i5 = 1;
        while (i5 <= 5) {
            int j2 = 1;
            while (j2 <= i5) {
                System.out.print("*");
                j2++;
            }
            System.out.println();
            i5++;
        }
        //iii)
        i5 = 1;
        while (i5 <= 5) {
            int j3 = 1;
            while (j3 <= 5 - i5) {
                System.out.print(" ");
                j3++;
            }
            int k = 1;
            while (k <= i5) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i5++;
        }
        //iv)
        i5 = 1;
        while (i5 <= 5) {
            int j4 = 1;
            while (j4 <= 5 - i5) {
                System.out.print(" ");
                j4++;
            }
            int k = 1;
            while (k <= 2 * i5 - 1) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i5++;
        }
        //v)
        i5 = 1;
        while (i5 <= 5) {
            int j5 = 1;
            while (j5 <= 5 - i5) {
                System.out.print(" ");
                j5++;
            }
            int k = 1;
            while (k <= 2 * i5 - 1) {
                System.out.print(i5);
                k++;
            }
            System.out.println();
            i5++;
        }
        //vi)
        i5 = 1;
        while (i5 <= 5) {
            int j6 = 1;
            while (j6 <= 5 - i5) {
                System.out.print(" ");
                j6++;
            }
            int k = i5;
            while (k >= 1) {
                System.out.print(k);
                k--;
            }
            k = 2;
            while (k <= i5) {
                System.out.print(k);
                k++;
            }
            System.out.println();
            i5++;
        }
    }
    /*

*/
}
