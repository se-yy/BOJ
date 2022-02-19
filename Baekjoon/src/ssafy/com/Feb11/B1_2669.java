package ssafy.com.Feb11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1_2669 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		boolean[][] color = new boolean[100][100];
		int[][] x = new int[4][2];
		int[][] y = new int[4][2];
		int minx=100, miny=100, maxx=0, maxy=0;
		
		for(int i = 0; i < 4; i++) {
			st = new StringTokenizer(br.readLine());
			x[i][0] = Integer.parseInt(st.nextToken());
			y[i][0] = Integer.parseInt(st.nextToken());
			x[i][1] = Integer.parseInt(st.nextToken());
			y[i][1] = Integer.parseInt(st.nextToken());
			
			minx = Math.min(minx, x[i][0]);
			miny = Math.min(miny, y[i][0]);
			maxx = Math.max(maxx, x[i][1]);
			maxy = Math.max(maxy, y[i][1]);
			
			for (int j = x[i][0]; j < x[i][1]; j++)
				for (int k = y[i][0]; k < y[i][1]; k++)
					color[j][k] = true;
		}
		int cnt = 0;
		for (int i = minx; i < maxx; i++)
			for (int j = miny; j < maxy; j++)
				if (color[i][j])
					cnt++;
		System.out.println(cnt);
	}

}
