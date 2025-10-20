package java_251021;

import java.io.*;
import java.util.*;

public class No1934_better {
	public static long GCD(long x, long y) {
		long p = Math.max(x,y);
		long q = Math.min(x,y);
		long c;
		
		while (p % q != 0) {
			c = p % q;
			p = q; q = c;
		}
		return q;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long a = Long.parseLong(st.nextToken());
			long b = Long.parseLong(st.nextToken());
			
			sb.append((a/GCD(a,b)) * b).append("\n");
		}
		
		System.out.println(sb.toString());
		
		br.close();
	}

}
