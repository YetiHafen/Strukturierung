package u02_4_merfAuswahl;

import util.Eingabe;

public class A02_Briefe {

    public static void main(String[] args) {
        double gramms = Eingabe.readDouble("Gewicht in g: ");

        float price = price(gramms);

        if(Float.isFinite(price))
            System.out.printf("Preis: %.2f D$%n", price);
        else
            System.out.println("Packet");
    }

    private static float price(double gramms) {
        if(gramms <= 20) return 1F;
        if(gramms <= 50) return 1.7F;
        if(gramms <= 100) return 2.4F;
        if(gramms <= 250) return 3.2F;
        if(gramms <= 500) return 4F;
        if(gramms <= 1000) return 4.8F;
        return Float.POSITIVE_INFINITY;
    }
}
