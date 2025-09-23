package java_250923;

import java.io.*;

public class No2903 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int n = 2;
		for (int i=0; i < num; i++) {
			n = n + (n-1);
		}
		
		System.out.println(n*n);
		
		br.close();
	}

}
