package java251112;

import java.io.*;
import java.util.*;

public class No1037 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] parts = br.readLine().split(" ");

		List<Integer> numList = new ArrayList<>(); // 동적 리스트 생성
		for (String part : parts) { // 배열 순회
			int num = Integer.parseInt(part); // 문자열을 int로 변환
			numList.add(num); // 리스트에 추가
		}

		numList.sort(null);

		long ans = (long) numList.get(0) * numList.get(numList.size() - 1);

		System.out.println(ans);

	}

}
