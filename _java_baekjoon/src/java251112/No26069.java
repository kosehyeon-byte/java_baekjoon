package java251112;

import java.io.*;
import java.util.*;

public class No26069 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<String> dance = new HashSet<>();
		dance.add("ChongChong");

		String str1, str2;

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			str1 = st.nextToken();
			str2 = st.nextToken();

			if (dance.contains(str1))
				dance.add(str2);
			else if (dance.contains(str2))
				dance.add(str1);
		}

		System.out.println(dance.size());

		br.close();
	}

}
