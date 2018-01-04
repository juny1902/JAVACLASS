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
			System.out.println("�γγ�");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("�ٽ� �����ϼ���");
		}
	}

	public static void test3() {
		int[] a = new int[5];
		try {
			for (int i = 0; i < 6; i++) {
				a[i] = i;
				System.out.printf("a[%d] �� %d �� �ֽ��ϴ�.\n", i, i);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�ε��� �ʰ�");
		} finally {
			System.out.println("�ٽ� �����ϼ���.");
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
			Integer.parseInt(pi); // �Ǽ� �ؽ�Ʈ -> ���� ����.
		} catch (NumberFormatException e) {
			System.out.println("Parse ������ �����");
		}

		System.out.println(Double.parseDouble(num)); // ���� �ؽ�Ʈ -> �Ǽ� OK

		try {
			Integer.parseInt(text); // �ƿ� ���ڿ� -> ���� ����
		} catch (NumberFormatException e) {
			System.out.println("Parse ������ �����");
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