package curs0;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class tema7 {
    public static void main(String[] args) {
        //Declara o lista note_muzicale in care sa pui do re mi etc pana la do
        //Afiseaz-o
        String[] noteMuzicale = {"Do", "Re", "Mi", "Fa", "Sol", "La", "Si", "Do"};

        System.out.println("Lista de note muzicale:");
        for (String nota : noteMuzicale) {
            System.out.println(nota);
        }

        //2. Printeaza De cate ori apare ‘do’?
        int numarAparitiiDo = 0;
        for (String nota : noteMuzicale) {
            if (nota.equals("Do")) {
                numarAparitiiDo++;
            }
        }
        System.out.println("'Do' apare de: " + numarAparitiiDo + " ori");

        //3.Avand 2 liste, [3, 1, 0, 2] si [6, 5, 4]
        //Gasiti o variante sa le uniti intr-o singura lista.
        //Varianta 1
        int[] lista1 = {3, 1, 0, 2};
        int[] lista2 = {6, 5, 4};

        int lungimeListaUnificata = lista1.length + lista2.length;
        int[] listeUnite = new int[lungimeListaUnificata];

        for (int i = 0; i < lista1.length; i++) {
            listeUnite[i] = lista1[i];
        }
        for (int i = 0; i < lista2.length; i++) {
            listeUnite[lista1.length + i] = lista2[i];
        }
        System.out.print("Lista unita: [");
        for (int i = 0; i < listeUnite.length; i++) {
            System.out.print(listeUnite[i]);
            if (i < listeUnite.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        //Varianta 2
        List<Integer> lista1a = List.of(3, 1, 0, 2);
        List<Integer> lista2a = List.of(6, 5, 4);
        List<Integer> listaUnita = new ArrayList<>(lista1a);
        listaUnita.addAll(lista2a);
        System.out.println("Lista unita: " + listaUnita);

        //4.Sortati lista si apoi sa o printati
        //Stergeti numarul 0 folosind o functie ce primeste ca parametru o lista si elementul care trebuie sters
        //Afisati iar lista
        List<Integer> lista = new ArrayList<>(List.of(3, 1, 0, 2, 6, 5, 4));
        lista.sort(null);
        System.out.println("Lista sortata: " + lista);
        stergeElement(lista, 0);
        System.out.println("Lista dupa stergerea elementului 0: " + lista);

        // 5.Afisati maximul si minimul din lista
        //Varianta 1
        System.out.println("Maximul din lista: " + Collections.max(lista));
        System.out.println("Minimul din lista: " + Collections.min(lista));
        //Varianta 2
        System.out.println("Maximul din lista: " + gasesteMaximul(lista));
        System.out.println("Minimul din lista: " + gasesteMinimul(lista));

        //6.
        //Ne imaginam o echipa de fotbal pt teren sintetic.
        //3 Schimbari maxime admise
        //Declara o Lista cu 5 jucatori
        //Schimbari_efectuate = va jucati voi cu valori diferite
        //Schimbari_max = 3
        //Daca Jucatorul x e in teren si mai avem schimbari la dispozitie
        //Efectuam schimbarea
        //Stergem jucatorul scos din lista
        //Adaugam jucatorul intrat
        //Afisam a intra x, a iesit y, mai aveti z schimbari
        //Daca jucatorul nu e in teren:
        //Afisati ‘ nu se poate efectua schimbarea deoarece jucatorul x nu e in teren’
        //Afisati ‘mai aveti z schimbari’
        List<String> jucatoriInTeren = new ArrayList<>(List.of("Jucator1", "Jucator2", "Jucator3", "Jucator4", "Jucator5"));
        List<String> jucatoriPeBanca = new ArrayList<>(List.of("Schimbat1", "Schimbat2", "Schimbat3"));

        int schimbariMaxime = 3;

        afiseazaStare(jucatoriInTeren, jucatoriPeBanca, schimbariMaxime);
        efectueazaSchimbare(jucatoriInTeren, jucatoriPeBanca, schimbariMaxime, "Schimbat1", "Jucator1");
        afiseazaStare(jucatoriInTeren, jucatoriPeBanca, schimbariMaxime);
        efectueazaSchimbare(jucatoriInTeren, jucatoriPeBanca, schimbariMaxime-1, "Schimbat3", "Jucator3");
        afiseazaStare(jucatoriInTeren, jucatoriPeBanca, schimbariMaxime);
        efectueazaSchimbare(jucatoriInTeren, jucatoriPeBanca, schimbariMaxime, "Schimbat2", "Jucator2");
        afiseazaStare(jucatoriInTeren, jucatoriPeBanca, schimbariMaxime);
//        efectueazaSchimbare(jucatoriInTeren, jucatoriPeBanca, schimbariMaxime, "Schimbat1", "Jucator1");
//        afiseazaStare(jucatoriInTeren, jucatoriPeBanca, schimbariMaxime);



    }
    public static void stergeElement(List<Integer> lista, int element) {
        lista.removeIf(e -> e.equals(element));
    }
    public static int gasesteMaximul(List<Integer> lista) {
        int maxim = Integer.MIN_VALUE;

        for (int numar : lista) {
            if (numar > maxim) {
                maxim = numar;
            }
        }

        return maxim;
    }
    public static int gasesteMinimul(List<Integer> lista) {
        int minim = Integer.MAX_VALUE;

        for (int numar : lista) {
            if (numar < minim) {
                minim = numar;
            }
        }

        return minim;
    }
    public static void afiseazaStare(List<String> jucatoriInTeren, List<String> jucatoriPeBanca, int schimbariRamase) {
        System.out.println("Jucatori in teren: " + jucatoriInTeren);
        System.out.println("Jucatori pe banca: " + jucatoriPeBanca);
        System.out.println("Schimbari ramase: " + schimbariRamase);
        System.out.println();
    }

    public static void efectueazaSchimbare(List<String> jucatoriInTeren, List<String> jucatoriPeBanca, int schimbariRamase, String intrat, String iesit) {
        if (jucatoriInTeren.contains(iesit) && schimbariRamase > 0) {
            jucatoriInTeren.remove(iesit);
            jucatoriInTeren.add(intrat);
            schimbariRamase--;

            System.out.println("A intrat " + intrat + ", a iesit " + iesit +
                    ", mai aveti " + schimbariRamase + " schimbari.");
        } else if (!jucatoriInTeren.contains(iesit)) {
            System.out.println("Nu se poate efectua schimbarea deoarece jucatorul " + iesit +
                    " nu e in teren, mai aveti " + schimbariRamase + " schimbari.");
        } else {
            System.out.println("Nu mai aveti schimbari disponibile.");
        }
        System.out.println();
    }
}
