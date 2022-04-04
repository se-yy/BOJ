import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class S3_1244 {
	
	static int[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		arr = new int[n+1];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		int cnt = Integer.parseInt(br.readLine());
		for (int i = 0; i < cnt; i++) {
			st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			
			switch(m) {
			case 1:
				for (int j = 1; j <= n/p; j++) {
					int temp = p*j;
					change(temp);
				}
				break;
			case 2:
				change(p);
				for (int j = 1; j <= n/2; j++) {
					if (p-j < 1 || p+j > n)
						break;
					
					if (arr[p-j] != arr[p+j])
						break;
					
					change(p-j); change(p+j);
				}
				break;
			}
			
		}
		
		for (int i = 1; i <= n; i++)
			sb.append(arr[i]).append(" ");
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	static void change(int t) {
		if (arr[t]==0)
			arr[t] = 1;
		else
			arr[t] = 0;
	}
}
