package u04_StringOperationen_spezial;

import util.Eingabe;

public class S06_VokaleErsetzen {

    public static void main(String[] args) {

        String text = Eingabe.readString("Text: ");

        text = text.replaceAll("[aeiou]", "*");

        System.out.println(text);
    }
}
