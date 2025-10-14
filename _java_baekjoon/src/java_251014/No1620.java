package java_251014;

import java.io.*;
import java.util.*;

public class No1620 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, String> map = new LinkedHashMap<>();
		Map<String, Integer> invmap = new LinkedHashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		for (int i=1; i<=n; i++) {
			map.put(i, br.readLine());
		}
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
	            invmap.put(entry.getValue(), entry.getKey());
		}
		
		List<String> results = new ArrayList<>();
		
		for (int j=0; j<m; j++) {
			String test = br.readLine();
			
			if (test.matches("\\d+")) {
				int index = Integer.parseInt(test);
				if (map.containsKey(index)) {results.add(map.get(index));}
			}
		
			else {
				if (invmap.containsKey(test)) {
					results.add(String.valueOf(invmap.get(test)));
				}
			}
		}
		
		for (String r : results) {
            System.out.println(r);
        }
		
		br.close();
	}

}
