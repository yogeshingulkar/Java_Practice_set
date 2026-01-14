import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Intersection {

    // Function to find the union of two unsorted arrays
    public static List<Integer> findUnion(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        List<Integer> unionList = new ArrayList<>();
        int i = 0, j = 0;
        int m = arr1.length, n = arr2.length;

        while (i < m && j < n) {
            // Skip duplicates in arr1
            while (i > 0 && i < m && arr1[i] == arr1[i - 1]) {
                i++;
            }
            // Skip duplicates in arr2
            while (j > 0 && j < n && arr2[j] == arr2[j - 1]) {
                j++;
            }
            if (i >= m || j >= n) break; // Check bounds after skipping

            if (arr1[i] < arr2[j]) {
                unionList.add(arr1[i]);
                i++;
            } else if (arr2[j] < arr1[i]) {
                unionList.add(arr2[j]);
                j++;
            } else {
                // When elements are equal, add one and move both pointers
                unionList.add(arr1[i]);
                i++;
                j++;
            }
        }

        // Add remaining elements of arr1
        while (i < m) {
            if (i == 0 || arr1[i] != arr1[i - 1]) {
                unionList.add(arr1[i]);
            }
            i++;
        }

        // Add remaining elements of arr2
        while (j < n) {
            if (j == 0 || arr2[j] != arr2[j - 1]) {
                unionList.add(arr2[j]);
            }
            j++;
        }

        return unionList;
    }

    // Function to find the intersection of two unsorted arrays
    public static List<Integer> findIntersection(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        List<Integer> intersectionList = new ArrayList<>();
        int i = 0, j = 0;
        int m = arr1.length, n = arr2.length;

        while (i < m && j < n) {
             // Skip duplicates in arr1
            while (i > 0 && i < m && arr1[i] == arr1[i - 1]) {
                i++;
            }
            // Skip duplicates in arr2
            while (j > 0 && j < n && arr2[j] == arr2[j - 1]) {
                j++;
            }
             if (i >= m || j >= n) break; // Check bounds after skipping

            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                // When elements are equal, add one to intersection and move both pointers
                intersectionList.add(arr1[i]);
                i++;
                j++;
            }
        }
        return intersectionList;
    }
}
