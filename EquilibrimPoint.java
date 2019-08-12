import java.io.*;
import java.util.*;

/**
 * EquilibrimPoint
 */
public class EquilibrimPoint {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-- > 0) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] arrayStrings = br.readLine().trim().split("\\s+");
            int[] arrayData = new int[arrayStrings.length];
            int sum = 0;
            for(int i = 0; i < arrayStrings.length; i++) {
                arrayData[i] = Integer.parseInt(arrayStrings[i]);
                sum += arrayData[i];
            }
            System.out.println(equalPoint(arrayData, sum));
        }
    }
    static int equalPoint(int[] arrayData, int sum) {
        int leftsum = 0;
        for(int i = 0; i < arrayData.length; i++) {
            sum -= arrayData[i];
            if(sum == leftsum)
                return i+1;
            leftsum += arrayData[i];
        }
        return -1;
    }
}