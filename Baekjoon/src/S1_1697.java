import java.util.Scanner;

public class S1_1697 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int dp[] = new int[1000001];
		dp[N] = 0;
		
		for (int i = 1; i <= N; i++)
			dp[N-i] = i;
		
		for (int i = N+1; i <= K; i++) {
			if (i%2==0) {
				dp[i] = Math.min(dp[i-1]+1, dp[i/2]+1);
			} else {
				dp[i] = Math.min(dp[i-1]+1, dp[(i+1)/2]+2);
			}
		}
		
		System.out.println(dp[K]);
	}

}
