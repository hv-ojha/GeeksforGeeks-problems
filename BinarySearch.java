import java.io.*;
import java.util.*;

/**
 * BinarySearch
 */
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            System.out.println(bin_search(arr, 0, n - 1, key));
            T--;
        }
    }
    static int bin_search(int[] A, int left, int right, int k) {
        if(right < 0 || left >= A.length)
            return -1;
        int mid = left + right / 2;
        int result = -1;
        if(A[mid] > k)
            result = bin_search(A, left, mid - 1 , k);
        else if(A[mid] < k)
            result = bin_search(A, mid, right - 1, k);
        else 
            result = mid + 1;
        return result;
    }
}