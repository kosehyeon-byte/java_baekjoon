package java_251008;

import java.io.*;
import java.util.*;

public class No1427 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		int[] list = new int[n.length()];
		for (int i=0; i<n.length(); i++) {
			list[i] = n.charAt(i) - '0';
		}
		
		Arrays.sort(list);
		
		for (int i=0; i < n.length()/2; i++) {
			int temp = list[i];
			list[i] = list[n.length()-1-i];
			list[n.length()-1-i] = temp;
		}
		
		for(int i=0; i<n.length(); i++) {
			System.out.print(list[i]);
		}
		
		br.close();
	}

}
