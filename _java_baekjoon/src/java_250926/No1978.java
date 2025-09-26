package java_250926;

import java.awt.List;
import java.util.ArrayList;
import java.io.*;

public class No1978 {

	public static void main(String[] args) throws IOException {
		// 제일 큰 숫자이하 소수 다 구하고
		// 주어진 수 중에서 해당하는 거 count
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		ArrayList<Integer> primenum = new ArrayList<>();
		primenum.add(2); primenum.add(3);
		primenum.add(5); primenum.add(7);
		int count = 0;
		
		int max = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(max < Integer.parseInt(arr[i])) {
				max = Integer.parseInt(arr[i]);
			}
		}
		
		if(max < 11) {
			for(int j=0; j<arr.length; j++) {
				if(primenum.contains(Integer.parseInt(arr[j]))) {count+=1;}
			}
			System.out.println(count);
			br.close();
			return;
		}
		
		boolean bool = true;
		
		//max이하 소수 전부 구해서 primenum에 추가
		for(int k = 11; k<=max; k+=2) {
			bool = true;
			for(int value : primenum) {
				if (value * value > k) break;
				if (k % value == 0) {bool = false; break;}
			}
			if (bool == false) continue;
			else primenum.add(k);
		}
		
		for(int j=0; j<arr.length; j++) {
			if(primenum.contains(Integer.parseInt(arr[j]))) {count+=1;}
		}
		System.out.println(count);
		br.close();
		return;
		
	}
}
