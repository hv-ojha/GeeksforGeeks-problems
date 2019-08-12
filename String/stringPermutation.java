import java.io.*;
import java.util.*;

/**
 * stringPermutation
 */
public class stringPermutation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-- > 0) {
            StringBuffer str = new StringBuffer(br.readLine().trim());
            permute(str, 0, str.length()-1);
            System.out.println();
        }
    }
    static void permute(StringBuffer s, int start, int end) {
        if(start == end)
            System.out.print(s + " ");
        else
        {
            for(int i = start; i <= end; i++) {
                s = swap(s, start, i);
                permute(s, start + 1, end);
                s = swap(s, start, i);
            }
        }
    }
    static StringBuffer swap(StringBuffer s, int start, int end) {
        char temp = s.charAt(start);
        s.setCharAt(start, s.charAt(end));
        s.setCharAt(end, temp);
        return s;
    }
}