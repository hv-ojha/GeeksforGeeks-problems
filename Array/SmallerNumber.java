
/**
 * Given an integer array of size N. 
 * For each element in the array, check whether there exist a smaller element on the next immediate position of the array. 
 * If such an element exists, print that element. 
 * If there is no smaller element on the immediate next to the element then print -1.
 */

import java.io.*;

public class SmallerNumber {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        while(T --> 0) 
        {
            int N = Integer.parseInt(bf.readLine());
            int[] arr = new int[N];
            String str = bf.readLine();
            String[] s = str.split("\\s+");
            for(int j = 0; j < N; j++)
                arr[j] = Integer.parseInt(s[j]);
            smallerfunction(arr);
        }
    }
    public static void smallerfunction(int[] ar) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < ar.length; i++) {
            if(i+1 == ar.length) {
                sb.append("-1 ");
            }
            else {
                if(ar[i] > ar[i+1]) {
                    sb.append(ar[i+1] + " ");
                }
                else {
                    sb.append("-1 ");
                }
            }
        }
        System.out.println(sb);
    }
}