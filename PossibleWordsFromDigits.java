import java.io.*;
import java.util.*;

class PossibleWordsFromDigits {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-- > 0) {
            int N = Integer.parseInt(br.readLine().trim());
            int[] arrayData = Arrays.stream(br.readLine().trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            possibleWords(arrayData);
            System.out.println();
        }
    }
    static void possibleWords(int[] arrayData) {
        int max = 1;
        String[] data = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        for (int i = 0; i < arrayData.length; i++)
            max *= data[arrayData[i]].length();
        // System.out.println(max);
        int count = 1;
        String[] output = new String[max];
        for(int i = arrayData.length - 1; i >= 0; i--) {
            output = addition(data[arrayData[i]], output, count);
            count *= data[arrayData[i]].length();
        }
        for(int i = 0; i < output.length; i++)
            System.out.print(output[i] + " ");
    }
    static String[] addition(String data, String[] output, int n) {
        int cnt = 0;
        int count = 0;
        // System.out.println(n);
        for(int i = 0; i < output.length; i++) {
            // System.out.println(cnt + " " + count);
            output[i] = output[i] == null || output[i] == "" ? Character.toString(data.charAt(cnt)) : data.charAt(cnt) + output[i];
            count++;
            if(count >= n){
                cnt = cnt+1 < data.length() ? cnt + 1 : 0;
                count = 0;
            }
        }
        return output;
    }
}
