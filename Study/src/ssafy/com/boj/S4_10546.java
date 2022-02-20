package ssafy.com.boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class S4_10546 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		String s;
		int n = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < n; i++) {
			s = br.readLine();
			
			if (map.get(s)==null)
				map.put(s, 1);
			else
				map.put(s, map.get(s)+1);
		}
		
		for (int i = 0; i < n-1; i++) {
			s = br.readLine();
			map.put(s, map.get(s)-1);
		}
		
		for (String key : map.keySet()) {
			if (map.get(key) != 0) {
				bw.write(key);
				break;
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
