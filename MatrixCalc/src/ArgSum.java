
public class ArgSum {

	public static void arrayCopy1() {
		int[] oldIntArray = { 1, 2, 3, 4, 5 };
		int[] newIntArray = new int[20];
		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		for (int i = 0; i < newIntArray.length; i++) {
			if (newIntArray[i] == 0) {
				newIntArray[i] = 10;
			}
			System.out.print(newIntArray[i] + "\t");
		}
	}

	public static void arrayCopy2() {
		String[] names_A = { "Ryan", "Peter", "Harry", "Ron" };
		String[] names_C = { "Patrik", "John", "Talulla", "Park", "Barry", "Jack" };
		String[] names_B = new String[10];

		System.arraycopy(names_A, 0, names_B, 0, names_A.length);
		System.arraycopy(names_C, 0, names_B, 4, names_C.length);
		for (String n : names_B) {
			System.out.print(n + "\t\t");
		}
	}

	public static void main(String args[]) {
		System.out.println("Today is " + Weekdays.FRI + " of " + Seasons.FALL);
		arrayCopy2();
	}
}
