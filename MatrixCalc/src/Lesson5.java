public class Lesson5 {
	public static void sum(int[] num_t) {
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < num_t.length; i++) {
			sum += num_t[i];
		}
		avg = (double) sum / (double) num_t.length;
		System.out.println(sum);
		System.out.println(avg);
	}

	public static void namePrint2(String[] names) {
		for (String arg : names) {
			System.out.println(arg);
		}
	}

	public static void namePrint(String[] names) {
		for (int i = 0; i < names.length; i++)
			System.out.println("My name is " + names[i] + ".");
	}

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("No Arguments.");
			System.exit(0);
		}
		String arg1 = args[0];
		System.out.println("Command line argument : " + arg1);

		switch (arg1) {
		case "namePrint":
			namePrint(new String[] { "Ryan", "Peter", "James", "Patrik" });
			break;
		case "namePrint2":
			namePrint2(new String[] { "Kim", "Park", "Choi", "Lee" });
			break;
		case "sum":
			sum(new int[] { 90, 100, 30, 50, 70, 67, 54, 33, 85, 62 });
			break;
		}
	}
}
