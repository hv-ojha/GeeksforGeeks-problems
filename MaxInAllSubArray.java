import java.io.*;
import java.util.*;

/**
 * MaxInAllSubArray
 */
public class MaxInAllSubArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-- > 0) {
            int[] Numbers = Arrays.stream(br.readLine().trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int[] arrayData = Arrays.stream(br.readLine().trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            MaxReturn(arrayData, Numbers[1]);
            System.out.println();
        }
    }
    static void MaxReturn(int[] arrayData, int k) {
        int[] max = new int[arrayData.length - k + 1];
        int maxVal = 0;
        int cnt = 0;
        for(int i = 0 ; i < arrayData.length; i++) {
            cnt = i / k == 0 ? i / k : cnt + 1;
            maxVal = arrayData[i] > maxVal ? arrayData[i] : maxVal;
            max[cnt] = maxVal;
            System.out.println(i + " " + cnt + " " + maxVal);
        }
        // for(int i : max)
        //     System.out.print(i + " ");
    }
}