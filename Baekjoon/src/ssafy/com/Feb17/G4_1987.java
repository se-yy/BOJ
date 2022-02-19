package ssafy.com.Feb17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class G4_1987 {
	static char[][] arr;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static boolean[] al = new boolean[26];
	static int max, n, m;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new char[n][m]; 
		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine().toCharArray();
		}
		
		go(0, 0, 0);
		
		System.out.println(max);
	}
	static void go(int x, int y, int cnt) {
		if (al[arr[x][y]-'A']) {
			max = Math.max(max, cnt);
			return;
		}
		al[arr[x][y]-'A'] = true;
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if (nx>=0 && nx<n && ny>=0 && ny<m)
				go(nx, ny, cnt+1);
		}
		al[arr[x][y]-'A'] = false;
	}

}
