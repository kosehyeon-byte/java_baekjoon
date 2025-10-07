package java_251003;

import java.io.*;

public class No1436 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int idx = 1;
		int start = 666;
		
		while (idx != n) {
			start++;
			String test = String.valueOf(start);
			if (test.contains("666")) idx++;
		}
		
		System.out.println(start);
		
		br.close();
	}

}
