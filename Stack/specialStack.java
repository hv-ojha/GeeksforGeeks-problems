/**
 *
 * Special Stack in O(1) time and O(N) extra space
 *  
 * Design a data-structure SpecialStack (using the STL of stack) that supports all the stack operations 
 * like push(), pop(), isEmpty(), isFull() and 
 * an additional operation getMin() which should return minimum element from the SpecialStack. 
 * Your task is to complete all the functions, using stack data-Structure.
 * 
 * Input Format:
 * The first line of input contains an integer T denoting the no of test cases. 
 * Then T test cases follow. Each test case contains two lines. 
 * The first line of input contains an integer n denoting the number of integers in a sequence. 
 * In the second line are n space separated integers of the stack.
 * 
 * Output Format: 
 * For each testcase, in a new line, print the minimum integer from the stack. 
 * 
 * Your Task:
 * Since this is a function problem, you don't need to take inputs. Just complete the provided functions.
 * 
 */

import java.util.Scanner;
import java.util.Stack;

class specialStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Stack<Integer> s=new Stack<>();
			GfG g=new GfG();
			while(!g.isFull(s,n)){
				g.push(sc.nextInt(),s);
            }
            g.pop(s);
            g.pop(s);
		System.out.println(g.min(s));
		}
	}
}
/*This is a function problem.You only need to complete the function given below*/
/*Complete the function(s) below*/
class GfG{
    Stack<Integer> minStack = new Stack<>();
    public void push(int a,Stack<Integer> s)
	{
        int minimum;
        if(minStack.isEmpty())
            this.minStack.push(a);
        s.push(a);
        minimum = s.peek() < minStack.peek() ? s.peek() : minStack.peek();
        minStack.push(minimum);
	}
	public int pop(Stack<Integer> s)
    {
        minStack.pop();
        return s.pop();
	}
	public int min(Stack<Integer> s)
    {
        return minStack.peek();
	}
	public boolean isFull(Stack<Integer>s, int n)
    {
        return s.size() == n ? true : false;
	}
	public boolean isEmpty(Stack<Integer>s)
    {
        return s.size() == 0 ? true : false;
	}
}