package String;

import java.io.*;

class replaceVowels {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-- > 0) {
            StringBuilder str = new StringBuilder(br.readLine().trim());
            int start = 0;
            int end = str.length();
            while(start < end) {
                if(!isVowel(str.charAt(start))) {
                    start++;
                    continue;
                }
                else if(!isVowel(str.charAt(end))) {
                    end++;
                    continue;
                }
                
            }
        }
    }
    static boolean isVowel(char c) {
        return (c == 'a' || c == 'A' || c == 'E' || c == 'e' || c == 'u'
                || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U');
    }
}