import java.io.*;
import java.util.*;

/**
 * FindTheFine
 */
public class FindTheFine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-- > 0) {
            int[] numbers = Arrays.stream(br.readLine().trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int[] cars = Arrays.stream(br.readLine().trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int[] fine = Arrays.stream(br.readLine().trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            System.out.println(CountFine(cars, fine, numbers[1], numbers[0]));
        }
    }
    static int CountFine(int[] cars, int[] fine, int date, int n) {
        int results = 0;
        if(date % 2 == 0) {
            for(int i = 0; i < n; i++) {
                results += cars[i] % 2 != 0 ? fine[i] : 0;
            }
        }
        else {
            for (int i = 0; i < n; i++) {
                results += cars[i] % 2 == 0 ? fine[i] : 0;
            }
        }
        return results;
    }
}