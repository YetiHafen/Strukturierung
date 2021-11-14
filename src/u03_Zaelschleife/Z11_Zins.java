package u03_Zaelschleife;

import util.Eingabe;

public class Z11_Zins {

    public static void main(String[] args) {
        double kap = Eingabe.readDouble("Kapital: ");
        double zins = Eingabe.readDouble("Zinssatz in %: ") / 100;
        int jahre = Eingabe.readInt("Jahre: ");

        System.out.printf("Zinsberechnung  Zinsen %.3f%%  Kapital %.2f%n", zins * 100, kap);
        System.out.println("---------------------------------------------");

        float zinsen = 0;

        for(int i = 1; i <= jahre; i++) {
            System.out.printf("Nach %d. Jahr    %.2f        %.2f%n", i, zinsen += kap * zins, kap += kap*zins);
        }
        System.out.println("--------------------------------------------");
        System.out.printf("                 %.2f        %.2f%n", zinsen, kap);
    }
}
