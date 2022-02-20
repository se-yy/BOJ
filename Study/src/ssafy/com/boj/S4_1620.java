package ssafy.com.boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class S4_1620 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Map<String, Integer> map = new HashMap<>();
		String[] name = new String[N+1];
		String q, s;
		
		for (int i = 1; i <= N; i++) {
			s = br.readLine();
			map.put(s, i);
			name[i] = s;
		}
		
		for (int i = 0; i < M; i++) {
			q = br.readLine();
			if (isNum(q)) { // 숫자일 때
				sb.append(name[Integer.parseInt(q)]);
			}
			else { // 문자일때
				sb.append(map.get(q));
			}
			sb.append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	static boolean isNum(String s) {
		try {
			Integer.parseInt(s);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}
}
