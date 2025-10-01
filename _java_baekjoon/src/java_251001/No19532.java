package java_251001;

import java.io.*;
import java.util.*;

public class No19532 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());
		
		int det = a*e - b*d;
		int detx = c*e - b*f;
		int dety = a*f - c*d;
		
		System.out.print(detx/det + " ");
		System.out.println(dety/det);
		
		br.close();
	}

}
