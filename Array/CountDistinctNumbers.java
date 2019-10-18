import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.util.HashMap;
class CountELements
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a[] = new int[n];
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
			//int k = sc.nextInt();
			
			GfG g = new GfG();
			g.countDistinct(a,k,n);			
			System.out.println();
		
		t--;
		}
	}
}
class GfG {
    void countDistinct(int A[], int k, int n) {
        for(int i = 0; i + k - 1 < n; i++)
            System.out.print(countElements(Arrays.copyOfRange(A, i, i + k)) + " ");
    }
    int countElements(int[] arrayData) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        for(int i = 0; i < arrayData.length; i++){
            if(hm.get(arrayData[i]) == null){
                hm.put(arrayData[i], 1);
                count++;
            }
        }
        return count;
    }
}
