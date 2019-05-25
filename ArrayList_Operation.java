/*
Problem Statement :-
Given an ArrayList of N lowercase characters. The task is to count frequency of elements in the list.

Note: use add() to append element in the list and contains() to check an element is present or not in the list and collections.frequency() to find the frequency of the element in the list.

Input Format:
First line of testcase contains T, number of testcases. For each testcase, first line contains number of queries Q. Each query may be any one of the two type:
1. "i" with "c" : insert the element "c" into the ArrayList
2. "f" with "c": find the frequency of "c" in the ArrayList.

Output Format:
For each testcase, output the frequency of elements. Print "Not Present" if element is not present in the list else its frequency in new line for every query.

Your Task:
Your task is to complete the functions insert() and freq() which are used to insert and find frequency of element respectively.

Constraints:
1 <= T <= 100
1 <= N <= 105
1 <= Q <= 102

Example:
Input:
2
6
i g i e i e i k i s f e
4
i c i p i p f f

Output:
2
Not Present

Explanation:
Testcase 1: Inserting g, e, e, k, s into the list. Frequency of e is 2 in the list.
Testcase 2: Inserting c, p, p into the list. Frequency of f is 0 in the list.
*/

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
// Geeks clas with functions insert and freq
// insert : to insert element into ArrayList
// freq : function to count frequency of element
class Geeks
{
    // Function to insert element
    public static void insert(ArrayList<Character> clist, char c)
    {
        //add c to clist
        clist.add(c);
    }
    
    // Function to count frequency of element
    public static void freq(ArrayList<Character> clist, char c)
    {
        if(clist.contains(c))
        System.out.println(Collections.frequency(clist, c));
        else
        System.out.println("Not Present");
        
    }
}
