package java_250922;

import java.io.*;

public class No2720 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[4];
		int[] coin = {25, 10, 5, 1};
		
		for (int i = 0; i < n; i++) {
			int rem = Integer.parseInt(br.readLine());
			for (int j=0; j<4; j++) {
				arr[j] = rem / coin[j];
				rem = rem - coin[j]*arr[j];
			}
			
			for (int k=0; k<arr.length; k++) {
				System.out.print(arr[k] + " ");
			}
			
			System.out.println();
		}
		
		br.close();
	}

}
