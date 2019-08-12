import java.io.*;
import java.util.*;

/**
 * TypesOfArray
 */
public class TypesOfArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-- > 0) {
            int N = Integer.parseInt(br.readLine().trim());
            int[] arrayData = Arrays.stream(br.readLine().trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            typeArrayFunction(arrayData);
        }
    }
    static void typeArrayFunction(int[] arrayData) {
        int maxIndex = 0, maxValue = 0;
        for (int i = 0; i < arrayData.length; i++) {
            if (arrayData[i] > maxValue) {
                maxValue = arrayData[i];
                maxIndex = i;
            }
        }
        if (maxIndex == arrayData.length - 1) {
            System.out.println(arrayData[maxIndex] + " " + (arrayData[arrayData.length - 2] > arrayData[0] ? 1 : 3));
        } else if (maxIndex == 0) {
            System.out.println(arrayData[maxIndex] + " " + (arrayData[arrayData.length - 1] > arrayData[1] ? 2 : 4));
        } else {
            System.out.println(arrayData[maxIndex] + " " + (arrayData[maxIndex + 1] > arrayData[maxIndex - 1] ? 3 : 4));
        }
    }
}