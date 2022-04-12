import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1_2156 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[10001];
		int[] arr = new int[10001];
		for (int i = 1; i <= n; i++)
			arr[i] = Integer.parseInt(br.readLine());
		
		dp[1] = arr[1];
		dp[2] = arr[1]+arr[2];
		for (int i = 3; i <= n; i++) {
			int temp = Math.max(arr[i]+dp[i-2], arr[i]+arr[i-1]+dp[i-3]);
			dp[i] = Math.max(temp, dp[i-1]);
		}
		System.out.println(dp[n]);
	}

}
