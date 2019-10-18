import java.io.*;

class ReverseInGroup {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String[] t = br.readLine().trim().split("\\s+");
            int N = Integer.parseInt(t[0]);
            int d = Integer.parseInt(t[1]);
            int[] arr = new int[N];
            String[] a = br.readLine().trim().split("\\s+");
            for (int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(a[i]);
            reverseInGroup(arr, d);
        }
    }

    public static void reverseInGroup(int[] arrayData, int d) {
        d = arrayData.length < d ? arrayData.length : d;
        int start = 0;
        int end = d - 1;
        while(end <= arrayData.length - 1) {
            reverse(arrayData, start, end);
            start += d;
            end += d;
            if(end > arrayData.length - 1) {
                reverse(arrayData, start, arrayData.length - 1);
                break;
            }
        }
        System.out.println();
    }

    public static void reverse(int[] arrayData, int start, int end) {
        StringBuffer sb = new StringBuffer();
        for(int i = end; i >= start; i--) {
            sb.append(arrayData[i] + " ");
        }
        System.out.print(sb);
    }
}