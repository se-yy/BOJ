package ssafy.com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3_10974 {
	static StringBuilder sb = new StringBuilder("");
	static int[] num;
	static boolean[] visited = new boolean[8];
	static int N;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		num = new int[N];
		perm(0);
		
		System.out.print(sb);
	}
	static void perm(int cnt) {
		if (cnt == N) {
			for (int i = 0; i < N; i++)
				sb.append(num[i]).append(" ");
			sb.append("\n");
			return;
		}
		for (int i = 0; i < N; i++) {
			if (visited[i])
				continue;
			visited[i] = true;
			num[cnt] = i+1;
			perm(cnt+1);
			visited[i] = false;
		}
	}

}
