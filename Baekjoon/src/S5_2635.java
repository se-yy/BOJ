

import java.util.ArrayList;
import java.util.Scanner;

public class S5_2635 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> res = new ArrayList<>();
		
		for (int i = N/2; i <= N; i++) {
			ArrayList<Integer> list = new ArrayList<>();
			list.add(N);
			list.add(i);
			
			while(true) {
				int a = list.get(list.size()-2);
				int b = list.get(list.size()-1);
				
				if (a-b >= 0)
					list.add(a-b);
				else
					break;
			}
			if (list.size() > res.size()) {
				res.clear();
				for (int j = 0; j < list.size(); j++)
					res.add(list.get(j));
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(res.size()).append("\n");
		for (int i = 0; i < res.size(); i++)
			sb.append(res.get(i)).append(" ");
		
		System.out.println(sb.toString());

	}

}
