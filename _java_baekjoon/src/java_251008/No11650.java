package java_251008;

import java.io.*;
import java.util.*;

public class No11650 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String[]> list = new ArrayList<String[]>();
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String[] strarr = br.readLine().split(" ");
			if (i==0) list.add(strarr);
			else {
				for (int j=0; j < list.size(); j++) {
					int xtest = Integer.parseInt(list.get(j)[0]);
					int xnew = Integer.parseInt(strarr[0]);
					
					if (xtest > xnew) {
						list.add(j, strarr); break;
					} else if (xtest == xnew) {
						int ytest = Integer.parseInt(list.get(j)[1]);
						int ynew = Integer.parseInt(strarr[1]);
						
						if (ytest >= ynew) {
							list.add(j, strarr); break;
						} else {
							if (j != list.size() - 1) continue;
							else list.add(strarr);
						}
					} else {
						if (j != list.size() - 1) continue;
						else list.add(strarr);
					}
				}
			}
		}
		for (String[] s : list) {
			System.out.println(s[0] + " " + s[1]);
		}
		
		br.close();
	}

}
