package String;

import java.io.*;

class palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine().trim());
            StringBuilder str = new StringBuilder(br.readLine().trim());
            System.out.println(str.toString().equals(str.reverse().toString()));
            str.delete(0, str.length());
        }
    }
}