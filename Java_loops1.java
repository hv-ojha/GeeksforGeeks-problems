/*
Problem Statement :-
For a given N, prints the sum of even and odd integers of the first N natural numbers.

Input:
First line of the input contains an integer T which denotes the number of test cases. 
Then T test cases follow. 
Each test case contains a single line containing N.

Output: 
For each test case, print space separated sums of even and odd integers of the first N natural numbers respectively.

Constraints:
1 <= T< = 200
1<=N<=10000

Example:
Input:
2
1
6 
Output:
0 1
12 9  
*/

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	     Scanner sc = new Scanner(System.in);
	     int T = sc.nextInt();
	     for(int i = 0; i < T; i++) {
	         int N = sc.nextInt();
	         long sum_o = 0, sum_e = 0;
	         for(int j = 1; j <= N; j++) {
	             if(j % 2 == 0)
	                sum_e += j;
	             else
	                sum_o += j;
	         }
	         System.out.println(sum_e + " " + sum_o);
	     }
	 }
}
