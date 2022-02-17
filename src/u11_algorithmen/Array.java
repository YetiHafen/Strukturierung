package u11_algorithmen;

import util.Zufall;

public class Array {

    public static int[] generieren(int size) {
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Zufall.hundert();
        }
        return arr;
    }

    public static int[] kopieren(int[] arr) {
        int[] newArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static void ausgeben(int[] arr) {
        String s = "";
        for(int i = 0; i < arr.length; i++) {
            s += (arr[i] + "\t");
        }
        System.out.println(s);
    }

    public static void elementeTauschen(int[] arr, int idx1, int idx2) {
        int element1 = arr[idx1];
        int element2 = arr[idx2];

        arr[idx1] = element2;
        arr[idx2] = element1;
    }
}
