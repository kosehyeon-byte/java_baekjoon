package java_251010;

import java.io.*;
import java.util.*;

public class No14425 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int count = 0;
		
		Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }
		
		for (int j = 0; j<m; j++) {
			String test = br.readLine();
			if (set.contains(test)) {count += 1;}
		}
		
		System.out.println(count);
		
		br.close();
	}

}
