package ssafy.com.Feb10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class S5_2578 {
	static class Pair {
		int r, c;
		public Pair(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}
	static int[][] map, master;
	static boolean[][] visit;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		map = new int[5][5];
		master = new int[5][5];
		visit = new boolean[5][5];
		
		Map<Integer, Pair> hm = new HashMap<>();
		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				hm.put(map[i][j], new Pair(i,j));
			}
		}
		
		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++)
				master[i][j] = Integer.parseInt(st.nextToken());
		}
		
		int ans = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				Pair p = hm.get(master[i][j]);
				visit[p.r][p.c] = true;
				ans++;
				
				if (check()) {
					System.out.println(ans);
					return;
				}
			}
		}
	}
	static boolean check() {
		int cnt = 0, isBingo = 0;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++)
				if (visit[i][j]) isBingo++;
			
			if (isBingo == 5) cnt++;
			isBingo = 0;
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++)
				if (visit[j][i]) isBingo++;
			
			if (isBingo == 5) cnt++;
			isBingo = 0;
		}
		
		for (int i = 0; i < 5; i++)
			if (visit[i][i]) isBingo++;
		if (isBingo == 5) cnt++;
		isBingo = 0;
		
		for (int i = 0; i < 5; i++)
			if (visit[i][4-i]) isBingo++;
		if (isBingo == 5) cnt++;
		
		if (cnt >= 3) {
			return true;
		}
		
		return false;
	}
}
