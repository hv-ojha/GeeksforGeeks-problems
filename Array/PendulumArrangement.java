import java.io.*;
import java.util.Arrays;

class PendulumArrangement {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int[] arrayData = Arrays.stream(br.readLine().trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            pendulum(arrayData);
        }
    }
    public static void pendulum(int[] arrayData) {
        Arrays.sort(arrayData);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arrayData.length; i++) {
            if((i & 1) == 0) {
                sb.insert(0, arrayData[i] + " ");
            }
            else {
                sb.append(arrayData[i] + " ");
            }
        }
        System.out.println(sb);
    }
}