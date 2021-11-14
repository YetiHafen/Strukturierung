package u02_0_EVA_Prinzip_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class A02_VornameNachname {

    public static void main(String[] args) {
        System.out.print("Bitte Vorname eingeben: ");
        String vorname = readLine();
        System.out.print("Bitte Nachname eingeben: ");
        String nachname = readLine();

        String full = vorname + nachname;

        System.out.printf("Der Voranme \"%s\" hat %d Zeichen%n", vorname, vorname.length());
        System.out.printf("Der Nachname \"%s\" hat %d Zeichen%n", nachname, nachname.length());
        System.out.printf("Der komplette name hat %d Zeichen das sind %d Byte", full.length(), full.getBytes(StandardCharsets.UTF_8).length);
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
