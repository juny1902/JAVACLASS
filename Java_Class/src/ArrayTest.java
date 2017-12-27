import java.util.Scanner;

class Classroom {
	private int studentNum;
	private int[] scores = null;
	private Scanner inputScanner = new Scanner(System.in);

	public int getStudentNum() {
		return studentNum;
	}

	public void getScoreList() {
		for (int i = 0; i < studentNum; i++) {
			System.out.println("Student[" + i + "] : " + scores[i]);
		}
	}

	public void setStudentScore() {
		for (int i = 0; i < studentNum; i++) {
			System.out.print("Student[" + i + "] : ");
			scores[i] = inputScanner.nextInt();
		}
	}

	public void getAnalysis() {
		int maxScore = 0;
		int sum = 0;
		double averageScore = 0.0;
		for (int i = 0; i < studentNum; i++) {
			sum += scores[i];
			if (maxScore < scores[i])
				maxScore = scores[i];
		}
		averageScore = sum / studentNum;

		System.out.printf("�л� �� %d��, ���� �� %d, �ְ��� %d, ��� %.2f\n", studentNum, sum, maxScore, averageScore);
	}

	public Classroom(int n) {
		this.studentNum = n;
		scores = new int[this.studentNum];
	}
}

public class ArrayTest {
	public static void testMax() {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };

		for (int i = 0; i < array.length; i++) {
			if (max < array[i])
				max = array[i];
		}
		System.out.println(max);
	}

	public static void dupArray() {
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		int sum = 0, cnt_sum = 0;
		double avg = 0.0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				cnt_sum++;
			}
		}
		avg = (double) sum / (double) cnt_sum;
		System.out.println("Students : " + cnt_sum);
		System.out.println("Sum : " + sum);
		System.out.println("Avg : " + avg);
	}

	public static void main(String[] args) {
		Scanner inputStream = new Scanner(System.in);
		boolean run = true;
		int n = inputStream.nextInt();
		Classroom A = new Classroom(n);
		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println(" 1.�л� �� | 2.���� �Է� | 3.������� | 4.�м� | 5.����");
			System.out.println("--------------------------------------------");
			
			switch (inputStream.nextInt()) {
			case 1:
				System.out.println(A.getStudentNum());
				break;
			case 2:
				A.setStudentScore();
				break;
			case 3:
				A.getScoreList();
				break;
			case 4:
				A.getAnalysis();
				break;
			default:
				inputStream.close();
				System.out.println("�����մϴ�.");
				run = false;
			}

		}
	}
}
