package java_250929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10101 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ang1 = Integer.parseInt(br.readLine());
		int ang2 = Integer.parseInt(br.readLine());
		int ang3 = Integer.parseInt(br.readLine());
		int totalang = ang1+ang2+ang3;
		
		if (totalang != 180) {System.out.println("Error");}
		else if (ang1 == ang2 && ang2 == ang3) {System.out.println("Equilateral");}
		else if (ang1 == ang2 || ang1 == ang3 || ang2 == ang3) {System.out.println("Isosceles");}	
		else {System.out.println("Scalene");}
		
		br.close();
	}
}
