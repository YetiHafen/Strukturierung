package u04_StringOperationen;

import util.Eingabe;

public class S02_Gesperrt {

    public static void main(String[] args) {
        String in = Eingabe.readString("Text: ");

        String out = "";

        for(int i = 0; i < in.length(); i++)
            out += in.charAt(i) + " ";

        out = out.substring(0, out.length() - 1);

        System.out.println(out);
    }
}
