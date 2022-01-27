package u09_Rekursion;

public class RekursiveMethoden {

    public static int fakultaet(int n) {
        if(n == 1) return 1;
        return n * fakultaet(n - 1);
    }

    public static int summe(int n) {
        if(n == 1) return 1;
        return n + summe(n -1);
    }

    public static int zweiHoch(int n) {
        if(n == 1) return 2;
        return 2 * zweiHoch(n - 1);
    }
}
