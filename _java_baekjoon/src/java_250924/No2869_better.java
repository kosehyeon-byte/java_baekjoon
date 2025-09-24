package java_250924;
// feedback
// ceil 함수 사용
// long 으로 더 큰 수 커버.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2869_better {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr=br.readLine().split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int v = Integer.parseInt(arr[2]);
		int day = 0;
		
		if (a >= v) {System.out.println(1); return;}
		
		if (((v-a)%(a-b)) != 0) { day = ((v-a) / (a-b)) + 2;}
		else {day = ((v-a) / (a-b)) + 1;}
		
		System.out.println(day);
		
		br.close();
	}


}
