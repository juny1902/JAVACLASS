import java.util.Scanner;

public class ArrayEx {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�л� �� : ");
		int n = sc.nextInt();
		int max = 0;
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + "��° �л��� ���� : ");
			
			a[i] = sc.nextInt();
		}

		sc.close();

		int sum = 0;
		double avg = 0;

		for (int i = 0; i < n; i++) {
			if(max < a[i]) max = a[i];
			sum += a[i];
		}
		avg = (double) sum / n;
		System.out.println("�л� �� : " + n + ", �ְ��� : " + max + ", ���� : " + sum + ", ��� ���� :" + avg);
	}
}
