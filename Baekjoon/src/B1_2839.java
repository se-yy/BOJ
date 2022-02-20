

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1_2839 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int sum = 0, m;
		int five = N/5;
		
		for (int i = five; i >= 0; i--) {
			m = N-(5*i);
			if (m%3==0) {
				sum += i;
				sum += m/3;
				break;
			}
		}
		if (sum==0) {
			System.out.println(-1);
		}else
			System.out.println(sum);
	}

}
