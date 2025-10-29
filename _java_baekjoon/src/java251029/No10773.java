package java251029;

import java.io.*;
import java.util.*;

public class No10773 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<>();
		
		int k = Integer.parseInt(br.readLine());
		for (int i=0; i<k; i++) {
			int x = Integer.parseInt(br.readLine());
			if (x == 0) list.remove(list.size() - 1);
			else list.add(x);
		}
		
		for (int i=0; i < list.size(); i++) {
			sum += list.get(i);
		}
		
		System.out.println(sum);
		
		br.close();
	}

}
