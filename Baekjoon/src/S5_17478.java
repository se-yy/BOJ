

import java.util.Scanner;

public class S5_17478 {
	static String[] last = {"\"재귀함수가 뭔가요?\"", "\"재귀함수는 자기 자신을 호출하는 함수라네\"", "라고 답변하였지."};
	static String[] s = {"\"재귀함수가 뭔가요?\"", 
			"\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.", 
			"마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.", 
			"그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"",
			"라고 답변하였지."};
	
	public static void chat(int n, int c) {
		String slash = "";
		for (int i = 0; i < c; i++)
			slash += "_";
		
		if (n == 0) {
			for (int j = 0; j < last.length; j++)
				System.out.println(slash + last[j]);
			return;
		}
		for (int k = 0; k < s.length-1; k++)
			System.out.println(slash + s[k]);
		chat(n-1, c+4);
		System.out.println(slash + s[s.length-1]);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		int cnt = 0;
		chat(n, cnt);
	}

}
