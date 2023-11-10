package curs0;

public class tema1 {
    public static void main(String[] args){

        //3.Display the sum of 5+10, using two variables: x and y
        int x1 = 5, y = 10;
        System.out.println("The sum is: " + (x1+y));

        /*4.Creați cȃte o variabilă de tipul: string, int și float, după cum urmează:
        Variabila de tip int va reține valoarea 20.
        Variabila de tip float va reține valoarea 10.
        Variabila de tip string reține valoarea “java”.*/
        int a = 20;
        float b = 10;
        String c = "java";

        //5. reads two numbers and multiplies them together and print out their product
        int num1 = 10, num2 = 10;
        int result = num1 * num2;
        System.out.println("The result is: " + result);

        //6. Declarati in 3 variabile pretul a 3 bilete. Salvati in alta varibila suma lor si afisati-o pe ecran
        int price1 = 30, price2 = 80, price3 = 100;
        int sumOfPrices = price1 + price2 + price3;
        System.out.println("Suma preturilor biletelor este: " + sumOfPrices);

        //7. Salvati intr-o variabila suma 142 + 9.38 si afisati-o.
        double variable = 142 + 9.38;
        System.out.println("Suma dintre 142 si 9.38 este: " + variable);

        //8. Declara numele , prenumele
        //afiseaza 'Numele complet are x caractere'
        String nume = "Ungurianu";
        String prenume = "Laura";
        System.out.println("Numele complet are " + nume.length() + " caractere.");

        //9. Declara lungimea, latimea
        // afiseaza 'Aria dreptunghiului este x'
        int lungime = 6;
        int latime = 9;
        System.out.println("Aria dreptunghiului este: " + lungime * latime);

        //10. Write a program to calculate the length of a string.
        // pt "eu merg la mare" ->15
        String firstString = "eu merg la mare";
        String secondString = "abia astept craciunul";
        int lengthOfFirstString = firstString.length();
        int lengthOfSecondString = secondString.length();
        System.out.println("Lungimea stringului este: " + lengthOfFirstString);
        System.out.println("Lungimea stringului este: " + lengthOfSecondString);

        //11. Remove first n characters from a string
        //"Ana are mere" daca n=3 va afisa " are mere"
        String str = "Ana are mere";
        int n = 3;
        System.out.println("Noul string este: " + str.substring(n));

        //12. Avand stringul: 'Coral is either the stupidest animal or the smartest rock'  declarati un int x
        //afiseaza stringul fara ultimele x caractere
        //ex: daca ati ales 7 => 'Coral is either the stupidest animal or the smarte'
        String str1 = "Coral is either the stupidest animal or the smartest rock";
        int x = 7;
        System.out.println("Stringul fara ultimele x caractere: " + str1.substring(0, str1.length() - x) );

        //13. acelasi string -> declara un string nou care sa fie format din primele
        // 5 caractere + ultimele 5 -> printeaza rezultatul
        String first5Char = str1.substring(0,5);
        String last5Char = str1.substring((str1.length() - 5));
        String newStr1 = first5Char + last5Char;
        System.out.println(newStr1);

        //acelasi string -> afisati de cate ori apare cuvantul 'the'-> printeaza rezultatul
        String findStr = "the";
        //Solutie 1
        int count = 0;
        int index = str1.indexOf("the");
        while(index >= 0) {
            index = str1.indexOf("the", index + 1);
            count++;
        }
        System.out.println("Numar aparitii cuvant: " + count);

        // Solutie 2
        int counter = str1.split(findStr, -1).length-1;
        System.out.println("Numar aparitii cuvant: " + counter);

        //acelasi string -> inlocuieste the cu THE peste tot -> printeaza rezultatul
        String stringReplaced = str1.replace("the", "THE");
        System.out.println("String after replace: " + stringReplaced);
    }
}

