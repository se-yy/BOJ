

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2_16926 {
	static int N, M, R;
	static int[][] arr;
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {1, 0, -1, 0};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder("");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		arr = new int[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++)
				arr[i][j] = Integer.parseInt(st.nextToken());
		}
		int min = Math.min(N, M)/2;
		
		for (int i = 0; i < R; i++)
			rotate(min);
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++)
				sb.append(arr[i][j]).append(" ");
			sb.append("\n");
		}
		System.out.print(sb);
	}
	static void rotate(int s) {
		for (int i = 0; i < s; i++) {
			int sx = i, sy = i, dir = 0;
			int temp = arr[sx][sy];
			
			while (dir < 4) {
				int nx = sx + dx[dir];
				int ny = sy + dy[dir];
				
				if (nx < N-i && nx >= i && ny < M-i && ny >= i) {
					arr[sx][sy] = arr[nx][ny];
					sx = nx;
					sy = ny;
				} else {
					dir++;
				}
			}
			arr[i+1][i] = temp;
		}
	}
}
