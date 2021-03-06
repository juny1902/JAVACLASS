import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertyTest {
	public static void main(String[] args){
		Properties properties = new Properties();
		String path = PropertyTest.class.getResource("test.properties").getPath();
		try {
			path = URLDecoder.decode(path, "utf-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			properties.load(new FileReader(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String CPU = properties.getProperty("CPU");
		String GPU = properties.getProperty("GPU");
		String RAM = properties.getProperty("RAM");
		System.out.printf("%s\n%s\n%s\n",CPU,GPU,RAM);
	}
}
