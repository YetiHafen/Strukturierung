package u09_Rekursion;

public class Test {

    public static void main(String[] args) {
        testMethods();

        // fakultät
        long startRek = System.nanoTime();
        for(int i = 0; i < Integer.MAX_VALUE; i++) {
            int f100Rek = RekursiveMethoden.fakultaet(10);
        }

        long timeRek = System.nanoTime() - startRek;

        long startIter = System.nanoTime();
        for(int i = 0; i < Integer.MAX_VALUE; i++) {
            int f100Iter = IterativeMethoden.fakultaet(10);
        }

        long timeIter = System.nanoTime() - startIter;

        System.out.println("[Fakultät]:   Time Rek: " + (timeRek / 1000) + "µs Time Iter: " + (timeIter/1000) + "µs");


        // summe
        startRek = System.nanoTime();
        for(int i = 0; i < Integer.MAX_VALUE; i++) {
            int f100Rek = RekursiveMethoden.summe(10);
        }

        timeRek = System.nanoTime() - startRek;

        startIter = System.nanoTime();
        for(int i = 0; i < Integer.MAX_VALUE; i++) {
            int f100Iter = IterativeMethoden.summe(10);
        }

        timeIter = System.nanoTime() - startIter;

        System.out.println("[Summe]:      Time Rek: " + (timeRek / 1000) + "µs Time Iter: " + (timeIter/1000) + "µs");

        // 2 hoch
        startRek = System.nanoTime();
        for(int i = 0; i < Integer.MAX_VALUE; i++) {
            int f100Rek = RekursiveMethoden.zweiHoch(10);
        }

        timeRek = System.nanoTime() - startRek;

        startIter = System.nanoTime();
        for(int i = 0; i < Integer.MAX_VALUE; i++) {
            int f100Iter = IterativeMethoden.zweiHoch(10);
        }

        timeIter = System.nanoTime() - startIter;

        System.out.println("[2 hoch]:     Time Rek: " + (timeRek / 1000) + "µs Time Iter: " + (timeIter/1000) + "µs");

    }

    public static void testMethods() {
        if(IterativeMethoden.zweiHoch(5) != RekursiveMethoden.zweiHoch(5))
            throw new RuntimeException("2 hoch geht nicht");

        if(IterativeMethoden.fakultaet(10) != RekursiveMethoden.fakultaet(10))
            throw new RuntimeException("Fakultät geht nicht!");

        if(IterativeMethoden.summe(10) != RekursiveMethoden.summe(10)) {
            throw new RuntimeException("Summe geht nicht!");
        }
    }
}
