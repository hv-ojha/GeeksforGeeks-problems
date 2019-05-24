/*
Problem Statement
Given an number. The task is to tell whether the number is valid indian mobile number or not. Print "Valid" if it is a valid indian mobile number, otherwise print "Invalid". 

Rules for valid :-indian mobile number
    The number should contain 10 or 11 or 12 digits.
    If it contains 10 digits, then first  digit should be 7 or 8 or 9.
    If it contains 11 digits, then first  digit should be 0 and second rule follwed.
    If it contains 12 digits, then first two digits should be 91 and second rule followed .

Input: 
The first line contains a single integer T i.e. the number of test cases. Each test case contains a single number(N) in string representing a mobile number 

Output:
Corresponding to each test case, print "Valid"  if inumber is valid indian mobile number otherwise printf "Invalid" on a new line.

Constraints:
1<=T<=20
10<=  |N| <= 12
here |N| denotes the size of number string.

Example:
Input:
3
07456789011
6782580124
919828689528

Output:
Valid
Invalid
Valid
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
	         String s = sc.next();
	         char[] num = s.toCharArray();
	         boolean val = false;
	         if(num.length >= 10) {
	             if(num.length == 10 && (num[0] == '7' || num[0] == '8' || num[0] == '9')) {
                     val = true;
                 }
	             else if(num.length == 11 && num[0] == '0') {
	                 if(num[1] == '7' || num[1] == '8' || num[1] == '9') {
	                     val = true;
	                 }
	             }
	             else if(num.length == 12 && num[0] == '9' && num[1] == '1') {
	                 if(num[2] == '7' || num[2] == '8' || num[2] == '9') {
	                     val = true;
	                 }
	             }
	         }
	         if(val == true)
	            System.out.println("Valid");
            else
                System.out.println("Invalid");
	     }
	 }
}
