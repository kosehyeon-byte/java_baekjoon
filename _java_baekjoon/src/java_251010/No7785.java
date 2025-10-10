package java_251010;

import java.io.*;
import java.util.*;

public class No7785 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map<String, List<String>> map = new HashMap<>();
		
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String key = st.nextToken();
			if(map.containsKey(key)) {
				map.get(key).add(st.nextToken());
			} else {
				map.put(key, new ArrayList<>(Arrays.asList(st.nextToken())));
			}
		}
		
		List<String> oddKeys = new ArrayList<>();
		
		for(String key : map.keySet()) {
			List<String> list = map.get(key);
			if (list.size() % 2 == 1) { // 홀수면
                oddKeys.add(key);
            }
		}
		
		Collections.sort(oddKeys, Collections.reverseOrder());
		
		for (String key : oddKeys) {
			System.out.println(key);
		}
		
		
		br.close();
	}

}
