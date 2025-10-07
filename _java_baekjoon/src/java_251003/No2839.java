package java_251003;

import java.io.*;

public class No2839 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int ans = -1;
		
		int quota = n/15;
		int remain = n%15;
		for (int i=2; i>=0; i--) {
			if(remain-5*i < 0) continue;
			if((remain - 5*i) % 3 != 0) continue;
			else {
				ans = (quota*3+i+((remain-5*i)/3));
				break;
			}
		}
		System.out.println(ans);
		
		br.close();
	}
}
