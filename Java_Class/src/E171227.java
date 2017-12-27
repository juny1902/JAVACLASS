class Calander {
	protected int day;
	protected int hour;
	private int month;

	public static enum days {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}

	public Calander(int month) {
		if (month > 0 && month <= 12) {
			this.month = month;
			System.out.println(month + "월 달력 생성됨.");
		} else {
			System.out.println("달력 생성 실패");
		}
	}

	public void viewMonth() {
		switch (month) {
		case 1:
			System.out.println("Jan");
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("Mar");
			break;
		case 4:
			System.out.println("Apr");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("Jul");
			break;
		case 7:
			System.out.println("Jun");
			break;
		case 8:
			System.out.println("Aug");
			break;
		case 9:
			System.out.println("Sep");
			break;
		case 10:
			System.out.println("Oct");
			break;
		case 11:
			System.out.println("Nov");
			break;
		case 12:
			System.out.println("Dec");
			break;
		}
	}

}

class Notifier extends Calander {
	public Notifier(int month, int day, int hour) {
		super(month);
		this.day = day;
		this.hour = hour;
		// TODO Auto-generated constructor stub
	}

	public void viewNotification() {
		super.viewMonth();
		switch (day) {
		case 1:
			System.out.println("It's monday!");
			break;
		case 2:
			System.out.println("It's tuesday!");
			break;
		case 3:
			System.out.println("It's wednesday!");
			break;
		case 4:
			System.out.println("It's thursday!");
			break;
		case 5:
			System.out.println("It's friday!");
			break;
		case 6:
			System.out.println("It's saturday!");
			break;
		case 7:
			System.out.println("It's sunday!");
			break;
		}
		System.out.println("Your alarm set on " + hour + "'o clock");
	}
}

public class E171227 {
	public static void main(String[] args) {
		Notifier a = new Notifier(12,3,8);
		a.viewNotification();
	}
}
