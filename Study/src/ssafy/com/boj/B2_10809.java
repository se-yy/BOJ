package ssafy.com.boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2_10809 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		char c = 'a';
		char[] s = br.readLine().toCharArray();
		int[] alp = new int[26];
		for (int i = 0; i < 26; i++)
			alp[i] = -1;
		
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < 26; j++) {
				if (s[i]==c+j && alp[j]==-1) {
					alp[j] = i;
					break;
				}
			}
		}
		
		for (int i = 0; i < 26; i++)
			sb.append(alp[i]).append(" ");
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
