package sec06_throws;

public class ThrowsExample {
	public static void main(String[] args) {
		try {
			findClass(); // 이 부분에 대하여 예외를 처리해야 함.
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}

	public static void findClass() throws ClassNotFoundException { // 예외처리를 메소드로
																	// 떠넘기기
		Class clazz = Class.forName("java.util.Arrays");
	}
}
