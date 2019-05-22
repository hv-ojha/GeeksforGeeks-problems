/*
Problem Statement

Given an array C of size N-1 and given that there are numbers from 1 to N with one element missing, the missing number is to be found.

Input:
The first line of input contains an integer T denoting the number of test cases. 
For each test case first line contains N(size of array). 
The subsequent line contains N-1 array elements.

Output:
Print the missing number in array.

Constraints:
1 ≤ T ≤ 200
1 ≤ N ≤ 107
1 ≤ C[i] ≤ 107

Example:
Input:
2
5
1 2 3 5
10
1 2 3 4 5 6 7 8 10

Output:
4
9

Explanation:
Testcase 1: Given array : 1 2 3 5. Missing element is 4.

*/

import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    for(int i = 0; i < T; i++) {
	        int N = sc.nextInt();
	        int arr[] = new int[N];
	        int tot = N * (N + 1) / 2;
	        for(int j = 0; j < N - 1; j++) {
	            arr[j] = sc.nextInt();
	            tot -= arr[j];
	        }
	        System.out.println(tot);
	    }
	 }
}
