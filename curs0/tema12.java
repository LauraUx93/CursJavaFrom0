package curs0;

import java.util.*;

public class tema12 {
    public static void main(String[] args) {
        /*Students were given a pop quiz, and collectively, they didn’t do so great. As a result, the instructor decided to give them a make-up exam to allow them to improve their scores. Given two maps of test scores, update the student’s grades only if they did better on the make-up exam. Print the final grades.*/
        int[] originalScores = {80, 65, 75, 90, 85};
        int[] makeUpScores = {85, 70, 80, 95, 90};
        char[] grades = {'A', 'B', 'C', 'D', 'E'};

        for (int i = 0; i < originalScores.length; i++) {
            if (makeUpScores[i] > originalScores[i]) {
                grades[i] = calculateGrade(makeUpScores[i]);
            }
        }
        System.out.println("Final Grades:");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + grades[i]);
        }

        /*Avand dictionarul dict1 = {'Ana' : 8, 'Gigel' : 10, 'Dorel' : 5}
        Folositi o functie ca sa afisati Elevii (cheile)

        Printati cei 3 elevi si notele lor
        Ex: ‘Ana a luat nota {x}’
        Doar nota o veti lua folosindu-va de cheie
        Dorel a facut contestatie si a primit 6
        Modificati nota lui Dorel in 6
        Printati nota dupa modificare
        Gigel se transfera din clasa
        Cautati o functie care sa il stearga
        Vine un coleg nou. Adaugati Ionica, cu nota 9
        Printati noii elevi
        */
        HashMap<String, Integer> dict1 = new HashMap<>();
        dict1.put("Ana", 8);
        dict1.put("Gigel", 10);
        dict1.put("Dorel", 5);

        System.out.println("Elevii sunt: " + dict1.keySet());

        for (String elev : dict1.keySet()) {
            System.out.println(elev + " a luat nota " + dict1.get(elev));
        }

        dict1.put("Dorel", 6);

        System.out.println("Dupa contestatie, nota lui Dorel este: " + dict1.get("Dorel"));

        dict1.remove("Gigel");

        System.out.println("Dupa transferul lui Gigel, elevii sunt: " + dict1.keySet());

        dict1.put("Ionica", 9);

        System.out.println("Dupa adaugarea lui Ionica, elevii sunt: " + dict1.keySet());

        /*Set
        zile_sapt = {'luni', 'marti', 'miercuri', 'joi', 'vineri', 'sambata', 'duminica'}
        weekend = {'sambata', 'duminica'}
        Adaugati in zilele_sapt ‘luni’
        Afisati zile_sapt
        */
        Set<String> zile_sapt = new HashSet<>();
//
//        zile_sapt.add("luni");
        zile_sapt.add("marti");
        zile_sapt.add("miercuri");
        zile_sapt.add("joi");
        zile_sapt.add("vineri");
        zile_sapt.add("sambata");
        zile_sapt.add("duminica");

        Set<String> weekend = new HashSet<>();
        weekend.add("sambata");
        weekend.add("duminica");

        zile_sapt.add("luni");

        System.out.println("Zilele săptămânii sunt: " + zile_sapt);

        /*Ne imaginam o echipa de fotbal pt teren sintetic.
        3 Schimbari maxime admise
        Declara o Lista cu 5 jucatori
        Schimbari_efectuate = va jucati voi cu valori diferite
        Schimbari_max = 3
        Daca Jucatorul x e in teren si mai avem schimbari la dispozitie
        Efectuam schimbarea
        Stergem jucatorul scos din lista
        Adaugam jucatorul intrat
        Afisam a intra x, a iesit y, mai aveti z schimbari
        Daca jucatorul nu e in teren:
        Afisati ‘ nu se poate efectua schimbarea deoarece jucatorul x nu e in teren’
        Afisati ‘mai aveti z schimbari’
        Testati codul cu diferite valori
        */
        List<String> listaJucatori = new ArrayList<>();
        listaJucatori.add("Jucator1");
        listaJucatori.add("Jucator2");
        listaJucatori.add("Jucator3");
        listaJucatori.add("Jucator4");
        listaJucatori.add("Jucator5");

        int schimbariEfectuate = 0;
        int schimbariMaxime = 3;

        String jucatorInTeren = "Jucator1";

        if (listaJucatori.contains(jucatorInTeren) && schimbariEfectuate < schimbariMaxime) {
            String jucatorIesit = jucatorInTeren;
            String jucatorIntrat = "JucatorNou";
            listaJucatori.remove(jucatorIesit);
            listaJucatori.add(jucatorIntrat);
            schimbariEfectuate++;
            System.out.println("A intrat " + jucatorIntrat + ", a iesit " + jucatorIesit + ", mai aveti " + (schimbariMaxime - schimbariEfectuate) + " schimbari.");
        } else if (!listaJucatori.contains(jucatorInTeren)) {
            System.out.println("Nu se poate efectua schimbarea deoarece jucatorul " + jucatorInTeren + " nu este in teren.");
            System.out.println("Mai aveti " + (schimbariMaxime - schimbariEfectuate) + " schimbari.");
        } else {
            System.out.println("Nu mai aveti schimbari disponibile.");
        }
    }
    public static char calculateGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'E';
        }
    }
}


