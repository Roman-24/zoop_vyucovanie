package cvicenie04;

public class ZapisovacMini {
    private static ZapisovacMini instance;

    private ZapisovacMini() {

    }

    public static synchronized ZapisovacMini getZapisovacMini() {
        if (instance == null) {
            instance = new ZapisovacMini();
        }
        return instance;
    }

}
