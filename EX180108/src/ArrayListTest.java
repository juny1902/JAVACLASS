import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListTest {
	public static void main(String[] args) {
		List<String> books = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		String tmp;
		while (true) {
			System.out.print("책 이름을 입력하세요 : ");
			tmp = s.nextLine();
			if (tmp.isEmpty()) {
				break;
			} else
				books.add(tmp);
		}
		s.close();
		for (String a : books) {
			System.out.println(a);
		}

	}
}
