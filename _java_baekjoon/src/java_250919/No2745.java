package java_250919;

import java.io.*;

public class No2745 {
	
	char c = 'A';
	int value;

	
	


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String[] arr = br.readLine().split(" ");
		int n = Integer.parseInt(arr[1]);
		int len = arr[0].length();
		int num=0;
		
		if (n <= 10) {
			for (int i = 0; i < len; i++) {
				num += (int) ( arr[0].charAt(len - (i+1) - '0') * Math.pow(n, i) );
			}
		} else {
			for (int i = 0; i < len; i++) {
				if (Character.isDigit(arr[0].charAt(len - (i+1)))) {
					num += (int) ( arr[0].charAt(len - (i+1) - '0') * Math.pow(n, i) );        // '0'~'9' → 0~9
				} else {
				    num += (int) ((arr[0].charAt(len-(i+1)-'A'+10)) * Math.pow(n, i));    // 'A'~'F' → 10~15
				}
			}
		}
		
		System.out.println(num);
		
		
		br.close();

	}

}
