package java_250924;

import java.io.*;

public class No1193 {
	
	public static int sum(int n) {
		int num = 0;
		for (int i=1; i<=n; i++) {
			num += i;
		}
		return num;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int start = 0;
		int n = Integer.parseInt(br.readLine());
		
		while (true) {
			if (sum(start) < n && n <= sum(start+1)) {
				int line = start + 1;
				n -= sum(start);
				if ((start+1) % 2 != 0) {
					System.out.println((line + 1 - n) + "/" + n);
					break;
				} else {
					System.out.println(n + "/" + (line + 1 - n));
					break;
				}
			}
			start += 1;
		}
		
		br.close();
	}

}
