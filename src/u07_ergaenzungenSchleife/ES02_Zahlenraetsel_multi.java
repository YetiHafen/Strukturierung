package u07_ergaenzungenSchleife;

import java.util.HashMap;
import java.util.Map;

public class ES02_Zahlenraetsel_multi {

    static Thread[] threads;
    static int[] starts;
    static int singleThreadRuns;
    static boolean valueFound = false;

    public static void main(String[] args) {
        int threadCount = 4;

        singleThreadRuns = (int) (9999999999L / threadCount + 1);
        starts = new int[threadCount];
        ES02_Zahlenraetsel_multi.threads = new Thread[threadCount];

        for(int i = 0; i < threadCount; i++) {
            starts[i] = i + singleThreadRuns;
        }

        for(int i = 0; i < threadCount; i++) {
            int start = starts[i];
            threads[i] = new Thread(() -> {
                Map<Character, Integer> res = findValues(start);
                if(res != null) {
                    valueFound = true;
                    System.out.println(res);
                }
            });
            threads[i].start();
        }
    }


    private static Map<Character, Integer> findValues(int start) {
        for(int iter = start; iter < start + singleThreadRuns && !valueFound; iter++) {
            int j = iter % 10;
            iter /= 10;
            int i = iter % 10;
            iter /= 10;
            int h = iter % 10;
            iter /= 10;
            int g = iter % 10;
            iter /= 10;
            int f = iter % 10;
            iter /= 10;
            int e = iter % 10;
            iter /= 10;
            int d = iter % 10;
            iter /= 10;
            int c = iter % 10;
            iter /= 10;
            int b = iter % 10;
            iter /= 10;
            int a = iter % 10;

            int[][] zahlen = new int[3][3];

            zahlen[0][0] = 1000 * a + 100 * b + 10 * c + d;
            zahlen[0][1] = 10 * e + f;
            zahlen[0][2] = 100 * e + 10 * g + d;

            zahlen[1][0] = 1000 * h + 100 * i + 10 * j + e;
            zahlen[1][1] = 1000 * h + 100 * i + 10 * b + g;
            zahlen[1][2] = 10 * f + e;

            zahlen[2][0] = 1000 * j + 100 * i + 10 * d + b;
            zahlen[2][1] = 1000 * h + 100 * i + 10 * d + f;
            zahlen[2][2] = 1000 * c + 100 * g + 10 * g + c;

            if(zahlen[0][1] == 0) continue;

            boolean stimmt = true;

            stimmt = zahlen[0][0] / zahlen[0][1] == zahlen[0][2];
            stimmt = stimmt && zahlen[1][0] - zahlen[1][1] == zahlen[1][2];
            stimmt = stimmt && zahlen[2][0] - zahlen[2][1] == zahlen[2][2];

            stimmt = stimmt && zahlen[0][0] - zahlen[1][0] == zahlen[2][0];
            stimmt = stimmt && zahlen[0][1] + zahlen[1][1] == zahlen[2][1];
            stimmt = stimmt && zahlen[0][2] * zahlen[1][2] == zahlen[2][2];

            if(stimmt) {
                HashMap<Character, Integer> ret = new HashMap<>();
                ret.put('a', a);
                ret.put('b', b);
                ret.put('c', c);
                ret.put('d', d);
                ret.put('e', e);
                ret.put('f', f);
                ret.put('g', g);
                ret.put('h', h);
                ret.put('i', i);
                ret.put('j', j);
                return ret;
            }
        }
        return null;
    }


}
