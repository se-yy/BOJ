

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3_1244 {
	static boolean[] arr;
	static int N;
	
	public static void boy(int n) {
		for (int i = 0; i < N; i++) {
			if ((i+1)%n == 0)
				arr[i] = !(arr[i]);
		}
	}
	public static void girl(int n) {
		arr[n] = !(arr[n]);
			
		for (int i = 1; i <= N/2; i++) {
			if (n-i >= 0 && n+i < N && arr[n-i] == arr[n+i]) {
				arr[n-i] = !(arr[n-i]);
				arr[n+i] = !(arr[n+i]);
			} else break;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new boolean[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			if (Integer.parseInt(st.nextToken())==1)
				arr[i] = true;
			else arr[i] = false;
		}
		
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			if (Integer.parseInt(st.nextToken())==1)
				boy(Integer.parseInt(st.nextToken()));
			else
				girl(Integer.parseInt(st.nextToken())-1);
		}
		for (int i = 0; i < N; i++) {
			if (arr[i])
				System.out.print(1);
			else System.out.print(0);
			System.out.printf((i+1)%20==0?"%n":" ");
		}
	}

}
