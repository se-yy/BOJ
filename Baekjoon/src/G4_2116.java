import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class G4_2116 {
	static int n, sum;
	static Dice dice[][];
	static class Dice {
		int a, b;
		public Dice(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		dice = new Dice[n][3];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int arr[] = new int[6];
			for (int j = 0; j < 6; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			dice[i][0] = new Dice(arr[0], arr[5]);
			dice[i][1] = new Dice(arr[1], arr[3]);
			dice[i][2] = new Dice(arr[2], arr[4]);
		}
		
		for (int i = 0; i < 3; i++) {
			sum = Math.max(sum, find(dice[0][i].a, i));
			sum = Math.max(sum, find(dice[0][i].b, i));
		}
		
		System.out.println(sum);
	}
	
	static int find(int up, int idx) {
		int a, b, nup=0, max=0, total=0;
		
		for (int i = 0; i < 3; i++) {
			if (i == idx) continue;
			a = dice[0][i].a; b = dice[0][i].b;
			max = Math.max(max, a>b ? a : b);
		}
		total += max;
		
		for (int i = 1; i < n; i++) {
			max = 0;
			for (int j = 0; j < 3; j++) {
				if (dice[i][j].a == up)
					nup = dice[i][j].b;
				else if (dice[i][j].b == up)
					nup = dice[i][j].a;
				else {
					a = dice[i][j].a; b = dice[i][j].b;
					max = Math.max(max, a>b ? a : b);
				}
			}
			total += max;
			up = nup;
		}
		return total;
	}
}
