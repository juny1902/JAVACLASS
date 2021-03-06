public class ErrorCatch {

	public static void test1() {
		class A {
			String a;
			int b;
		}
		A a = new A();
		A b;
		A c = new A();
		b = a;
		System.out.println(Integer.toHexString(a.hashCode()));
		System.out.println(Integer.toHexString(b.hashCode()));
		System.out.println(c.toString());
		System.out.println(a.equals(b));
		System.out.println(b.equals(a));
		System.out.println(b.equals(c));
	}

	public static void test2() {
		String data = null;
		try {
			System.out.println(data.toString());
		} catch (NullPointerException e) {
			System.out.println("널널널");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("다시 실행하세요");
		}
	}

	public static void test3() {
		int[] a = new int[5];
		try {
			for (int i = 0; i < 6; i++) {
				a[i] = i;
				System.out.printf("a[%d] 에 %d 를 넣습니다.\n", i, i);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 초과");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}

	public static void test4() {
		String pi = "3.141592";
		String num = "123";
		String text = "3aff69bbnde2";

		int a = 3;
		double b = 3.14;
		int c = a + (int) b;

		try {
			Integer.parseInt(pi); // 실수 텍스트 -> 정수 에러.
		} catch (NumberFormatException e) {
			System.out.println("Parse 에러가 났어요");
		}

		System.out.println(Double.parseDouble(num)); // 정수 텍스트 -> 실수 OK

		try {
			Integer.parseInt(text); // 아예 문자열 -> 정수 에러
		} catch (NumberFormatException e) {
			System.out.println("Parse 에러가 났어요");
		}
	}

	public static void test5(String[] args) {
		if (args.length == 2) {
			System.out.println(args[0] + args[1]);
		} else {
			System.out.println(args[0] + args[1] + args[2]);
		}
	}

	
	public static void main(String[] args) {

		test4();
	}
}
