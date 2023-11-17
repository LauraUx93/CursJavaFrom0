package curs0;

import java.util.Scanner;

public class tema2 {
    public static void main(String[] args){
        //Citim un string de la tastatura (cel putin 10 caractere, si contine litera x)
//        Scanner myObj = new Scanner(System.in);
//        System.out.println("Te rog sa introduci un string ce contine cel putin 10 caractere si litera x:");
//        String newString = myObj.nextLine();
//        System.out.println("Stringul introdus este: " + newString);
//        //Printam un string format din primele 3 litere si ultimele 3
//        System.out.println(newString.substring(0,3) + newString.substring(newString.length() - 3));
//        //Inlocuim litera ‘a’ cu ‘?’ peste tot si printam
//        String replacedString = newString.replace("a", "?");
//        System.out.println(replacedString);
//        //Afisati pe ce pozitie apare litera 'x'
//        System.out.println("Litera x se afla pe pozitia: " + newString.indexOf("x"));
//        //Intr-un if verificati daca prima litera este egala cu ultima. Daca da afisati 'Da'
//        if (newString.substring(0,1).equals(newString.substring(newString.length() - 1))) {
//            System.out.println("Da");
//        }

    /*
    3.  Citim alt string de la tastatura
    4. Verificati intr-un if daca contine doar litere sau nu.*/
//        Scanner myObj2 = new Scanner(System.in);
//        System.out.println("Te rog sa introduci un string:");
//        String newString2 = myObj2.nextLine();
//        System.out.println("Stringul introdus este: " + newString2);
//        if (newString2.matches("[a-zA-z]+")){
//            System.out.println("Stringul contine doar litere");
//        }
    //5. citeste de la tastatura un string de dimensiune impara. afiseaza caracterul din mijloc
//        Scanner myObj = new Scanner(System.in);
//        System.out.println("Te rog sa introduci un string de dimensiune impara:");
//        String newString3 = myObj.nextLine();
//        System.out.println("Stringul introdus este: " + newString3);
//        int middle = newString3.length()/2;
//        System.out.println("Caracterul din mijloc al stringului este: " + newString3.charAt(middle));


    //    6. citeste un string de la tastatura (eg: alabala portocala)
    //    salveaza primul caracter intr-o variabila (indiferent care este el, incearca cu 2 stringuri diferite)
    //    capitalizeaza acest caracter peste tot, mai putin pentru primul si ultimul caracter
    //    => alAbAlA portocAla
        Scanner myObj = new Scanner(System.in);
//        System.out.println("Te rog sa introduci un string de dimensiune impara:");
//        String newString3 = myObj.nextLine();
//        System.out.println("Stringul introdus este: " + newString3);
//        String firstLetter = newString3.substring(0,1);
//        String remainingString = newString3.substring(1, newString3.length() - 1);
//        String capitalizedString = firstLetter + remainingString.replace(firstLetter, firstLetter.toUpperCase()) + newString3.substring(newString3.length() -1);
//        System.out.println("Stringul cu litera capitalizata arata asa: " + capitalizedString);

//        7. 	Verifica si afiseaza daca x este numar natural sau nu
//        System.out.println("Te rog sa introduci un numar:");
//        int x = myObj.nextInt();
//        System.out.println("Numarul introdus este: " + x);
//        if (x > 0){
//            System.out.println("Numarul este natural");
//        } else {
//            System.out.println("Numarul nu este natural");
//        }
////        8. 	Verifica si afiseaza daca x este numar pozitiv, negativ sau neutru
//        if (x == 1 || x == 0){
//            System.out.println("Numarul este neutru");
//        } else if (x > 0){
//            System.out.println("Numarul este pozitiv");
//        } else if (x < 0){
//            System.out.println("Numarul este negativ");
//        }

//        9.	Verifica si afiseaza daca x este intre -2 si 13
//        if (x > -2 && x < 13){
//            System.out.println("Numarul este intre -2 si 13");
//        }
//        10. 	Verifica si afiseaza daca diferenta dintre x si y este mai mica de 5
//        System.out.println("Te rog sa introduci numarul y:");
//        int y = myObj.nextInt();
//        if ((x-y) < 5){
//            System.out.println("Diferenta dintre x si y este mai mica decat 5");
//        }
//        11. 	Verifica daca x NU este intre 5 si 27. (a se folosi ‘not’)
//        if (!(x > 5 && x < 27)){
//            System.out.println("x NU este intre 5 si 27");
//        }
//        12. 	Avem doua numere x si y (int)
//        Verifica si afiseaza daca sunt egale, daca nu afiseaza care din ele este mai mare
//        if (x == y){
//            System.out.println("Numerele sunt egale");
//        } else if (x > y){
//            System.out.println("x este mai mare decat y");
//        } else {
//            System.out.println("y este mai mare decat x");
//        }

//        13..  X, y, z - laturile unui triunghi
//        Afiseaza daca triunghiul este isoscel, echilateral sau oarecare.
//        System.out.println("Te rog sa introduci valoarea pentru latura z:");
//        int z = myObj.nextInt();
//        if (x == y && y == z) {
//            System.out.println("Triunghiul este echilateral");
//        } else if (x == y || y == z || x == z) {
//            System.out.println("Triunghiul este isoscel");
//        } else {
//            System.out.println("Triunghiul este oarecare");
//        }
//        14. Citeste o litera de la tastatura
//        Verifica si afiseaza daca este vocala sau nu
//        System.out.println("Te rog sa introduci o litera:");
//        String litera = myObj.nextLine();
//        if (litera.equals("a") || litera.equals("e") || litera.equals("i") || litera.equals("o") || litera.equals("u")){
//            System.out.println("Litera : " + litera + " este o vocala");
//        }
//        15. Transforma si printeaza notele din sistem romanesc in  >
//        Peste 9 => A
//        Peste 8 => B
//        Peste 7 => C
//        Peste 6 => D
//        Peste 4 => E
//        4 sau sub => F
//        System.out.println("Te rog sa introduci nota:");
//        float nota = myObj.nextFloat();
//        if (nota > 9) {
//            System.out.println("A");
//        } else if (nota > 8) {
//            System.out.println("B");
//        } else if (nota > 7) {
//            System.out.println("C");
//        } else if (nota > 6) {
//            System.out.println("D");
//        } else if (nota > 4) {
//            System.out.println("E");
//        } else {
//            System.out.println("F");
//        }
//        16. Verifica daca x are minim 4 cifre (x e int)
//        (ex: 7895 are 4 cifre, 10 nu are minim 4 cifre)
//        System.out.println("Te rog sa introduci un numar:");
//        int numar1 = myObj.nextInt();
//        if (numar1 >= 1000 && numar1 <= 9999) {
//            System.out.println(numar1 + " are minim 4 cifre.");
//        } else {
//            System.out.println(numar1 + " nu are minim 4 cifre.");
//        }
////        17. Verifica daca x are exact 6 cifre
//        if (numar1 >= 100000 && numar1 < 1000000) {
//            System.out.println(numar1 + " are exact 6 cifre.");
//        } else {
//            System.out.println(numar1 + " nu are exact 6 cifre.");
//        }
////        18. Verifica daca x este numar par sau impar (x e int)
//        if (numar1 % 2 == 0) {
//            System.out.println(numar1 + " este un număr par.");
//        } else {
//            System.out.println(numar1 + " este un număr impar.");
//        }
//        19. x, y, z (int)
//        Afiseaza care este cel mai mare dintre ele?
//        System.out.println("Te rog sa introduci un numar x:");
//        int x = myObj.nextInt();
//        System.out.println("Te rog sa introduci un numar y:");
//        int y = myObj.nextInt();
//        System.out.println("Te rog sa introduci un numar z:");
//        int z = myObj.nextInt();
//        if (y > x) {
//            x = y; // Dacă y este mai mare decât x, actualizăm x cu valoarea lui y
//        }
//        if (z > x) {
//            x = z; // Dacă z este mai mare decât x, actualizăm x cu valoarea lui z
//        }
//        System.out.println("Cel mai mare număr dintre " + x + ", " + y + " și " + z + " este: " + x);

//        20.X, y, z - reprezinta unghiurile unui triunghi
//        Verifica si afiseaza daca triunghiul este valid sau nu
//        if (x + y + z == 180 && x > 0 && y > 0 && z > 0) {
//            System.out.println("Unghiurile " + x + ", " + y + ", " + z + " pot forma un triunghi valid.");
//        } else {
//            System.out.println("Unghiurile " + x + ", " + y + ", " + z + " nu pot forma un triunghi valid.");
//        }
        /*21.
        Verificare imbarcare persoane
        Tineti urmatoarele date
        Varsta
        Insotit de mama
        Insotit de tata
        Pasaport
        Act permisiune mama
        Act permisiune tata
        Conditii de imbarcare
        Daca pers are varsta peste 18 ani si are pasaport
        Daca pers are sub 18 ani, are pasaport si e insotita de ambii parinti
        Daca pers are sub 18 ani, are pasaport, e insotita de cel putin un parinte si are permisiune in scris de la celalat parinte
        Aici vreau sa testati codul cu toate variantele posibile
        Sa generati cazuri de test si expected result, apoi sa rulati codul si sa completati actual results
        Ex:
        Varsta 19 ani, nu am pasaport => Nu ma pot imbarca
        Varsta 17 ani, am pasaport, ambii parinti => Ma pot imbarca
        Etc*/
//        System.out.println("Te rog sa introduci varsta ta:");
//        int varsta = myObj.nextInt();
//        System.out.println("Aveti pasaport?(true/false)");
//        boolean pasaport = myObj.nextBoolean();
//        System.out.println("Insotit de mama?(true/false)");
//        boolean insotitMama = myObj.nextBoolean();
//        System.out.println("Insotit de tata?:(true/false)");
//        boolean insotitTata = myObj.nextBoolean();
//        System.out.println("Act permisiune mama?:(true/false)");
//        boolean actPermisiuneMama = myObj.nextBoolean();
//        System.out.println("Act permisiune tata?:(true/false)");
//        boolean actPermisiuneTata = myObj.nextBoolean();
//        if ((varsta >= 18 && pasaport) || (varsta < 18 && pasaport && (insotitMama && insotitTata) || (insotitMama || insotitTata) && (actPermisiuneMama || actPermisiuneTata))) {
//            System.out.println("Persoana se poate îmbarca.");
//        } else {
//            System.out.println("Persoana nu se poate îmbarca.");
//        }
        /*
    22. Joc ghicit zarul
    Cauta pe net si vezi cum se genereaza un numar random
    Ne imaginam ca dam cu zarul si salvam acest numar in dice_roll
    Luati un nr ghicit de la utilizator
    Verificati si afisati daca utilizatorul a ghicit
    3 optiuni
    Ai pierdut. Ai ales un numar mai mic. Ai ales x dar a fost y
    Ai pierdut. Ai ales un numar mai mare. Ai ales x dar a fost y
    Ai ghicit. Felicitari? Ai ales x si zarul a fost y
    */
        // Simulăm aruncarea zarului și salvăm rezultatul
        int dice_roll = (int) (Math.random() * 6) + 1;

        // Luăm un număr ghicit de la utilizator
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ghiceste numarul de pe zar (1-6): ");
        int ghicesteNumar = scanner.nextInt();

        // Verificăm și afișăm dacă utilizatorul a ghicit numărul de pe zar
        if (ghicesteNumar < 1 || ghicesteNumar > 6) {
            System.out.println("Ai ales un numar invalid.");
        } else {
            if (ghicesteNumar < dice_roll) {
                System.out.println("Ai pierdut. Ai ales un numar mai mic. Ai ales " + ghicesteNumar + " dar a fost " + dice_roll);
            } else if (ghicesteNumar > dice_roll) {
                System.out.println("Ai pierdut. Ai ales un numar mai mare. Ai ales " + ghicesteNumar + " dar a fost " + dice_roll);
            } else {
                System.out.println("Ai ghicit. Felicitari! Ai ales " + ghicesteNumar + " si zarul a fost " + dice_roll);
            }
        }
        scanner.close();
    }
}
