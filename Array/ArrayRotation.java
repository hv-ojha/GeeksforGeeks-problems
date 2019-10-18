/**
 * Given an array of N size. 
 * The task is to rotate array by d elements where d is less than or equal to N.
 * 
 */
import java.io.*;

public class ArrayRotation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            String[] a = br.readLine().trim().split("\\s+");
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(a[i]);
            int d = Integer.parseInt(br.readLine());
            rotate(arr, d);
        }
    }
    public static void rotate(int[] arr, int d) {
        arr = rotation(arr, 0, d-1);
        arr = rotation(arr, d, arr.length-1);
        arr = rotation(arr, 0, arr.length-1);
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<arr.length; i++)
            sb.append(arr[i] + " ");
        System.out.println(sb);
    }
    public static int[] rotation(int[] arrayData, int start, int end) {
        while (start < end) {
            int temp = arrayData[start];
            arrayData[start] = arrayData[end];
            arrayData[end] = temp;
            start++;
            end--;
        }
        return arrayData;
    }
}