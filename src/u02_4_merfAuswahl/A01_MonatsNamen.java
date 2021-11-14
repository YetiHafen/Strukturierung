package u02_4_merfAuswahl;

import util.Eingabe;

public class A01_MonatsNamen {

    public static void main(String[] args) {
        int mon = Eingabe.readInt("Zahl: ");

        switch (mon) {
            case 1 -> System.out.println("Januar");
            case 2 -> System.out.println("Februar");
            case 3 -> System.out.println("März");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("Mai");
            case 6 -> System.out.println("Juni");
            case 7 -> System.out.println("Juli");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("Oktober");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("Dezember");
            default -> System.out.println("Kein Monat");
        }
    }
}
