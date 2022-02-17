package u11_algorithmen;

public class Sortieren {

    public static void rippleSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    Array.elementeTauschen(arr, j, i);
                }
            }
        }
    }

    public static void bubbleSort(int[] arr) {
        for(int i = arr.length; i > 0; i--) {
            for(int j = 0; j < arr.length - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    Array.elementeTauschen(arr, j, j+1);
                }
            }
        }
    }

    public static void quicksort(int[] arr) {
        int len = arr.length;
        sort(arr, 0, len - 1);
    }

    // https://www.geeksforgeeks.org/java-program-for-quicksort/
    private static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    private static void sort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
}
