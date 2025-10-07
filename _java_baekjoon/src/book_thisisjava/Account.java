package book_thisisjava;

public class Account {
	String accnum;
	String name;
	int deposit;
	
	Account(String accnum, String name, int deposit){
		this.accnum = accnum;
		this.name = name;
		this.deposit = deposit;
	}
	
	void addDeposit(int deposit) {
		if (deposit <= 0) {
            System.out.println("입금액은 0보다 커야 합니다.");
            return;
        }
		this.deposit += deposit;
		System.out.println("deposit succeeded");
	}
	
	void withdrawal(int amount) {
		if (amount <= 0) {
			System.out.println("출금액은 0보다 커야 합니다.");
			return;
        }
		if (this.deposit < amount) {System.out.println("잔액 부족"); return;}
		this.deposit -= amount;
		System.out.println("withdrawal succeeded");
	}
}
