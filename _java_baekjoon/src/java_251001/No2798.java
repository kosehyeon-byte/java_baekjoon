package java_251001;

import java.io.*;

public class No2798 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strarr = br.readLine().split(" ");
		int n = Integer.parseInt(strarr[0]);
		int m = Integer.parseInt(strarr[1]);
		String[] strarr2 = br.readLine().split(" ");
		int[] numarr = new int[n];
		
		for (int i = 0; i < n; i++) {
			numarr[i] = Integer.parseInt(strarr2[i]);
		}
		
		int max = -1;
		
		for (int j = 0; j<(n-2); j++) {
			for (int k = j+1; k<(n-1); k++) {
				for (int l = k+1; l < n; l++) {
					int sum = numarr[j] + numarr[k] + numarr[l];
					if (sum > max && sum <= m) max = sum;
				}
			}
		}
		
		System.out.println(max);
		
		br.close();
	}

}
