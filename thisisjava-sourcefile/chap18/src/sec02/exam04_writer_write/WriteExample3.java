package sec02.exam04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample3 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test.txt");
		char[] data = "鼛靑膩出鼛於蠧藍".toCharArray(); // 유니코드 2바이트.
		for (int i = 1; i < 8; i += 2) {
			writer.write(data, i, 1);
		}

		writer.flush();
		writer.close();
	}

}
