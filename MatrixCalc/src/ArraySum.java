import java.io.IOException;

class ArrayOperation {
	private int[][] a;
	private int[][] b;
	private int a_row, a_col;
	private int b_row, b_col;
	private int[][] result;
	private int r_row, r_col;

	public static int summarize(int i) {
		int sum = 0, cnt = 0;
		while (cnt <= i) {
			cnt++;
			System.out.print(sum + "+" + cnt + "=");
			sum += cnt;
			System.out.println(sum);

		}
		return sum;
	}

	public ArrayOperation(int[][] a, int[][] b) {
		this.a = a;
		a_row = this.a.length;
		a_col = this.a[0].length;
		this.b = b;
		b_row = this.b.length;
		b_col = this.b[0].length;

	}

	public void viewResult() {
		System.out.println();
		if (result != null) {
			System.out.println("Result >");
			for (int i = 0; i < r_row; i++) {
				for (int j = 0; j < r_col; j++) {
					System.out.print(result[i][j] + "\t");
				}
				System.out.println();
			}
		} else {
			System.out.println("No result.");
		}
	}

	public void viewCurrentMatrices() {
		System.out.println("Matrix A >");
		for (int i = 0; i < a_row; i++) {
			for (int j = 0; j < a_col; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Matrix B >");
		for (int i = 0; i < b_row; i++) {
			for (int j = 0; j < b_col; j++) {
				System.out.print(b[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public int[][] add() {
		if (a_row != b_row && a_col != b_col) {
			System.out.println();
			System.out.println("<Error> Cannot sum different size of matrix.");
			return null;
		} else {
			result = new int[a_row][a_col];
			for (int i = 0; i < a_row; i++) {
				for (int j = 0; j < a_col; j++) {
					result[i][j] = a[i][j] + b[i][j];
				}
			}
			r_row = result.length;
			r_col = result[0].length;
			return result;
		}
	}

	public int[][] minus() {
		if (a_row != b_row && a_col != b_col) {
			System.out.println();
			System.out.println("<Error> Cannot sum different size of matrix.");
			return null;
		} else {

			result = new int[a_row][a_col];
			for (int i = 0; i < a_row; i++) {
				for (int j = 0; j < a_col; j++) {
					result[i][j] = a[i][j] - b[i][j];
				}
			}
			r_row = result.length;
			r_col = result[0].length;
			return result;
		}
	}

	public int[][] prod() {
		if (a_col != b_row) {
			System.out.println();
			System.out.println("<Error> Cannot sum different size of matrix.");
			return null;
		} else {
			int sum = 0;
			result = new int[a_row][b_col];
			for (int i = 0; i < a_row; i++) {
				for (int j = 0; j < b_col; j++) {
					for (int k = 0; k < b_row; k++) {
						sum += a[i][k] * b[k][j];
					}
					result[i][j] = sum;
				}
			}
			r_row = result.length;
			r_col = result[0].length;
			return result;
		}
	}

}

public class ArraySum {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 3, 4, 5 } };
		int[][] b = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		boolean run = true;
		ArrayOperation ab = new ArrayOperation(b, a);
		ArrayOperation cd = new ArrayOperation(ab.prod(), ab.prod());
		int keycode = 0;
		while (run) {
			try {
				keycode = System.in.read();
			} catch (IOException e) {
				e.printStackTrace();
			}
			switch (keycode) {
			case 'A':
				ab.viewCurrentMatrices();
				ab.prod();
				ab.viewResult();
				break;
			case 'B':
				cd.viewCurrentMatrices();
				cd.add();
				cd.viewResult();
				break;
			default:
				run = false;

			}
		}
	}
}
