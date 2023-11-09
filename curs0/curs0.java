package curs0;

public class curs0 {
    public static void main(String[] args) {
        System.out.println("curs1");
        System.out.println("curs1new");
        System.out.print("curs10");
//        System.out.print("curs10");
        int vitezaMax = 230;
        final double costMasina = 9.9; // final inseamna ca nu mai putem modifica variabila
        String nota = "A";
        String marcaMasina = "Logan";
        boolean esteInmatriculata = true;
        double sumaDouble = vitezaMax + costMasina;
        System.out.println(vitezaMax);

        System.out.println("Marca masina si viteza Max: " + marcaMasina + vitezaMax);
        System.out.println("Suma double: " + sumaDouble);
        int x,y,z;
        x=y=z=60;
        int a = 5, b = 6, c = 7;
        System.out.println(("Viteza before: " + vitezaMax));
        vitezaMax = 300;
        System.out.println("Viteza after: " + vitezaMax);
//        costMasina = 10; cannot make the change because costMasina is final


        //operatori aritmetici
        // =, -, /, *, %, ++, --
        int rest = 6%5;
        rest += rest;
        rest++;
        rest--;
        System.out.println("Rest: " + rest);

        //operatori de atribuire
        //+=, -=, *=, /=
        rest += 5;
        System.out.println("Rest: " + rest);

        //operatori de comparare
        // ==, !=, >, <, <=, >=

        //operatori logici
        // &&, ||, !
    }
}
