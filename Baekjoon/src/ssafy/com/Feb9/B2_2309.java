package ssafy.com.Feb9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class B2_2309 {
	/*static int[] arr = new int[9];
	static int[] num = new int[7];
	static int cnt = 0;*/
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("");
		int[] arr = new int[9];
		int[] num = new int[9];
		int sum = 0;
		
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		outer: for (int i = 0; i < 8; i++) {
			for (int j = i+1; j < 9; j++) {
				System.arraycopy(arr, 0, num, 0, 9);
				num[i] = 0; num[j] = 0;
				
				sum = 0;
				for (int k = 0; k < 9; k++)
					sum += num[k];
				
				if (sum == 100) {
					Arrays.sort(num);
					break outer;
				}
			}		
		}
		for (int i = 2; i < 9; i++)
			sb.append(num[i]).append("\n");
		System.out.print(sb);
		
		
		//choose(0, 0);
	}
	/*static void choose(int idx, int sum) {
		if (cnt==7) {
			if (sum == 100) {
				StringBuilder sb = new StringBuilder("");
				Arrays.sort(num);
				for (int i = 0; i < 7; i++)
					sb.append(num[i]).append("\n");
				System.out.print(sb);
				System.exit(0);
			} else return;
		}
		for (int i = idx; i < 9; i++) {
			sum += arr[i];
			num[cnt++] = arr[i];
			choose(i+1, sum);
			cnt--;
			sum -= arr[i];
		}
		
	}*/

}
