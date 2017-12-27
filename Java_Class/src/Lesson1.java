import java.util.Scanner;

class Lesson1 {

	public static void randomScore(int CLASSMATE)
	{
		int class_score[] = new int[CLASSMATE];
		int i = 0, score = 0;

		while (i != CLASSMATE ) {
			i++;
			System.out.printf("학생 %d 의 점수 : ",i);
			score = (int)(Math.random()*101);
			if (Lesson1.Grading(score) == false) {
				i--;
				break;
			} else
				class_score[i-1] = score;
		}

		int sum = 0, avg = 0;
		for (int cnt = 0; cnt < i; cnt++) {
			sum += class_score[cnt];
		}

		avg = sum / i;

		System.out.printf("학생수 %d명, 총점은 %d점, 평균 점수는 %d 점 입니다.\n", i, sum, avg);
	}
	public static void isEvenSeq(int i) {
		int cnt;
		for (cnt = i; i > 0; i--) {
			if (cnt % 2 == 0) {
				System.out.println(cnt + "is Even.");
			} else {
				System.out.println(cnt + "is Odd.");
			}
		}
	}

	public static String input_await() {
		Scanner f = new Scanner(System.in);
		String num = f.nextLine();
		System.out.println(isEven(Integer.parseInt(num)));
		f.close();
		return num;
	}

	public static void incre_decre() {
		int var1 = -3;
		int var2 = 3;
		int var3 = 2;

		var1++;
		++var2;

		int result = (var1 + var2) * var3;
		System.out.println(result);
	}

	public static String toBinaryString(int input) {
		String result = Integer.toBinaryString(input);
		while (result.length() < 32) {
			result = '0' + result;
		}
		return result;
	}

	public static void minusnum() {
		short a = 10;
		short s1 = (short) -a; // Have to convert to short (-a is integer.)
		int s2 = -a; // Or likewise. (But the type have changed.)

		System.out.println(a);
		System.out.println(s1);
		System.out.println(s2);
	}

	public static void type_cast() {
		byte byte1 = 1;
		byte byte2 = 2;
		byte sum = (byte) (byte1 + byte2);
		// Auto type-casted to byte + byte = int

		int int1 = 217031203;
		long long1 = 2990333444559448400L;
		long result = int1 + long1;
		// Auto type-casted to int + long = long

		System.out.println(sum);
		System.out.println(result);
	}

	public static void incre_order() {
		int x = 1;
		int y = 1;
		int result1 = ++x + 10; // ++x before x + 10. so 2 + 10
		int result2 = y++ + 10; // y++ after y + 10. so 1 + 10
		System.out.printf("x=%d y=%d \n%d and %d\n", x, y, result1, result2);
	}

	public static boolean alwaysTrue() {
		return true;
	}

	public static void fortune() {
		int num = (int)(Math.random()*6)+1;
		switch(num)
		{
		case 1:
			System.out.println("1번 뽑기");
		case 2:
			System.out.println("2번 뽑기");
		case 3:
			System.out.println("3번 뽑기");
		case 4:
			System.out.println("4번 뽑기");
		case 5:
			System.out.println("5번 뽑기");
		case 6:
			System.out.println("6번 뽑기");
			
		}
	}

	public static void isPositive(int a) {
		if (a > 0)
			System.out.println(a + "(은)는 양수 입니다.");
		else if (a == 0)
			System.out.println("0 입니다.");
		else
			System.out.println(a + "(은)는 음수 입니다.");
	}

	public static boolean Grading(int a) {
		if (a > 100 || a < 0) {
			System.out.println("입력 종료");
			return false;
		} else if (a >= 90)
			System.out.println(a + "(은)는 A");
		else if (a < 90 && a >= 80)
			System.out.println(a + "(은)는 B");
		else if (a < 80 && a >= 70)
			System.out.println(a + "(은)는 C");
		else if (a < 70 && a >= 60)
			System.out.println(a + "(은)는 D");
		else
			System.out.println(a + "(은)는 F");

		return true;
	}

	public static boolean isEven(int i) {
		return (i % 2 == 0) ? true : false;
	}

	public static void decre_order() {
		int x = 1;
		int y = 1;
		int result1 = --x + 10; // ++x before x + 10. so 2 + 10
		int result2 = y-- + 10; // y++ after y + 10. so 1 + 10
		System.out.printf("x=%d y=%d \n%d and %d\n", x, y, result1, result2);
	}
}