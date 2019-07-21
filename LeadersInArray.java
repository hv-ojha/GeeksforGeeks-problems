import java.io.*;

class LeadersInArray {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N];
			String[] s = br.readLine().trim().split("\\s+");
			for (int i = 0; i < N; i++)
				arr[i] = Integer.parseInt(s[i]);
			leaders(arr);
		}
		br.close();
	}
	public static void leaders(int[] arrayData) {
		StringBuffer str = new StringBuffer();
		int max = arrayData[arrayData.length - 1];
		str.append(max + " ");
		for (int i = arrayData.length - 2; i >= 0; i--) {
			if (arrayData[i] >= max) {
				max = arrayData[i];
				str.append(max + " ");
			}
		}
		System.out.println(str);
	}
}