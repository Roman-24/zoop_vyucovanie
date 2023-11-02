package cvicenie04;

public class Basnik {

    Zapisovac zapisovac = Zapisovac.getInstance();

    public void write() {
        zapisovac.log("Ahoj, ja som basnik..");
    }
}
