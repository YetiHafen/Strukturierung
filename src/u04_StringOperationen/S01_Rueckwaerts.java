package u04_StringOperationen;

import util.Eingabe;

public class S01_Rueckwaerts {

    public static void main(String[] args) {
        String text = Eingabe.readString("Text: ");

        String reverse = "";

        for(int i = text.length() - 1; i >= 0; i--)
            reverse += text.charAt(i);

        System.out.println(reverse);
    }
}
