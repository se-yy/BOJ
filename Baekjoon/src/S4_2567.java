import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class S4_2567 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		boolean[][] paper = new boolean[101][101];
		
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			for (int j = a; j < a+10; j++)
				for (int k = b; k < b+10; k++)
					paper[j][k] = true;
		}
		
		boolean now = false;
		int cnt = 0;
		for (int i = 0; i < 101; i++) {
			for (int j = 0; j < 101; j++) {
				if (paper[i][j]!=now) {
					cnt++;
					now = paper[i][j];
				}
			}
			for (int j = 0; j < 101; j++) {
				if (paper[j][i]!=now) {
					cnt++;
					now = paper[j][i];
				}
			}
		}
		System.out.println(cnt);

	}

}
