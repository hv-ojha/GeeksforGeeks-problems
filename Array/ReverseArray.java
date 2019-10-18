import java.io.*;

class ReverseArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            String[] a = br.readLine().trim().split("\\s+");
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(a[i]);
            reverse(arr); 
        }
    }

    public static void reverse(int[] arrayData) {
        StringBuffer sb = new StringBuffer();
        for(int i = arrayData.length-1; i >= 0; i--)
            sb.append(arrayData[i] + " ");
        System.out.println(sb);
    }
}