package java251023;

import java.util.*;
import java.io.*;

public class No1929 {
	public static boolean[] sieveFlags(int n) {
        boolean[] comp = new boolean[n + 1];
        if (n >= 0) comp[0] = true;
        if (n >= 1) comp[1] = true;

        for (int i = 2; i <= n / i; i++) { // i*i <= n
            if (!comp[i]) {
                for (int j = i * i; j <= n; j += i) comp[j] = true;
            }
        }
        return comp; // comp[x] == false => 소수
    }
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        boolean[] comp = sieveFlags(m);
        StringBuilder sb = new StringBuilder();
        for (int i = n; i <= m; i++) {
            if (!comp[i]) sb.append(i).append('\n');
        }
        System.out.print(sb);
	}

}
