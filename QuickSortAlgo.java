import java.util.Scanner;
import java.util.Arrays;

class QuickSortAlgo {

    static void quickSort(int[] arr, int start, int end) {
        if (start < end) { 

            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
    }

    static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];  
        System.out.println(pivot);
        int i = start - 1;  

        for (int j = start; j < end; j++) {  
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, end);  
        return i + 1;
    }

    static void swap(int[] arr, int i, int j) {  
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array:");
        int end = sc.nextInt();
        int[] arr = new int[end];

        System.out.println("Enter Elements:");
        for (int i = 0; i < end; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Starting array: " + Arrays.toString(arr));
        sc.close();
        
        quickSort(arr, 0, end - 1); 

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
