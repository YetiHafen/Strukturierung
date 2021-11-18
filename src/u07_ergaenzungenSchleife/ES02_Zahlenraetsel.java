package u07_ergaenzungenSchleife;

import java.util.HashMap;
import java.util.Map;

public class ES02_Zahlenraetsel {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(findValues());
        double secondsTaken = (System.currentTimeMillis() - (double) start) / 1000;
        System.out.printf("In %.3f Seconds%n", secondsTaken);
    }

    private static Map<Character, Integer> findValues() {

        for(int a = 0; a < 10; a++) {
            System.out.println(10 - a);
            for(int b = 0; b < 10; b++) {
                for(int c = 0; c < 10; c++) {
                    for(int d = 0; d < 10; d++) {
                        for(int e = 0; e < 10; e++) {
                            for(int f = 0; f < 10; f++) {
                                for(int g = 0; g < 10; g++) {
                                    for(int h = 0; h < 10; h++) {
                                        for(int i = 0; i < 10; i++) {
                                            for(int j = 0; j < 10; j++) {
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
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
