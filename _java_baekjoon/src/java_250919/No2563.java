package java_250919;

import java.io.*;
import java.util.StringTokenizer;

public class No2563 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		boolean[][] arr = new boolean[100][100];
		int area = 0;
		
		for (int i = 0; i < n ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			for (int j=0; j<10; j++) {
				for (int k=0; k<10; k++) {
					if(arr[a+j][b+k] != true) {arr[a+j][b+k] = true; area++;}
				}
			}
		}
		
		System.out.print(area);
		
		br.close();
	}

}
