package curs0;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class tema9 {
    public static void main(String[] args) {
    /*
    Clasa Cerc
    Atribute: raza, culoare
    Constructor pt ambele atribute
    Metode:
    descrie_cerc() - va PRINTA culoarea si raza
    aria() - va RETURNA aria
    diametru()
    circumferinta()
     */
        Cerc cerc1 = new Cerc(5.0, "rosu");
        cerc1.descrieCerc();
        System.out.println("Aria: " + cerc1.aria());
        System.out.println("Diametrul: " + cerc1.diametru());
        System.out.println("Circumferinta: " + cerc1.circumferinta());

    /* Clasa Dreptunghi
    Atribute: lungime, latime, culoare
    Constructor pt toate atributele
    Metode:
    descrie()
    aria()
    perimetrul()
    schimba_culoarea(noua_culoare) - aceasta metoda nu returneaza nimic. Ea va lua ca si param o noua culoare si va suprascrie atributul self.culoare. Puteti verifica schimbarea culorii prin apelarea metodei descrie().
    */
        Dreptunghi dreptunghi1 = new Dreptunghi(4.0, 6.0, "albastru");
        dreptunghi1.descrie();
        System.out.println("Aria: " + dreptunghi1.aria());
        System.out.println("Perimetrul: " + dreptunghi1.perimetrul());

        dreptunghi1.schimbaCuloarea("verde");
        dreptunghi1.descrie();
    /*Clasa Angajat
    Atribute: nume, prenume, salariu
    Constructor pt toate atributele
    Metode:
    descrie()
    nume_complet()
    salariu_lunar()
    salariu_anual()
    marire_salariu(procent)
    */
        Angajat angajat1 = new Angajat("Popescu", "Ion", 7000.0);
        angajat1.descrie();
        System.out.println("Numele complet: " + angajat1.numeComplet());
        System.out.println("Salariu lunar: " + angajat1.salariuLunar());
        System.out.println("Salariu anual: " + angajat1.salariuAnual());

        // Marirea salariului cu 10%
        angajat1.marireSalariu(20);

    /*Clasa Factura
    Atribute: seria (va fi constanta, nu trebuie constructor, toate facturile vor avea aceeasi serie), numar, nume_produs, cantitate, pret_buc
    Constructor: toate atributele, fara serie
    Metode:
    schimba_cantitatea(cantitate)
    schimba_pretul(pret)
    schimba_nume_produs(nume)
    genereaza_factura() - va printa tabelar daca reusiti
    Factura seria x numar y
    Data: generati automat data de azi
    Produs | cantitate | pret bucata | Total
    Telefon |      7       |       700       | 49000
    */
        Factura factura = new Factura(1, "Telefon", 7, 700.0);
        factura.genereazaFactura();
    /*Clasa Cont
    Atribute: iban, titular_cont, sold
    Constructor pentru toate
    Metode:
    afisare_sold() - Titularul x are in contul y suma de n lei
    debitare_cont(suma)
    creditare_cont(suma)
    BONUS: (daca aveti timp si doriti sa lucrati suplimentar)
    */
        Cont cont1 = new Cont("RO123456789", "John Doe", 1000.0);
        cont1.afisareSold();

        cont1.debitareCont(500.0);
        cont1.creditareCont(300.0);
    /*Clasa Masina
    Atribute: marca, model, viteza maxima, viteza_actuala, culoare, culori_disponibile (set), inmatriculata (bool)
    Culoare = gri - toate masinile cand ies din fabrica sunt gri
    Viteza_actuala = 0 - toate masinile stau pe loc cand ies din fabrica
    Culori disponibile = alegeti voi 5-7 culori
    Marca = alegeti voi - fabrica produce o singura marca dar mai multe modele
    Inmatriculata = False
    Constructor: model, viteza_maxima
    Metode:
    descrie() (se vor printa toate atributele, inafara de culori_disponibile)
    inmatriculare() - va schimba atributul inmatriculata in True
    vopseste(culoare) - se va vopsi masina in noua culoare DOAR daca noua culoare e in optiunea de culori displonibile, altfel afisati o eroare
    accelereaza(viteza) - se va accelera la o anumiota viteza, daca viteza e negativa-eroare, daca viteza e mai mare decat viteza_max - masina va accelera pana la viteza maxima
    franeaza() - masina se va opri si va avea viteza 0
    */
        Masina masina1 = new Masina("Toyota", "Corolla", 180);
        masina1.descrie();

        masina1.inmatriculare();
        masina1.vopseste("albastru");
        masina1.accelereaza(150);
        masina1.descrie();
        masina1.franeaza();
        masina1.descrie();
    /*Clasa TodoList

    */
        TodoList listaTaskuri = new TodoList();

        listaTaskuri.adaugaTask("Cumpărături", "Mâncare și produse de curățenie");
        listaTaskuri.adaugaTask("Proiect", "Finalizare documentație");
        listaTaskuri.afiseazaTodoList();

        listaTaskuri.afiseazaDetaliiSuplimentare("Cumpărături");
        listaTaskuri.afiseazaDetaliiSuplimentare("Curățenie");

    /*Write a Java program to create a class called Shape with methods called getPerimeter() and getArea(). Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the area and perimeter of a circle.
    */

    }
}
class Cerc {
    private double raza;
    private String culoare;

