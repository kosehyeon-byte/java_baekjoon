package java251023;

import java.io.*;

public class No4948 {
	static boolean[] comp = No1929.sieveFlags(123456*2);	
	
	public static int primenum(int n) {
		int m = 2*n;
		int count = 0;
		
		for (int i = n+1 ; i <= m; i++) {
            if (!comp[i]) count++;
        }
        return count;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			int a = Integer.parseInt(br.readLine());
			if (a == 0) break;
			int count = primenum(a);
			sb.append(count).append('\n');
		}
		
		System.out.println(sb);
		
	}

}
