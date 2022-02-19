package ssafy.com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3_15649 {

	static int N, M;
	static StringBuilder sb = new StringBuilder("");
	static boolean[] visited;
	static int[] num;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		num = new int[M];
		visited = new boolean[N];
		perm(0);
		System.out.print(sb);
	}
	static void perm(int cnt) {
		if (cnt == M) {
			for (int i = 0; i < M; i++) {
				sb.append(num[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		for (int i = 0; i < N; i++) {
			if (visited[i] == true)
				continue;
			visited[i] = true;
			num[cnt] = i+1;
			perm(cnt+1);
			visited[i] = false;
		}
	}
}
