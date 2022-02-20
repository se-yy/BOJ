

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1_2961 {
	static int min, N;
	static int[] S, B, num;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		S = new int[N];
		B = new int[N];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			S[i] = Integer.parseInt(st.nextToken());
			B[i] = Integer.parseInt(st.nextToken());
		}
		
		min = Math.abs(S[0] - B[0]);
		for (int i = 1; i <= N; i++) {
			num = new int[i];
			choose(i, 0, 0);
		}
		System.out.println(min);
	}
	static void choose(int total, int cnt, int start) {
		if (total == cnt) {
			int sumS = 1, sumB = 0;
			for (int i = 0; i < total; i++) {
				sumS *= S[num[i]];
				sumB += B[num[i]];
			}
			int sub = Math.abs(sumS-sumB);
			min = Math.min(min, sub);
			return;
		}
		
		for (int i = start; i < N; i++) {
			num[cnt] = i;
			choose(total, cnt+1, i+1);
		}
	}

}
