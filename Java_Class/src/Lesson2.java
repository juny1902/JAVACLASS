
public class Lesson2 {
	public static void nineninedan_rev(int e){
		
		for(int i=e; i>1; i--){
			System.out.printf("%d단:\t",i);
			for(int j=e; j>0; j--){
				System.out.printf("%d * %d = %d\t", i,j,i*j);
			}
			System.out.printf("\n");
		}
	}
	public static void nineninedan(int e){
		for(int i=2; i<e; i++){
			for(int j=1; j<e; j++){
				System.out.printf("%d 곱하기 %d 는 %d\n", i,j,i*j);
			}
		}
	}
	public static void inverseTriangle() {
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(" ");
			}
			for (int j = i; j < 11; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void charTest(char c) {
		System.out.print(c + "는 ");
		if ((c >= 65) & (c <= 90)) {
			System.out.println("대문자");
		}
		if ((c >= 97) & (c <= 122)) {
			System.out.println("소문자");
		}
		if ((c > 48) & (c < 57)) {
			System.out.println("숫자");
		}

	}

	public static void stringTest() {
		String strvar1 = "박준영";
		String strvar2 = "박준영";
		String strvar3 = new String("박준영");

		System.out.println(strvar1 == strvar2);
		System.out.println(strvar2 == strvar3); // Not equivalent. (Different
												// Reference)
		System.out.println(strvar2.equals(strvar3)); // Equivalent. (Same
														// String)
		// strvar3 has the new memory address to "박준영"
	}

	public static void testValue() {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		double currentBalance = 10000.0;

		currentBalance += val;
		System.out.println(currentBalance);
	}

	public static void testExec() {
		double a = 5 / 0.0;
		double b = 5 % 0.0;
		if (Double.isInfinite(a) || Double.isNaN(b)) {
			System.out.println("Both are unoperatable.");
		}
	}

	public static void typeDetect() {
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5);
	}

	public static char typeTest() {
		char c1 = 65;
		char c2 = 3;
		char c3 = (char) (c1 + c2);
		return c3;
	}

	public static void overflow_test() {
		int x = (int) 1e6;
		int y = (int) 1e6;
		int z = x * y;
		System.out.println(z);

		long x1 = (long) 1e6;
		long y1 = (long) 1e6;
		long z1 = x1 * y1;
		System.out.println(z1);
	}

	public static void apple() {
		int apple = 1;
		int numberPieces = apple * 10;
		int number = 7;

		double result = (numberPieces - number) / 10.;

		System.out.println(result);
	}
}
