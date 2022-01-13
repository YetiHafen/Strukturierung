package u08_Methoden;

public class M05_EulerscheZahl {

    public static void main(String[] args) {
        System.out.println(euler(10));
    }

    public static double euler(int n) {
        double e = 1;
        for(int i = 1; i <= n; i++) {
            e += 1.0 / M04_Fakultaet.fakultaet(i);
        }
        return e;
    }
}
