package ssafy.com.Feb9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B2_2605 {

	public static void main(String[] args) throws IOException {
		LinkedList<Integer> list = new LinkedList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		//StringBuilder sb = new StringBuilder("");
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		list.add(1);
		for (int i = 1; i < N; i++) {
			list.add(i-arr[i], i+1);
		}
		
		for (Integer i : list)
			bw.write(i+" ");
		
		bw.flush();
		bw.close();
		br.close();
	}

}
