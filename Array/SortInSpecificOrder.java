import java.io.*;
import java.util.*;

/**
 * SortInSpecificOrder
 */
public class SortInSpecificOrder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-- > 0) {
            int N = Integer.parseInt(br.readLine().trim());
            int[] arrayData = Arrays.stream(br.readLine().trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            sortFunction(arrayData);
        }
    }
    static void sortFunction(int[] arrayData) {
        StringBuffer op = new StringBuffer();
        Arrays.sort(arrayData);
        for(int a : arrayData) {
            if(a % 2 == 0) 
                op.append(a + " ");
            else
                op.insert(0, a + " ");
        }
        System.out.println(op);
    }
}