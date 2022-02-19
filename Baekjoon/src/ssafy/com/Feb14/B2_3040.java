package ssafy.com.Feb14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2_3040 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[9];
		int total = 0;
		
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			total += arr[i];
		}
		
		int i=0, j=0;
		outer: for (i = 0; i < 9; i++) {
			for (j = i+1; j < 9; j++) {
				int temp = arr[i];
				temp += arr[j];
				if (total - temp == 100)
					break outer;
					
			}
		}
		for (int k = 0; k < 9; k++) {
			if (k==i) continue;
			if (k==j) continue;
			sb.append(arr[k]).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
