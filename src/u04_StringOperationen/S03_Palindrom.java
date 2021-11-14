package u04_StringOperationen;

import util.Eingabe;

public class S03_Palindrom {

    public static void main(String[] args) {
        String in = Eingabe.readString("Text: ");

        boolean palindrom = true;

        for(int i = 0; i < in.length(); i++) {
            palindrom = palindrom && in.charAt(i) == in.charAt(in.length() - 1 - i);
        }

        System.out.println(palindrom ? "Palindrom" : "Kein Palindrom");
    }
}
