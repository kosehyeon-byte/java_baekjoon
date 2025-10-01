package java_250923;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2292 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()) - 1;
		
		for (int i=1; ;i++) {
			if (n - 6*i > 0) {
				n = n - 6*i;
				continue;
			}
			else if (n == 0) {System.out.println(1); break;}
			else {System.out.println(i+1); break;}
		}
		
		br.close();
	}

}
