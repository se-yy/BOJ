package ssafy.com.boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class S3_16967 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
		
		int nh = H+X, nw = W+Y;
		int[][] B = new int[nh][nw];
		for (int i = 0; i < nh; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < nw; j++)
				B[i][j] = Integer.parseInt(st.nextToken());
		}
		
		int[][] A = new int[H][W];
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (i < X)
					A[i][j] = B[i][j];
				else {
					if (j < Y)
						A[i][j] = B[i][j];
					else {
						A[i][j] = B[i][j]-A[i-X][j-Y];
					}
				}
			}
		}
		
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				sb.append(A[i][j]).append(" ");
			}
			sb.append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();

	}

}
