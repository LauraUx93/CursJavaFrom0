package curs0;
import java.util.Scanner;
public class tema3 {
//    Scrie un program care transforma gradele Celsius (primite ca float) in Fahrenheit.
//    Scrie un program care interschimba valoarea a doua variabile.De exemplu un a = 3 si b = 5 va deveni a = 5 si b = 3.
//2. Scrie un program in care transforma un numar de minute intr-un numar de ani si zile.Astfel, pentru 530000 minute va afisa: 1 an(i) si 3 zile.
//    Scrie un program ce calculeaza media aritmetica a 5 numere introduse de la tastatura.
//    Se dă un număr natural nenul n reprezentând nota la informatică a unui elev. Afișați mesajul promovat dacă nota este mai mare sau egală cu 5 și nepromovat în caz contrar.
//    Se dă un număr natural nenul n reprezentând nota la informatică a unui elev. Afișați mesajul foarte bine dacă nota este mai mare sau egală cu 8, mesajul bine dacă nota este mai mică decât 8, dar mai mare sau egală cu 5 și mesajul insuficient dacă nota este sub 5.
//    Se dă un număr natural n. Afișați mesajul par sau mesajul impar dacă numărul este par sau impar.
//    Se dă un număr natural nenul n cu exact 4 cifre. Afișați care este cea mai mare cifră a acestui număr și de câte ori apare în scrierea numărului.
//    Se citește un număr natural nenul x care reprezintă o zi a săptămânii. Afișați denumirea zilei căreia îi corespunde numărul (1 – luni, 2 – marți, etc).
//    Se citesc 3 cifre. Sa se scrie un algoritm care sa construiasca numarul din cele 3 cifre. Ex. se citesc 1, 2, 5 si se alcatuieste numarul 125 (care se afiseaza).
//    Fie a si b doua numere intregi citite de la tastatura. Scrieti un algoritm care sa verifice daca a si b sunt numere consecutive.
//    Sa se afiseze anotimpul in functie de numarul lunii (switch) daca  e 2 -> iarna; 8-> e vara …

