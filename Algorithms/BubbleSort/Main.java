package BubbleSort;
import java.util.Arrays;

public class Main {
    public static void bubblesort(int[] arr, int n) {
        for (int i = 0; i < n-1 ; i++) {
            for (int j = 0; j < n-i-1 ; j++) {
                int tempJ = arr[j];
                int tempJNext = arr[j+1];
                if (arr[j] > arr[j+1]) {
                    arr[j] = tempJNext;
                    arr[j+1] = tempJ;
                }
            }
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {41, 71, 11, 99, 12};
        bubblesort(arr, n);
        System.out.println(Arrays.toString(arr));
    }
}