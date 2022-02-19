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
		
		String[] pkm = new String[N];
		for (int i = 0; i < N; i++)
			pkm[i] = br.readLine();
		
		String q;
		for (int i = 0; i < M; i++) {
			q = br.readLine();
			if (isNum(q)) { // 숫자일때
				sb.append(pkm[Integer.parseInt(q)-1]).append("\n");
			} else { // 문자일때
				for (int j = 0; j < N; j++) {
					if (q.equals(pkm[j])) {
						sb.append(j+1).append("\n");
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
		boolean res = true;
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i))) {
				res = false;
				break;
			}
		}
		
		return res;
	}
}
