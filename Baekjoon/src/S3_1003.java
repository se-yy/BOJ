

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S3_1003 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			int zero = 0, one = 0, b;
			int N = Integer.parseInt(br.readLine());
			if (N==0)
				zero = 1;
			else if (N==1)
				one = 1;
			else if (N==2) {
				zero = 1; one = 1;
			}
			else {
				one = 2; zero = 1;
				b = 1;
				for (int i = 4; i <= N; i++) {
					int temp = zero;
					zero += b;
					b = temp;
					one = zero + b;
				}
			}
			System.out.println(zero+" "+one);
		}
	}

}
