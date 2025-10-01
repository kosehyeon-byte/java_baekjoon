package java_250922;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2745_better {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String[] arr = br.readLine().split(" ");
		int n = Integer.parseInt(arr[1]);
		int len = arr[0].length();
		int num=0;
		
		// acc 누적
		// Character.digit(ch, base) 사용. 분기 필요 x.
		// 수가 금방 커지므로 int 보단 long
		
		System.out.println(num);
		
		
		br.close();


	}

}
