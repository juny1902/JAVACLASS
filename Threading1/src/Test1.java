class PartialSum extends Thread {

	private long sum = 0;
	private long[] division = null;

	public PartialSum(long start, long end, int partition) {
		division = new long[partition + 1];
		long area = (end - start) / partition;
		for (int i = 0; i < partition + 1; i++) {
			division[i] = area * i;
			System.out.printf("division[%d] = %d\n", i, division[i]);
		}
	}

	public long getSum() {
		return sum;
	}

	public void run() {
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
	}
}

public class Test1 {
	public static void main(String[] args) {
		PartialSum s = new PartialSum(0, 1000, 4);
		s.start();

		try {
			s.join();
		} catch (InterruptedException e) {

		}
		System.out.println(s.getSum());
	}

}
