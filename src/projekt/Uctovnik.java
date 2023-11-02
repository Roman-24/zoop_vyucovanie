package projekt;

public class Uctovnik extends Osoba {

    Uctovnik() {
        super();
        this.pohlavie = Pohlavie.UtocnaHelikoptera;
    }

    @Override
    public void pozdrav() {
        System.out.println("Uctovnik povedal: Ahoj..");
    }

    public void pozdrav(Integer vek) {
        System.out.println("Uctovnik povedal: Ahoj.. afngelfidabfguaefhesaoui");
    }

    public void pozdrav(String meno) {
        System.out.println("Ahoj " + meno);
    }
}
