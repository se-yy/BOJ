package ssafy.com.Feb8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S5_2609 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int max = 1;
		if (A>B) {
			for (int i = 2; i <= B; i++)
				if (A%i==0 && B%i==0)
					max = Math.max(max, i);
		}
		else if(A<B) {
			for (int i = 2; i <= A; i++)
				if (A%i==0 && B%i==0)
					max = Math.max(max, i);
		} else
			max = A;
		System.out.println(max);
		System.out.println(A/max*B);
	}

}
