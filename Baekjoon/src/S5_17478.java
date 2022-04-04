import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class S5_17478 {
	static int n;
	static StringBuilder sb = new StringBuilder();
	static String[] s = {"\"재귀함수가 뭔가요?\"", 
			"\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.",
			"마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.",
			"그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"",
			"라고 답변하였지."};
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = sc.nextInt();
		
		sb.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.").append("\n");
		answer(0, "");
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
	
	static void answer(int cnt, String dash) {
		if (cnt == n) {
			sb.append(dash).append(s[0]).append("\n");
			sb.append(dash).append("\"재귀함수는 자기 자신을 호출하는 함수라네\"").append("\n");
			sb.append(dash).append(s[4]).append("\n");
			return;
		}
		
		sb.append(dash).append(s[0]).append("\n");
		sb.append(dash).append(s[1]).append("\n");
		sb.append(dash).append(s[2]).append("\n");
		sb.append(dash).append(s[3]).append("\n");
		answer(cnt+1, dash+"____");
		sb.append(dash).append(s[4]).append("\n");
	}
}