    public static void main(String[] args){
        //1.Scrie un program care transforma gradele Celsius (primite ca float) in Fahrenheit.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu temperatura în grade Celsius: ");
        float temperaturaCelsius = scanner.nextFloat();

        float temperaturaFahrenheit = (temperaturaCelsius * 9 / 5) + 32;

        System.out.println(temperaturaCelsius + " grade Celsius echivalează cu " + temperaturaFahrenheit + " grade Fahrenheit.");

        //2.Scrie un program care interschimba valoarea a doua variabile.De exemplu un a = 3 si b = 5 va deveni a = 5 si b = 3.
        int a = 3;
        int b = 5;

        System.out.println("Valori initiale:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Schimbarea valorilor folosind o variabilă temporară
        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nValori dupa schimbare:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //3.Scrie un program in care transforma un numar de minute intr-un numar de ani si zile.Astfel, pentru 530000 minute va afisa: 1 an(i) si 3 zile.

        System.out.print("Introdu numărul de minute: ");
        long minute = scanner.nextLong();

        // Calculul pentru ani și zile
        long minuteIntrUnAn = 60 * 24 * 365;
        long ani = minute / minuteIntrUnAn;
        long zile = (minute % minuteIntrUnAn) / (60 * 24);

        System.out.println(minute + " minute sunt echivalente cu " + ani + " an(i) și " + zile + " zile.");

        //4. Scrie un program ce calculeaza media aritmetica a 5 numere introduse de la tastatura.
        System.out.println("Introduceti cele 5 numere:");

        double suma = 0;
        int numereDeIntrodus = 5;

        System.out.print("Numarul 1: ");
        suma += scanner.nextDouble();

        System.out.print("Numarul 2: ");
        suma += scanner.nextDouble();

        System.out.print("Numarul 3: ");
        suma += scanner.nextDouble();

        System.out.print("Numarul 4: ");
        suma += scanner.nextDouble();

        System.out.print("Numarul 5: ");
        suma += scanner.nextDouble();

        double media = suma / numereDeIntrodus;
        System.out.println("Media aritmetica a celor 5 numere este: " + media);

        //5. Se dă un număr natural nenul n reprezentând nota la informatică a unui elev. Afișați mesajul promovat dacă nota este mai mare sau egală cu 5 și nepromovat în caz contrar.
        System.out.print("Introdu nota la informatică: ");
        int nota = scanner.nextInt();

        if (nota >= 5) {
            System.out.println("Promovat");
        } else {
            System.out.println("Nepromovat");
        }
        //6. Se dă un număr natural nenul n reprezentând nota la informatică a unui elev. Afișați mesajul foarte bine dacă nota este mai mare sau egală cu 8, mesajul bine dacă nota este mai mică decât 8, dar mai mare sau egală cu 5 și mesajul insuficient dacă nota este sub 5.
        System.out.print("Introdu nota la informatică: ");
        int nota1 = scanner.nextInt();

        if (nota1 >= 8) {
            System.out.println("Foarte bine");
        } else if (nota1 >= 5) {
            System.out.println("Bine");
        } else {
            System.out.println("Insuficient");
        }
        //7. Se dă un număr natural n. Afișați mesajul par sau mesajul impar dacă numărul este par sau impar.
        System.out.print("Introdu un numar natural n: ");
        int nr = scanner.nextInt();

        if (nr % 2 == 0) {
            System.out.println("Numarul este par.");
        } else {
            System.out.println("Numarul este impar.");
        }
        //8. Se dă un număr natural nenul n cu exact 4 cifre. Afișați care este cea mai mare cifră a acestui număr și de câte ori apare în scrierea numărului.
        System.out.print("Introdu un numar natural cu exact 4 cifre: ");
        int n = scanner.nextInt();

        if (n < 1000 || n > 9999) {
            System.out.println("Numarul introdus nu are exact 4 cifre.");
        } else {
            int cifraMare = n % 10;
            int frecventaCifraMare = 0;

            int cifra = (n / 10) % 10;
            if (cifra > cifraMare) {
                cifraMare = cifra;
            }

            cifra = (n / 100) % 10;
            if (cifra > cifraMare) {
                cifraMare = cifra;
            }

            cifra = n / 1000;
            if (cifra > cifraMare) {
                cifraMare = cifra;
            }

            int temp1 = n;
            while (temp1 > 0) {
                if (temp1 % 10 == cifraMare) {
                    frecventaCifraMare++;
                }
                temp1 /= 10;
            }

            System.out.println("Cea mai mare cifra este: " + cifraMare);
            System.out.println("Aceasta apare de " + frecventaCifraMare + " ori.");
        }

        //9. Se citește un număr natural nenul x care reprezintă o zi a săptămânii. Afișați denumirea zilei căreia îi corespunde numărul (1 – luni, 2 – marți, etc).
        System.out.print("Introdu un numar natural nenul pentru ziua saptamanii: ");
        int x = scanner.nextInt();

        String denumireZi;

        switch (x) {
            case 1:
                denumireZi = "Luni";
                break;
            case 2:
                denumireZi = "Marti";
                break;
            case 3:
                denumireZi = "Miercuri";
                break;
            case 4:
                denumireZi = "Joi";
                break;
            case 5:
                denumireZi = "Vineri";
                break;
            case 6:
                denumireZi = "Sambata";
                break;
            case 7:
                denumireZi = "Duminica";
                break;
            default:
                denumireZi = "Numarul introdus nu corespunde unei zile a saptamanii valide.";
                break;
        }

        System.out.println("Ziua corespunzatoare numarului introdus este: " + denumireZi);

        //10. Se citesc 3 cifre. Sa se scrie un algoritm care sa construiasca numarul din cele 3 cifre. Ex. se citesc 1, 2, 5 si se alcatuieste numarul 125 (care se afiseaza).
        System.out.println("Introduceti cele 3 cifre:");

        System.out.print("Prima cifra: ");
        int cifra1 = scanner.nextInt();

        System.out.print("A doua cifra: ");
        int cifra2 = scanner.nextInt();

        System.out.print("A treia cifra: ");
        int cifra3 = scanner.nextInt();

        int numar = (cifra1 * 100) + (cifra2 * 10) + cifra3;

        System.out.println("Numarul format din cele 3 cifre este: " + numar);
        //11. Fie a si b doua numere intregi citite de la tastatura. Scrieti un algoritm care sa verifice daca a si b sunt numere consecutive.
        System.out.print("Introduceti primul numar: ");
        int a1 = scanner.nextInt();

        System.out.print("Introduceti al doilea numar: ");
        int b1 = scanner.nextInt();

        // Calculăm diferența absolută dintre a și b
        int diferenta = Math.abs(a1 - b1);

        // Verificăm dacă diferența este exact 1 sau -1 pentru a confirma consecutivitatea
        if (diferenta == 1) {
            System.out.println(a1 + " și " + b1 + " sunt numere consecutive.");
        } else {
            System.out.println(a1 + " și " + b1 + " nu sunt numere consecutive.");
        }
        //12.Sa se afiseze anotimpul in functie de numarul lunii (switch) daca  e 2 -> iarna; 8-> e vara …
        System.out.print("Introduceti numarul lunii (1-12): ");
        int numarLuna = scanner.nextInt();

        String anotimp;

        switch (numarLuna) {
            case 12:
            case 1:
            case 2:
                anotimp = "Iarna";
                break;
            case 3:
            case 4:
            case 5:
                anotimp = "Primavara";
                break;
            case 6:
            case 7:
            case 8:
                anotimp = "Vara";
                break;
            case 9:
            case 10:
            case 11:
                anotimp = "Toamna";
                break;
            default:
                anotimp = "Numarul lunii introdus nu este valid.";
                break;
        }

        System.out.println("Anotimpul corespunzator lunii " + numarLuna + " este: " + anotimp);

        scanner.close();
    }
}
