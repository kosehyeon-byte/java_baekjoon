package java_250926;

import java.io.*;
import java.util.StringTokenizer;


public class No1978_better {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] nums = new int[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            if (nums[i] > max) max = nums[i];
        }

        // ~~
        boolean[] isPrime = new boolean[Math.max(2, max + 1)];
        for (int i = 2; i <= max; i++) isPrime[i] = true;
        for (int p = 2; p * p <= max; p++) {
            if (!isPrime[p]) continue;
            for (int m = p * p; m <= max; m += p) isPrime[m] = false;
        }

        int count = 0;
        for (int x : nums) if (x >= 2 && isPrime[x]) count++;
        System.out.println(count);
    }
}
