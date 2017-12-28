
public class Keyboard {
	public static int dice() {
		int result = (int) (Math.random() * 6 + 1);
		return result;
	}

	public static void main(String[] args) throws Exception {
		int myTurn;
		while (true) {
			myTurn = dice();
			if (myTurn == 6) {
				break;
			}
			if (myTurn == 3)
			System.out.println("≤Œ ! (" + myTurn + ")");
		}
		System.out.println("¥Á√∑ ! (" + myTurn +")");
	}
}
