package ssafy.com.Feb10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class S3_2491 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int max = 0;
		boolean isInc = true;
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> list = new Stack<>();
		
		st = new StringTokenizer(br.readLine());
		list.add(Integer.parseInt(st.nextToken()));
		for(int i = 1; i < N; i++) {
			int in = Integer.parseInt(st.nextToken());
			int back = list.peek();
			
			if (isInc) {
				if (in < back) {
					max = Math.max(max, list.size());
					list.pop();
					
					int cnt = 1;
					if (!list.empty() && list.peek() == back) {
						while(!list.empty()) {
							if (list.pop() == back)
								cnt++;
							else break;
						}
						list.clear();
						for (int j = 0; j < cnt; j++)
							list.add(back);
					} else {
						list.clear();
						list.add(back);
					}
					isInc = false;
				}
				list.add(in);
			} else {
				if (in > back) {
					max = Math.max(max, list.size());
					list.pop();
					
					int cnt = 1;
					if (!list.empty() && list.peek() == back) {
						while(!list.empty()) {
							if (list.pop() == back)
								cnt++;
							else break;
						}
						list.clear();
						for (int j = 0; j < cnt; j++)
							list.add(back);
					} else {
						list.clear();
						list.add(back);
					}
					isInc = true;
				}
				list.add(in);
			}
		}
		max = Math.max(max, list.size());
		System.out.println(max);

	}

}
