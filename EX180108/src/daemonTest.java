import java.util.Scanner;

class notifyTime extends Thread {
	private int t = 0;

	public void timeGoes(int e) {
		t += e;
		System.out.printf("%d �� ���. ���� ���� : %s", t, this.isDaemon());
	}

	@Override
	public void run() {

		while (true) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.printf("���� �����忡�� ���ͷ�Ʈ �߻�. %s ����", this.getName());
				break;
			}
			timeGoes(5);
		}
	}
}

public class daemonTest {
	public static void main(String[] args) {
		notifyTime a = new notifyTime();
		ThreadGroup group = Thread.currentThread().getThreadGroup();
		String groupName = group.getName();
		a.setDaemon(true); // ���� ������� �� ������ ����� �Բ� �����. ���� ȣ��.
		a.start();

		Scanner s = new Scanner(System.in);
		Long tmp;
		long sum = 0;
		while (true) {
			System.out.print("�ƹ� ���ڳ� �Է��ϼ��� (0 �Է��ϸ� ����.) : ");
			tmp = Long.parseLong(s.nextLine());
			if (tmp == 0) {
				a.interrupt();
				break;
			} else
				sum += tmp;
			System.out.printf("[%s] ������ ���� %d �Դϴ�\n", groupName, sum);
		}
		System.out.printf("����, ���� ���� %d �Դϴ�\n", sum);
		s.close();
	}

}