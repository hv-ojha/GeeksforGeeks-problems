import java.io.*;
import java.util.*;

/**
 * SearchingInArray
 */
public class SearchingInArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-- > 0) {
            int N = Integer.parseInt(br.readLine().trim());
            int[] array = Arrays.stream(br.readLine().trim().split("\\s+")).mapToInt(Integer:: parseInt).toArray();
            int k = Integer.parseInt(br.readLine().trim());
            System.out.println(search(array, k));
        }
    }
    static int search(int[] arrayData, int k) {
        int start = 0;
        int end = arrayData.length - 1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(arrayData[mid] > k) {
                end = mid - 1;
            }
            else if(arrayData[mid] < k) {
                start = mid;
            }
            else {
                return mid + 1;
            }
        }
        return -1;
    }
}