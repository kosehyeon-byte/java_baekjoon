package java_250929;

import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.*;

public class No9063 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int minx = Integer.MAX_VALUE, miny = Integer.MAX_VALUE;
		int maxx = Integer.MIN_VALUE, maxy = Integer.MIN_VALUE;
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			if (x < minx) minx = x;
			if (x > maxx) maxx = x;
			if (y < miny) miny = y;
			if (y > maxy) maxy = y;
		}
		
		int area = (maxx-minx)*(maxy-miny);
		System.out.println(area);
		br.close();
	}

}
