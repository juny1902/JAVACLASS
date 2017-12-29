package sec07.exam01_enum;

public class EnumMethodExample {
	public static void main(String[] args) {		
		//name() �޼ҵ�
		Week today = Week.SUNDAY;
		String name = today.name(); // ����� ���ڿ� ���
		System.out.println(name);
		
		//ordinal() �޼ҵ�
		int ordinal = today.ordinal(); // ����� ���� (�ε���) ���.
		System.out.println(ordinal);

		//compareTo() �޼ҵ�
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2); // day1 �� day2 ���� -2 ��ġ�� ����.
		int result2 = day2.compareTo(day1); // day2 �� day1 ���� +2 ��ġ�� ����.
		System.out.println(result1);
		System.out.println(result2);

		//valueOf() �޼ҵ�
		/*Week weekDay = Week.valueOf("SUNDAY");
		if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
			System.out.println("�ָ� �̱���");
		} else {
			System.out.println("���� �̱���");
		}*/
		
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("�ָ� �̱���");
			} else {
				System.out.println("���� �̱���");
			}
		}
		
		//values() �޼ҵ�
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
	}
}
