package ssafy.com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class S5_11650 {

	/*public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] array = new int[n][2];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			array[i][0] = Integer.parseInt(st.nextToken());
			array[i][1] = Integer.parseInt(st.nextToken());
			array[i][0] = sc.nextInt();
			array[i][1] = sc.nextInt();
		}
		
		Arrays.sort(array, (o1, o2) -> {
			if (o1[0] == o2[0]) {
				return Integer.compare(o1[1], o2[1]);
			} else {
				return Integer.compare(o1[0], o2[1]);
			}
		});
		for (int i = 0; i < n-1; i++) {
			min = i;
			for (int j = i+1; j < n; j++) {
				if (array[j][0] < array[min][0]) {
					min = j;
				}
				else if (array[j][0] == array[min][0] && array[j][1] < array[min][1]) {
					min = j;
				}
			}
			swap(array, i, min);
		}
		for (int i = 0; i < n; i++) {
			System.out.println(array[i][0] + " " + array[i][1]);
		}
	}*/
	/*public static void swap(int[][] arr, int a, int b) {
		int temp1 = arr[a][0]; int temp2 = arr[a][1];
		arr[a][0] = arr[b][0]; arr[a][1] = arr[b][1];
		arr[b][0] = temp1; arr[b][1] = temp2;
	}*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[][]  = new int[N][2];

		for (int i = 0; i < N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		Arrays.sort(arr,(a,b)->{
			if(a[0] == b[0]) {
				return a[1] - b[1];
			}else {
				return a[0] - b[0];
			}
		});
		
		for (int i = 0; i < N; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}
}
