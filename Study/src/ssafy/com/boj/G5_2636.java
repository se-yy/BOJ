package ssafy.com.boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class G5_2636 {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int n, m, cnt, arr[][];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (arr[i][j] == 1) sum++;
			}
		}
		
		int[][] temp = new int[n][m];
		for (int i = 0; i < n; i++)
			System.arraycopy(arr[i], 0, temp[i], 0, m);
		
		int res = sum, time = 0;
		
		while(sum > 0) {
			res = sum;
			for (int i = 1; i < n-1; i++)
				for (int j = 1; j < m-1; j++) {
					if (arr[i][j] == 0) continue;
					
					for (int k = 0; k < 4; k++) {
						int nx = i+dx[k];
						int ny = j+dy[k];
						
						if (arr[nx][ny]==0) {
							cnt = 0;
							search(nx, ny);
							
							if (cnt>0) {
								sum--;
								temp[i][j]=0;
								break;
							}
						}
					}
				}
			for (int i = 0; i < n; i++)
				System.arraycopy(temp[i], 0, arr[i], 0, m);
			time++;
			
		}
		sb.append(time).append("\n").append(res);
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	static void search(int x, int y) {
		if (x==0 || x==n-1 || y==0 || y==m-1) {
			cnt++;
			return;
		}
		if (arr[x][y]==1)
			return;
		
		for (int i = 0; i < 4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			
			search(nx, ny);
		}
	}
}
