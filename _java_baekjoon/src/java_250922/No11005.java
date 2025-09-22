package java_250922;

import java.io.BufferedReader;
import java.io.*;

public class No11005 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = br.readLine().split(" ");
		int testnum = Integer.parseInt(arr[0]);
		int base = Integer.parseInt(arr[1]);
		StringBuilder sb = new StringBuilder();
		
		
		while (testnum != 0) {
			sb.append(Character.toUpperCase(Character.forDigit(testnum % base, base)));
			testnum = testnum / base;
		}
		
		System.out.println(sb.reverse().toString());
		
		br.close();

	}

}