    public Cerc(double raza, String culoare) {
        this.raza = raza;
        this.culoare = culoare;
    }
    public void descrieCerc() {
        System.out.println("Cercul are culoarea: " + culoare + " si raza: " + raza);
    }
    public double aria() {
        return Math.PI * Math.pow(raza, 2);
    }
    public double diametru() {
        return 2 * raza;
    }
    public double circumferinta() {
        return 2 * Math.PI * raza;
    }
}
class Cake {
    private String flavor;
    private double price;

    public Cake(String flavor) {
        this.flavor = flavor;
    }
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class BirthdayCake extends Cake {
    private int candles;
    public BirthdayCake(String flavor, int candles) {
        super(flavor);
        this.candles = candles;
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}

class WeddingCake extends Cake {
    private int tiers;

    public WeddingCake(String flavor, int tiers) {
        super(flavor);
        this.tiers = tiers;
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
class Dreptunghi {
    private double lungime;
    private double latime;
    private String culoare;

    public Dreptunghi(double lungime, double latime, String culoare) {
        this.lungime = lungime;
        this.latime = latime;
        this.culoare = culoare;
    }

    public void descrie() {
        System.out.println("Dreptunghiul are lungimea: " + lungime +
                ", latimea: " + latime + " si culoarea: " + culoare);
    }

    public double aria() {
        return lungime * latime;
    }
    public double perimetrul() {
        return 2 * (lungime + latime);
    }

    public void schimbaCuloarea(String nouaCuloare) {
        this.culoare = nouaCuloare;
    }
}
class Angajat {
    private String nume;
    private String prenume;
    private double salariu;
    public Angajat(String nume, String prenume, double salariu) {
        this.nume = nume;
        this.prenume = prenume;
        this.salariu = salariu;
    }

    public void descrie() {
        System.out.println("Angajatul " + nume + " " + prenume + " are un salariu de " + salariu + " lei.");
    }
    public String numeComplet() {
        return nume + " " + prenume;
    }
    public double salariuLunar() {
        return salariu;
    }
    public double salariuAnual() {
        return salariu * 12;
    }
    public void marireSalariu(double procent) {
        salariu += salariu * (procent / 100);
        System.out.println("Salariul a fost mărit cu " + procent + "%. Noul salariu este: " + salariu + " lei.");
    }
}
class Masina {
    private static final String CULOARE_INITIALA = "gri";
    private static final Set<String> CULORI_DISPONIBILE = new HashSet<>(
            Set.of("rosu", "albastru", "negru", "verde", "galben", "portocaliu", "argintiu")
    );

    private String marca;
    private String model;
    private int vitezaMaxima;
    private int vitezaActuala;
    private String culoare;
    private boolean inmatriculata;

    public Masina(String marca, String model, int vitezaMaxima) {
        this.marca = marca;
        this.model = model;
        this.vitezaMaxima = vitezaMaxima;
        this.vitezaActuala = 0;
        this.culoare = CULOARE_INITIALA;
        this.inmatriculata = false;
    }

    public void descrie() {
        System.out.println("Marca: " + marca);
        System.out.println("Model: " + model);
        System.out.println("Viteza maxima: " + vitezaMaxima + " km/h");
        System.out.println("Viteza actuala: " + vitezaActuala + " km/h");
        System.out.println("Culoare: " + culoare);
        System.out.println("Inmatriculata: " + (inmatriculata ? "Da" : "Nu"));
    }

    public void inmatriculare() {
        inmatriculata = true;
        System.out.println("Masina a fost inmatriculata.");
    }

    public void vopseste(String culoareNoua) {
        if (CULORI_DISPONIBILE.contains(culoareNoua)) {
            culoare = culoareNoua;
            System.out.println("Masina a fost vopsita in culoarea " + culoareNoua + ".");
        } else {
            System.out.println("Culoarea " + culoareNoua + " nu este disponibila.");
        }
    }

    public void accelereaza(int viteza) {
        if (viteza < 0) {
            System.out.println("Eroare: Viteza nu poate fi negativa.");
        } else if (viteza > vitezaMaxima) {
            System.out.println("Atentie: Viteza depaseste limita maxima. Masina accelereaza pana la viteza maxima.");
            vitezaActuala = vitezaMaxima;
        } else {
            vitezaActuala = viteza;
            System.out.println("Masina accelereaza la viteza " + viteza + " km/h.");
        }
    }

    public void franeaza() {
        vitezaActuala = 0;
        System.out.println("Masina s-a oprit. Viteza actuala este 0 km/h.");
    }
}
class Factura {
    private static final String SERIE = "X";

    private int numar;
    private String numeProdus;
    private int cantitate;
    private double pretBuc;

    public Factura(int numar, String numeProdus, int cantitate, double pretBuc) {
        this.numar = numar;
        this.numeProdus = numeProdus;
        this.cantitate = cantitate;
        this.pretBuc = pretBuc;
    }

    public void schimbaCantitatea(int cantitate) {
        this.cantitate = cantitate;
    }

    public void schimbaPretul(double pret) {
        this.pretBuc = pret;
    }

    public void schimbaNumeProdus(String nume) {
        this.numeProdus = nume;
    }

    public void genereazaFactura() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String data = dateFormat.format(new Date());

        double total = cantitate * pretBuc;

        System.out.println("Factura seria " + SERIE + " numar " + numar);
        System.out.println("Data: " + data);
        System.out.println("Produs\t\t| Cantitate\t| Pret bucata\t| Total");
        System.out.println("----------------------------------------------");
        System.out.printf("%s\t| %d\t\t| %.2f\t\t| %.2f%n", numeProdus, cantitate, pretBuc, total);
    }
}
class Cont {
    private String iban;
    private String titularCont;
    private double sold;

    public Cont(String iban, String titularCont, double sold) {
        this.iban = iban;
        this.titularCont = titularCont;
        this.sold = sold;
    }
    public void afisareSold() {
        System.out.printf("Titularul %s are în contul %s suma de %.2f lei.%n", titularCont, iban, sold);
    }
    public void debitareCont(double suma) {
        if (suma > 0 && suma <= sold) {
            sold -= suma;
            System.out.printf("Debitare reușită: %.2f lei au fost retrase din cont.%n", suma);
        } else {
            System.out.println("Debitare eșuată: Suma invalidă sau insuficient fonduri.");
        }
        afisareSold();
    }
    public void creditareCont(double suma) {
        if (suma > 0) {
            sold += suma;
            System.out.printf("Creditare reușită: %.2f lei au fost adăugați în cont.%n", suma);
        } else {
            System.out.println("Creditare eșuată: Suma invalidă.");
        }
        afisareSold();
    }
}
class TodoList {
    // Atribut
    private Map<String, String> todo;

    // Constructor
    public TodoList() {
        this.todo = new HashMap<>();
    }

    // Metoda pentru adăugarea unui task în dict
    public void adaugaTask(String nume, String descriere) {
        todo.put(nume, descriere);
        System.out.println("Taskul '" + nume + "' a fost adăugat în lista.");
    }

    // Metoda pentru finalizarea unui task și eliminarea din dict
    public void finalizeazaTask(String nume) {
        if (todo.containsKey(nume)) {
            todo.remove(nume);
            System.out.println("Taskul '" + nume + "' a fost finalizat și eliminat din lista.");
        } else {
            System.out.println("Taskul '" + nume + "' nu există în lista.");
        }
    }

    // Metoda pentru a afișa doar cheile (numele taskurilor)
    public void afiseazaTodoList() {
        System.out.println("Lista de taskuri:");
        for (String numeTask : todo.keySet()) {
            System.out.println("- " + numeTask);
        }
    }

    // Metoda pentru a afișa detalii suplimentare despre un task
    public void afiseazaDetaliiSuplimentare(String numeTask) {
        if (todo.containsKey(numeTask)) {
            System.out.println("Detalii pentru task-ul '" + numeTask + "': " + todo.get(numeTask));
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Task-ul '" + numeTask + "' nu există în lista.");

            System.out.print("Doriți să-l adăugați? (da/nu): ");
            String raspuns = scanner.nextLine().toLowerCase();

            if (raspuns.equals("da")) {
                System.out.print("Introduceți o descriere pentru noul task: ");
                String descriereNoua = scanner.nextLine();
                adaugaTask(numeTask, descriereNoua);
            } else {
                System.out.println("La revedere!");
            }
        }
    }
}

class Car {
    private String carModel;
    private String carName;
    private double carPrice;
    private String carOwner;
    public void assignValues() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Car Model: ");
        this.carModel = scanner.nextLine();

        System.out.print("Enter Car Name: ");
        this.carName = scanner.nextLine();

        System.out.print("Enter Car Price: ");
        this.carPrice = scanner.nextDouble();

        scanner.nextLine();
        System.out.print("Enter Car Owner: ");
        this.carOwner = scanner.nextLine();
    }

    public void display() {
        System.out.println("Car Model: " + carModel);
        System.out.println("Car Name: " + carName);
        System.out.println("Car Price: " + carPrice);
        System.out.println("Car Owner: " + carOwner);
    }
}
class Shape {
    public double getPerimeter() {
        return 0.0;
    }

    public double getArea() {
        return 0.0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class BankAccount {
    protected double balance;

    // Constructo
    public BankAccount() {
        this.balance = 0.0; // Initialize balance to zero
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
        displayBalance();
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
        displayBalance();
    }

    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal not allowed. Minimum balance of $100 must be maintained.");
        }
    }
}

class Fruit {
    protected String name;
    protected String taste;
    public Fruit(String name, String taste) {
        this.name = name;
        this.taste = taste;
    }
    public void eat() {
        System.out.println("Eating " + name + " with taste: " + taste);
    }
}

class Banana extends Fruit {
    public Banana(String taste) {
        super("Banana", taste);
    }

    // Override the eat method for Banana
    @Override
    public void eat() {
        System.out.println("Peeling and eating a Banana with taste: " + taste);
    }
}

class Mango extends Fruit {
    public Mango(String taste) {
        super("Mango", taste);
    }

    // Override the eat method for Mango
    @Override
    public void eat() {
        System.out.println("Slicing and enjoying a Mango with taste: " + taste);
    }
}