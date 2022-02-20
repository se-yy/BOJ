package ssafy.com.boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class S4_1620 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		String[] pkm = new String[N+1];
		for (int i = 1; i <= N; i++)
			pkm[i] = br.readLine();
		
		String q;
		for (int i = 0; i < M; i++) {
			q = br.readLine();
			if (isNum(q)) { // 숫자일때
				int n = Integer.parseInt(q);
				sb.append(pkm[n]).append("\n");
			} else { // 문자일때
				for (int j = 1; j <= N; j++) {
					if (q.equals(pkm[j])) {
						sb.append(j).append("\n");
						break;
					}
				}
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	static boolean isNum(String s) {
		boolean res = false;
		
		char c = s.charAt(0);
		if (c>='1' && c<='9')
			res = true;
		
		return res;
	}
}
