package u05_1_ergaenzungenSchleife;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ES02_Zahlenraetsel_multi {

    static Thread[] threads;
    static long[] starts;
    static long singleThreadRuns;
    static boolean valueFound = false;
    static long startTime;

    public static void main(String[] args) {
        startTime = System.currentTimeMillis();
        int threadCount = 22;

        singleThreadRuns = 9999999999L / threadCount + 1;
        starts = new long[threadCount];
        ES02_Zahlenraetsel_multi.threads = new Thread[threadCount];

        starts[0] = 0;
        for(int i = 1; i < threadCount; i++) {
            starts[i] = singleThreadRuns + starts[i - 1];
        }

        System.out.println(singleThreadRuns);
        System.out.println(Arrays.toString(starts));

        for(int i = 0; i < threadCount; i++) {
            long start = starts[i];
            int finalI = i;
            threads[i] = new Thread(() -> {
                System.out.println("Start Thread " + finalI);
                Map<Character, Integer> res = findValues(start);
                if(res != null) {
                    valueFound = true;
                    finished(res);
                }
                System.out.println("Ended Thread " + finalI);
            }, "Thread " + finalI);
            threads[i].start();
        }
    }

    private static void finished(Map<Character, Integer> result) {
        System.out.println(result);
        double secondsTaken = (System.currentTimeMillis() - (double) startTime) / 1000;
        System.out.printf("In %.3f Seconds%n", secondsTaken);
        System.exit(0);
    }


    private static Map<Character, Integer> findValues(long start) {
        for(long iter = start; iter < start + singleThreadRuns && !valueFound; iter++) {
            /*if(iter % 100000000 == 0)  {
                System.out.println(Thread.currentThread().getName() + ": at " + iter);
            }*/
            long current = iter;
            int j = (int) (current % 10);
            current /= 10;
            int i = (int) (current % 10);
            current /= 10;
            int h = (int) (current % 10);
            current /= 10;
            int g = (int) (current % 10);
            current /= 10;
            int f = (int) (current % 10);
            current /= 10;
            int e = (int) (current % 10);
            current /= 10;
            int d = (int) (current % 10);
            current /= 10;
            int c = (int) (current % 10);
            current /= 10;
            int b = (int) (current % 10);
            current /= 10;
            int a = (int) (current % 10);

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
