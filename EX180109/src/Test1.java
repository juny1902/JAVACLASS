import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class MapContinued {
	public static String A() {

		Map<Integer, String> map1 = new HashMap<Integer, String>();
		Map<Integer, String> map2 = new TreeMap<Integer, String>();
		map1.put(1539753, "¾Ñ´¨");
		map2.put(1539753, " ÇÖ¼¼¿ë");
		
		String msg = map1.get(1539753) + map2.get(1539753);
		return msg;
	}
}

public class Test1 {
	public static void main(String[] args){
		System.out.println(MapContinued.A());
	}
}
