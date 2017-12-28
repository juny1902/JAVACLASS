import java.util.Scanner;

public class ArrayEx {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("학생 수 : ");
		int n = sc.nextInt();
		int max = 0;
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + "번째 학생의 점수 : ");
			
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
		System.out.println("학생 수 : " + n + ", 최고점 : " + max + ", 총점 : " + sum + ", 평균 점수 :" + avg);
	}
}
