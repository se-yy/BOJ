package ssafy.com.boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class S2_18870 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder("");
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] sorted = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		System.arraycopy(arr, 0, sorted, 0, N);
		Arrays.sort(sorted);
		
		Map<Integer, Integer> map = new HashMap<>();
		int cnt = 0;
		
		for (int i : sorted)
			if (!map.containsKey(i))
				map.put(i, cnt++);
		
		for (int i : arr)
			sb.append(map.get(i)).append(' ');
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
