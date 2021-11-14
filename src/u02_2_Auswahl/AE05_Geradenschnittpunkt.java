package u02_2_Auswahl;


import util.Eingabe;

public class AE05_Geradenschnittpunkt {

    public static void main(String[] args) {
        String s1 = Eingabe.readString("Gleichung 1: ");
        String s2 = Eingabe.readString("Gleichung 2: ");

        Gleichung g = Gleichung.parseGleichung(s1);
        Gleichung g2 = Gleichung.parseGleichung(s2);
        Punkt s = g.schnittpunkt(g2);

        if(Double.isNaN(s.getX()) || Double.isNaN(s.getY()))

            System.out.println("Gleiche Gerade");

        else if(Double.isFinite(s.getX()) && Double.isFinite(s.getY()))

            System.out.println(s.toString());

        else
            System.out.println("Kein Schnittpunkt");
    }

}

class Gleichung {

    public static Gleichung parseGleichung(String g) {
        double a = Double.parseDouble(g.substring(g.indexOf('=') + 1, g.indexOf('x')).replace(" ", ""));
        double b = Double.parseDouble(g.substring(g.indexOf('x') + 1).replace(" ", ""));
        return new Gleichung(a, b);
    }

    private final double a;
    private final double b;

    public Gleichung(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Punkt schnittpunkt(Gleichung g2) {
        // a1 * x + b1 = a2 * x + b2 | -(a2 * x)-b1
        // a1 * x - a2 * x = b2 - b1
        // x = (b2 - b1) / (a1 - a2)
        double x = (g2.b - this.b) / (this.a - g2.a);
        // y = a1 * x + b1
        double y = this.a * x + g2.b;
        return new Punkt(x, y);
    }
}

class Punkt {
    private final double x;
    private final double y;

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Punkt: {x: %.3f; y: %.3f}".formatted(x, y);
    }
}
