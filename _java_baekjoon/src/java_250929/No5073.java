package java_250929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No5073 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if (a == 0 && b == 0 && c == 0) {break;}
			
			int max = Math.max(a, Math.max(b, c));
			int sum = a+b+c;
			
			if (max >= sum - max) {System.out.println("Invalid");}
			else if (a==b && b==c) {System.out.println("Equilateral");}
			else if (a==b || b==c || c==a) {System.out.println("Isosceles");}
			else {System.out.println("Scalene");}
		}
		br.close();
	}
}
