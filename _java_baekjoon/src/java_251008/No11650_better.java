package java_251008;

import java.io.*;
import java.util.*;

public class No11650_better {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] list= new int[n][2];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			list[i][0]=Integer.parseInt(st.nextToken());
			list[i][1]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(list, (a,b) -> {
			if (a[0] != b[0]) return a[0] - b[0];
			else return a[1] - b[1];
			});
		
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<n; i++) {
			sb.append(list[i][0]).append(" ").append(list[i][1]).append("\n");
		}
		System.out.println(sb);
		
		br.close();
	}

}
