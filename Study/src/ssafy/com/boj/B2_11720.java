package ssafy.com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2_11720 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] array = new int[n];
		
		String[] s = br.readLine().split("");
		int sum = 0;
		for (int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(s[i]);
			sum += array[i];
		}
		System.out.println(sum);
	}

}
