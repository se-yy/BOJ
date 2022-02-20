

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1_16935 {
	static int N, M, R;
	static int[][] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("");
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		
		arr = new int[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++)
				arr[i][j] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < R; i++) {
			switch(Integer.parseInt(st.nextToken())) {
			case 1: upDown(); break;
			case 2: leftRight(); break;
			case 3: right90(); break;
			case 4: left90(); break;
			case 5: rightRo(); break;
			case 6: leftRo(); break;
			}
		}
		for (int[] i : arr) {
			for (int j : i)
				sb.append(j).append(" ");
			sb.append("\n");
		}
		System.out.print(sb);
	}
	static void upDown() {
		int temp;
		
		for (int i = 0; i < N/2; i++) {
			for (int j = 0; j < M; j++) {
				temp = arr[i][j];
				arr[i][j] = arr[N-i-1][j];
				arr[N-i-1][j] = temp;
			}
		}
	}
	static void leftRight() {
		int temp;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M/2; j++) {
				temp = arr[i][j];
				arr[i][j] = arr[i][M-j-1];
				arr[i][M-j-1] = temp;
			}
		}
	}
	static void right90() {
		int[][] temp = new int[M][N];
		
		for (int i = 0; i < M; i++){
			for (int j = 0; j < N; j++) {
				temp[i][j] = arr[N-j-1][i];
			}
		}
		arr = new int[M][N];
		for (int i = 0; i < M; i++) {
			System.arraycopy(temp[i], 0, arr[i], 0, N);
		}
		
		int t = N;
		N = M;
		M = t;
	}
	static void left90() {
		int[][] temp = new int[M][N];
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				temp[i][j] = arr[j][M-i-1];
			}
		}
		arr = new int[M][N];
		for (int i = 0; i < M; i++) {
			System.arraycopy(temp[i], 0, arr[i], 0, N);
		}
		
		int t = N;
		N = M;
		M = t;
	}
	static void rightRo() {
		int[][] temp = new int[N/2][M/2];
		
		for (int i = 0; i < N/2; i++)
			System.arraycopy(arr[i], 0, temp[i], 0, M/2);
		
		// 1
		for (int i = 0; i < N/2; i++) {
			for (int j = 0; j < M/2; j++) {
				arr[i][j] = arr[N/2+i][j];
			}
		}
		// 4
		for (int i = N/2; i < N; i++) {
			for (int j = 0; j < M/2; j++) {
				arr[i][j] = arr[i][M/2+j];
			}
		}
		// 3
		for (int i = N/2; i < N; i++) {
			for (int j = M/2; j < M; j++) {
				arr[i][j] = arr[i-N/2][j];
			}
		}
		// 2
		for (int i = 0; i < N/2; i++)
			System.arraycopy(temp[i], 0, arr[i], M/2, M/2);
	}
	static void leftRo() {
		int[][] temp = new int[N/2][M/2];
		
		for (int i = 0; i < N/2; i++)
			System.arraycopy(arr[i], 0, temp[i], 0, M/2);
		
		// 1
		for (int i = 0; i < N/2; i++) {
			for (int j = 0; j < M/2; j++) {
				arr[i][j] = arr[i][M/2+j];
			}
		}
		// 2
		for (int i = 0; i < N/2; i++)
			for (int j = M/2; j < M; j++)
				arr[i][j] = arr[N/2+i][j];
		// 3
		for (int i = N/2; i < N; i++) {
			for (int j = M/2; j < M; j++) {
				arr[i][j] = arr[i][j-M/2];
			}
		}
		// 4
		for (int i = N/2; i < N; i++)
			System.arraycopy(temp[i-N/2], 0, arr[i], 0, M/2);
	}
}
