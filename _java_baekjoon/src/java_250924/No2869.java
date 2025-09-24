package java_250924;

import java.io.*;

public class No2869 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr=br.readLine().split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int v = Integer.parseInt(arr[2]);
		int height = 0;
		int day = 1;
		
		while (!((height+a) >= v)) {
			height += a;
			height -= b;
			day += 1;
		}
		
		System.out.println(day);
		
		br.close();
	}

}
