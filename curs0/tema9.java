package curs0;

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
        Angajat angajat1 = new Angajat("Popescu", "Ion", 5000.0);
        angajat1.descrie();
        System.out.println("Numele complet: " + angajat1.numeComplet());
        System.out.println("Salariu lunar: " + angajat1.salariuLunar());
        System.out.println("Salariu anual: " + angajat1.salariuAnual());

        // Marirea salariului cu 10%
        angajat1.marireSalariu(10);

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

    /*Clasa Cont
    Atribute: iban, titular_cont, sold
    Constructor pentru toate
    Metode:
    afisare_sold() - Titularul x are in contul y suma de n lei
    debitare_cont(suma)
    creditare_cont(suma)
    BONUS: (daca aveti timp si doriti sa lucrati suplimentar)
    */

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