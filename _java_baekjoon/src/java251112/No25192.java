package java251112;

import java.io.*;
import java.util.*;

public class No25192 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();
		int ans = 0;

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			if (str.equals("ENTER")) {
				ans += set.size();
				set.clear();
				continue;
			}
			set.add(str);
		}

		ans += set.size();

		System.out.println(ans);

		br.close();
	}

}
