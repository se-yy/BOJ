

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1_2563 {
	static boolean[][] paper = new boolean[100][100];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		int x, y, cnt = 0;
		for (int n = 0; n < N; n++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			
			for (int i = x; i < x+10; i++)
				for (int j = y; j < y+10; j++) {
					if (!paper[i][j]) {
						cnt++;
						paper[i][j] = true;
					}
				}
		}
		System.out.println(cnt);
	}

}
