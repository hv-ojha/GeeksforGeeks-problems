import java.io.*;
import java.util.*;

/**
 * ChocolateDistributionProblem
 */
public class ChocolateDistributionProblem {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-- > 0) {
            int N = Integer.parseInt(br.readLine().trim());
            int[] arrayData = Arrays.stream(br.readLine().trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int m = Integer.parseInt(br.readLine().trim());
            Arrays.sort(arrayData);
            int result = chocolateDistribution(arrayData, m);
            System.out.println(result);
        }
    }
    static int chocolateDistribution(int[] arrayData, int m) {
        int result = 0, min = Integer.MAX_VALUE;
        for(int i = 0; i + m - 1 < arrayData.length; i++) {
            result = Math.abs(arrayData[i] - arrayData[i+m-1]);
            if(result < min) {
                min = result;
            }
        }
        return min;
    }
}