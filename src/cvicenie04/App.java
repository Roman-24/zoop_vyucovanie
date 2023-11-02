package cvicenie04;



public class App {

    public static void main(String[] args) {

        System.out.println("See file log.txt");


        Zapisovac zapisovac = Zapisovac.getInstance();

        zapisovac.log("This is a log message.");
        zapisovac.log("Another log message.");

        Basnik basnik = new Basnik();
        basnik.write();

        // Don't forget to close the log when you're done
        zapisovac.closeLog();


    }
}
