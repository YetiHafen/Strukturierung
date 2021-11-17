package u04_StringOperationen_spezial;

import util.Eingabe;

public class S05_ErweitertePalindrompruefung {

    public static void main(String[] args) {
        String in = Eingabe.readString("Text: ");

        in = in.toLowerCase();
        in = in.replace(" ", "");
        in = in.replace(",", "");

        boolean palindrom = true;

        for(int i = 0; i < in.length(); i++) {
            char current = in.charAt(i);
            char compare = in.charAt(in.length() - 1 - i);

            palindrom = palindrom && current == compare ;
        }

        System.out.println(palindrom ? "Palindrom" : "Kein Palindrom");
    }
}
