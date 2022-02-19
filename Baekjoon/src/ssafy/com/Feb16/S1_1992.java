package ssafy.com.Feb16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1_1992 {
	
	static char[][] arr;
	static boolean isSame;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		arr = new char[N][N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine().toCharArray();
		}
		
		divide(N, 0, 0);
		
		System.out.println(sb);
	}
	static void divide(int n, int x, int y) {
		isSame = true;
		for (int i = x; i < x+n; i++) {
			for (int j = y; j < y+n; j++) {
				if (arr[i][j] != arr[x][y]) {
					isSame = false;
					
					sb.append('(');
					divide(n/2, x, y);
					divide(n/2, x, y+n/2);
					divide(n/2, x+n/2, y);
					divide(n/2, x+n/2, y+n/2);
					sb.append(')');
					return;
				}
			}
		}
		if (isSame)
			sb.append(arr[x][y]);
	}
}
