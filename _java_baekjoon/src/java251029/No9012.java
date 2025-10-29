package java251029;

import java.io.*;


public class No9012 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i=0; i<t; i++) {
			int balance = 0;
			String test = br.readLine();
			for (int j=0; j < test.length(); j++) {
				if (test.charAt(j) == '(') balance++;
				else if (test.charAt(j) == ')') balance--;
				
				if (balance < 0) break;
			}
			
			if (balance != 0) ans.append("NO").append("\n");
			else ans.append("YES").append("\n");
		}
		
		System.out.println(ans.toString());

	}

}
