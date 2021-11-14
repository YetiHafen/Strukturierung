package u02_0_EVA_Prinzip_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A01_TextLaenge {

    public static void main(String[] args) {
        System.out.print("Text eingeben: ");
        String text = readLine();
        System.out.println(text.length());
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
