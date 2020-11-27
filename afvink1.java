import java.util.concurrent.TimeUnit;
import java.util.Arrays;
import java.util.Random;

public class afvink1 {
    public static long startTime = System.nanoTime();

    public static void main(String[] args) {
        int[] jan = new int[100000000];
        for (int i = 0; i < jan.length; i++) {
            Random rand = new Random();
            int upperbound = 1000000;
            int int_random = rand.nextInt(upperbound);
            jan[i] = int_random; }
        quickSort(jan, 0, 999999999);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println(duration);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }

    }

    private static int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
}
