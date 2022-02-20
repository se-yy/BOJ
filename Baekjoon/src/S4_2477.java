

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S4_2477 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int K = Integer.parseInt(br.readLine());
		int[][] arr = new int[6][6];
		
		int maxw=0, maxh=0, widx=0, hidx=0;
		
		for (int i = 0; i < 6; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			
			if (arr[i][0] <= 2) {
				if (arr[i][1] > maxw) {
					maxw = arr[i][1];
					widx = i;
				}
			} else {
				if (arr[i][1] > maxh) {
					maxh = arr[i][1];
					hidx = i;
				}
			}
		}
		int w1 = maxw;
		int h1 = maxh;
		int w2 = arr[(hidx+1)%6][1]-arr[(hidx+5)%6][1];
		int h2 = arr[(widx+1)%6][1]-arr[(widx+5)%6][1];
		w2 = Math.abs(w2); h2 = Math.abs(h2);
		
		int size = (w1*h1)-(w2*h2);
		System.out.println(size*K);
	}

}
