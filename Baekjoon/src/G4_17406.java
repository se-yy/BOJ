

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class G4_17406 {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] arr;
	static int[] r, c, s, res;
	static int N, M, K, min = 5000;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		arr = new int[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				int b = Integer.parseInt(st.nextToken());
				arr[i][j] = b;
			}
		}
		
		r = new int[K];
		c = new int[K];
		s = new int[K];
		res = new int[K];
		visited = new boolean[K];
		
		for (int k = 0; k < K; k++) {
			st = new StringTokenizer(br.readLine());
			r[k] = Integer.parseInt(st.nextToken())-1;
			c[k] = Integer.parseInt(st.nextToken())-1;
			s[k] = Integer.parseInt(st.nextToken());
		}
		
		order(0);
		
		System.out.println(min);
	}
	static void order(int cnt) {
		if (cnt == K) {
			int[][] copy = new int[N][M];
			for (int i = 0; i < N; i++)
				System.arraycopy(arr[i], 0, copy[i], 0, M);
			findMin(copy);
			return;
		}
		for (int i = 0; i < K; i++) {
			if (visited[i] == true)
				continue;
			
			res[cnt] = i;
			visited[i] = true;
			order(cnt+1);
			visited[i] = false;
		}
	}
	static void findMin(int[][] copy) {
		for (int i = 0; i < K; i++) {
			rotate(r[res[i]], c[res[i]], s[res[i]], copy);
		}
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum = 0;
			for (int j = 0; j < M; j++)
				sum += copy[i][j];
			min = Math.min(min, sum);
		}
	}
	static void rotate(int r, int c, int s, int[][] copy) {
		for (int i = 0; i < s; i++) {
			int sx = r-s+i, sy = c-s+i;
			int px = sx, py = sy;
			int temp = copy[sx][sy];
			int dir = 0, nx = 0, ny = 0;
			
			while(dir < 4) {
				nx = px + dx[dir];
				ny = py + dy[dir];
				
				if (nx>=sx && nx<=r+s-i && ny>=sy && ny<=c+s-i) {
					copy[px][py] = copy[nx][ny];
					px = nx; py = ny;
				} else dir++;
			}
			copy[sx][sy+1] = temp;
		}
	}
}
