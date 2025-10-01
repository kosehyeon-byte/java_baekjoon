package java_251001;

import java.io.*;
import java.util.*;

public class No2231 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int length = String.valueOf(n).length();
		int start = n - 9*length;
		
		for (int i = Math.max(1, start); i<n; i++) {
			int sum = i;
			for (char ch : String.valueOf(i).toCharArray()) {
				sum += (int) (ch - '0');
			}
			if (sum == n) {System.out.println(i); return;}
		}
		
		System.out.println(0);
		
		br.close();
	}
}
