package u09_Rekursion;

public class IterativeMethoden {

    public static int fakultaet(int n) {
        int res = 1;
        for(int i = n; i > 1; i--) {
            res *= i;
        }
        return res;
    }

    public static int summe(int n) {
        int res = 1;
        for(int i = n; i > 1; i--) {
            res += i;
        }
        return res;
    }

    public static int zweiHoch(int n) {
        int res = 2;
        for(int i = 0; i < n -1; i++) {
            res *= 2;
        }
        return res;
    }
}
