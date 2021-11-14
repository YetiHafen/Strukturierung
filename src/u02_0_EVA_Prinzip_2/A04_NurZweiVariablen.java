package u02_0_EVA_Prinzip_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A04_NurZweiVariablen {

    public static void main(String[] args) {
        try {
            int res = Integer.parseInt(readLine("Zahl 1: ")) * Integer.parseInt(readLine("Zahl 2: ")) * Integer.parseInt(readLine("Zahl 3: "));
            System.out.printf("= %d%n", res);
        } catch (NumberFormatException e) {
            System.out.println("Das war keine gültige Zahl!");
        }
    }

    // eigene Funktion weil ich mir das util package nicht gespeichert habe
    private static String readLine(String msg) {
        System.out.print(msg);
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
