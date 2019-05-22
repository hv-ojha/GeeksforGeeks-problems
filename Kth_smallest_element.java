/*
Problem Statement
Given an array arr and a number K where K is smaller than size of array, the task is to find the K’th smallest element in the given array.
It is given that all array elements are distinct.

Expected Time Complexity: O(n)

Input:
The first line of input contains an integer T, denoting the number of testcases.
Then T test cases follow. Each test case consists of three lines.
First line of each testcase contains an integer N denoting size of the array. 
Second line contains N space separated integer denoting elements of the array. 
Third line of the test case contains an integer K.

Output:
Corresponding to each test case, print the desired output in a new line.

Constraints:
1 <= T <= 100
1 <= N <= 105
1 <= arr[i] <= 105
1 <= K <= N

Example:
Input:
2
6
7 10 4 3 20 15
3
5
7 10 4 20 15
4

Output:
7
15

Explanation:
Testcase 1: 3rd smallest element in the given array is 7.

*/

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    for(int i = 0; i < t; i++) {
	        int N = sc.nextInt();
	        int arr[] = new int[N];
	        for(int j = 0; j < N; j++)
	            arr[j] = sc.nextInt();
	        int M = sc.nextInt();
	        Arrays.sort(arr);
	        System.out.println(arr[M-1]);
	    }
	 }
}
