package projekt;

public class Osoba {

    String meno;

    Integer vek;

    Pohlavie pohlavie;

    Osoba() {
        this.vek = 21;
    }

    enum Pohlavie {
        Muz,
        Zena,
        UtocnaHelikoptera,
        Ine
    }

    public void pozdrav() {
        System.out.println("Ahoj..");
    }

}
