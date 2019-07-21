import java.io.*;
import java.util.*;

class ClosestNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            int[] N = Arrays.stream(br.readLine().trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int[] arr = Arrays.stream(br.readLine().trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int ans = findNumber(arr, N[1]);
            System.out.println(ans);
        }
    }
    static int findNumber(int[] arrayData, int target) {
        if(target <= arrayData[0]) {
            return arrayData[0];
        }
        else if(target >= arrayData[arrayData.length - 1]) {
            return arrayData[arrayData.length - 1];
        }
        else {
            int start = 0;
            int end = arrayData.length - 1;
            int mid;
            while(start < end) {
                mid = start + end / 2;
                if(arrayData[mid] < target) {
                    if(mid < arrayData.length && arrayData[mid + 1] > target ) {
                        return target - arrayData[mid] <= arrayData[mid+1] - target ? arrayData[mid] : arrayData[mid+1];
                    }
                    start = mid + 1;
                }
                else if(arrayData[mid] > target) {
                    if(mid > 0 && arrayData[mid - 1] < target) {
                        return target - arrayData[mid - 1] <= arrayData[mid] - target ? arrayData[mid] : arrayData[mid - 1];
                    }
                    end = mid - 1;
                }
                else {
                    return arrayData[mid];
                }
            }
        }
        return 0;
    }
}