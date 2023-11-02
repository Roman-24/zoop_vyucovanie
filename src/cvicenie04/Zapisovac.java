package cvicenie04;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Zapisovac {
    private static Zapisovac instance;
    private PrintWriter logFile;

    private Zapisovac() {
        try {
            logFile = new PrintWriter(new FileWriter("log.txt", true), true); // Append to the log file
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static synchronized Zapisovac getInstance() {
        if (instance == null) {
            instance = new Zapisovac();
        }
        return instance;
    }

    public void log(String message) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        logFile.println(formattedDateTime + " - " + message);
    }

    public void closeLog() {
        if (logFile != null) {
            logFile.close();
        }
    }

}
