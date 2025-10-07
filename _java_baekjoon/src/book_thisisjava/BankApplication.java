package book_thisisjava;

import java.util.*;

public class BankApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account[] acclist = new Account[100];
		
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("1.new account | 2. account list | 3. deposit | 4. withdrawal | 5. exit");
		System.out.println("-----------------------------------------------------------------------");
		
		
		while (true) {
		System.out.print("select>");
		int n = Integer.parseInt(sc.nextLine());
		
		if (n==1) {
			System.out.println("------------");
			System.out.println("new account");
			System.out.println("------------");
			System.out.print("account num : ");
			String accnum = sc.nextLine();
			System.out.print("owner name : ");
			String name = sc.nextLine();
			System.out.print("first deposit : ");
			int deposit = Integer.parseInt(sc.nextLine());
			
			Account acc = new Account(accnum, name, deposit);
			for (int i=0; i<acclist.length; i++) {
				if (acclist[i] == null) {
					acclist[i] = acc;
					System.out.println("new account generated");
					break;
				}
			}
		}
		
		
		if (n==2) {
			System.out.println("------------");
			System.out.println("account list");
			System.out.println("------------");
			for (int i = 0; i < acclist.length; i++) {
				if (acclist[i] == null) break;
				System.out.print(acclist[i].accnum + " ");
				System.out.print(acclist[i].name + " ");
				System.out.print(acclist[i].deposit);
				System.out.println();
			}
		}
		
		
		
		if (n==3) {
			System.out.println("---------");
			System.out.println("deposit");
			System.out.println("---------");
			System.out.print("account num : ");
			String accnum = sc.nextLine();
			System.out.print("deposit cash : ");
			int deposit = Integer.parseInt(sc.nextLine());
			
			boolean found = false;
			
			for (int i = 0; i < acclist.length; i++) {
				if (acclist[i] == null) break;
				if (accnum.equals(acclist[i].accnum)) {
					acclist[i].addDeposit(deposit);
					found = true;
					break;
				}
			}
			if (!found) {
                System.out.println("해당 계좌번호를 찾을 수 없습니다.");
            }
			
		}
		
		
		
		if (n==4) {
			System.out.println("---------");
			System.out.println("withdrawal");
			System.out.println("---------");
			System.out.print("account num : ");
			String accnum = sc.nextLine();
			System.out.print("withdrawal cash : ");
			int withcash = Integer.parseInt(sc.nextLine());
			
			
			boolean found = false;
			for (int i = 0; i < acclist.length; i++) {
				if (acclist[i] == null) break;
				if (accnum.equals(acclist[i].accnum)) {
					acclist[i].withdrawal(withcash);
					found = true;
					break;
				}
			}
			if (!found) {
                System.out.println("해당 계좌번호를 찾을 수 없습니다.");
            }
			
		}
		if (n==5) {System.out.println("exit program"); sc.close(); return;}
		
		}
		
	}

}
