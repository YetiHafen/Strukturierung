package u04_StringOperationen;

import util.Eingabe;

public class S04_LeerzeichenEntfernen {

    public static void main(String[] args) {
        String text = Eingabe.readString("Text: ");

        text = text.replace(",", "").replace(" ", "");

        System.out.println(text);
    }
}
