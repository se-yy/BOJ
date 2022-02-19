package ssafy.com.Feb7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class G5_2493 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N]; int[] res = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			res[i] = 0;
		}
		
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < N; i++) {
			while(!stack.isEmpty()) {
				if (arr[stack.peek()-1] < arr[i])
					stack.pop();
				else {
					res[i] = stack.peek();
					break;
				}
			}
			if (stack.isEmpty()) {
				res[i] = 0;
			}
			stack.push(i+1);
		}
		
		for (int i : res)
			System.out.print(i + " ");
	}

}
