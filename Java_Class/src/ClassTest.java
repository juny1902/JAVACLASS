class Printer { // Method overriding.
	public static void println(int n) {
		System.out.println("4바이트 정수 " + n);
	}

	public static void println(boolean n) {
		System.out.println("1바이트 논리 " + n);
	}

	public static void println(double n) {
		System.out.println("4바이트 실수 " + n);
	}

	public static void println(String n) {
		System.out.println("문자열 " + n);
	}
}

class Account {
	private final int MIN_BALANCE = 0;
	private final int MAX_BALANCE = 1000000;
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		int bal_sum = this.balance + balance;

		if (bal_sum > MAX_BALANCE) {
			System.out.println("예금 초과");
			this.balance = MAX_BALANCE;
		} else if (bal_sum < MIN_BALANCE) {
			System.out.println("잔고 부족");
			this.balance = MIN_BALANCE;
		} else
			this.balance = balance;
	}

}

class Member {
	private String name;
	private String id;
	private String password;
	private int age;

	public Member(String name, String id, String pw) {
		this.name = name;
		this.id = id;
		this.password = pw;
	}

	public boolean login(String id, String pw) {
		if (this.id.equals(id) && this.password.equals(pw))
			return true;
		else
			return false;
	}

	public void logout(String id) {
		if (this.id.equals(id))
			System.out.println("Logout successful !");
	}
}

public class ClassTest {

	public static void main(String[] args) {
		Account nh = new Account();
		nh.setBalance(580000);
		nh.setBalance(430000);
		nh.setBalance(-1200000);
		System.out.println(nh.getBalance());
	}

}
