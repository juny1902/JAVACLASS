class ThreadSum extends Thread {

	private int sum = 0;

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			sum += 1;
		}
	}

	public int getSum() {
		return sum;
	}
}

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		ThreadSum[] t = new ThreadSum[8];
		int sum = 0;
		for (int i = 0; i < 8; i++) {
			t[i] = new ThreadSum();
			t[i].run();
		}
		for (int i = 0; i< 8; i++) {
			t[i].join();
			sum += t[i].getSum();
		}
		
		System.out.println(sum);
	}

}
