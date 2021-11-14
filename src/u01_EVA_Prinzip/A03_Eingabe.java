package u01_EVA_Prinzip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;

public class A03_Eingabe {

    public static void main(String[] args) {
        System.out.println("Wie alt sind Sie? ");

        int alter = Integer.parseInt(readLine());

        LocalDateTime t = LocalDateTime.now();
        t = t.minusYears(alter);
        System.out.println("Sie sind im Jahr " + t.getYear() + " geboren!");
    }

    // eigene Funktion weil ich mir das util package nicht gespeichert habe
    private static String readLine() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
