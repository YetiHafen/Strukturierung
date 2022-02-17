package u11_algorithmen;

public class Testprogramm {

    public static void main(String[] args) {
        int[] arr = Array.generieren(100);
        int[] arr1 = Array.kopieren(arr);
        int[] arr2 = Array.kopieren(arr);
        Array.ausgeben(arr);
        double rsTime = time(() -> Sortieren.rippleSort(arr));
        double bsTime = time(() -> Sortieren.bubbleSort(arr1));
        double qsTime = time(() -> Sortieren.quicksort(arr2));
        System.out.println("RippleSort: " + rsTime + " ns");
        Array.ausgeben(arr);
        System.out.println("BubbleSort: " + bsTime + " ns");
        Array.ausgeben(arr1);
        System.out.println("QuickSort: " + qsTime + " ns");
        Array.ausgeben(arr2);
    }

    public static double time(Runnable toTime) {
        double start = System.nanoTime();
        toTime.run();
        return System.nanoTime() - start;
    }
}
