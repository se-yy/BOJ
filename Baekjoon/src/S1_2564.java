

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1_2564 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(br.readLine());
		char[] dir = new char[n];
		int[] dist = new int[n];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			dir[i] = st.nextToken().charAt(0);
			dist[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		char Ddir = st.nextToken().charAt(0);
		int Ddist = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (Ddir == dir[i])
				sum += Math.abs(Ddist-dist[i]);
			else {
				int store = dist[i];
				if (Ddir == '1' || Ddir == '2') {
					if (Ddir == '2') store = h-store;
					switch(dir[i]) {
					case '1':
					case '2':
						sum += Math.min(Ddist+dist[i], 2*w-Ddist-dist[i])+h;
						break;
					case '3':
						sum += Ddist + store;
						break;
					case '4':
						sum += (w-Ddist) + store;
						break;
					}
				} else {
					if (Ddir == '4') store = w-store;
					switch(dir[i]) {
					case '3':
					case '4':
						sum += Math.min(Ddist+dist[i], 2*h-Ddist-dist[i])+w;
						break;
					case '1':
						sum += Ddist + store;
						break;
					case '2':
						sum += (h-Ddist) + store;
						break;
					}
				}
			}
		}
		System.out.println(sum);
		
	}

}
