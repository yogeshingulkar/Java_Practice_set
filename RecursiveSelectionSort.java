import java.util.Arrays;
class RecursiveSelectionSort {
    public static void main(String[] args) {

        int[] arr = {1, 5, 2, 4, 7, 9, 3, 6, 0, 8};
        System.out.println("Before : " + Arrays.toString(arr));
        selectionSort(arr, 0, arr.length);
        System.out.println("After  : " + Arrays.toString(arr));
    }

    // Recursive Selection Sort
    public static void selectionSort(int[] arr, int start, int n) {
        // Base condition – if start reaches last element → stop recursion
        if (start == n - 1) return;

        // Find minimum index in remaining arra
        int minIndex = findMinIndex(arr, start, n - 1);

        // Swap smallest element with current index
        int temp = arr[minIndex];
        arr[minIndex] = arr[start];
        arr[start] = temp;

        // Recursive call for next index
        selectionSort(arr, start + 1, n);
    }

    // Helper function to find minimum index recursively
    private static int findMinIndex(int[] arr, int i, int j) {
        if (i == j) return i;   // only 1 element left

        int k = findMinIndex(arr, i + 1, j);  // recursive result
        return (arr[i] < arr[k]) ? i : k;
    }
}
