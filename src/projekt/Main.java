package projekt;

public class Main {
    public static void main(String[] args) {

        Osoba osoba = new Osoba();
        osoba.pozdrav();

        Uctovnik uctovnik = new Uctovnik();
        uctovnik.pozdrav();


        uctovnik.pozdrav("Milan");


    }
}
