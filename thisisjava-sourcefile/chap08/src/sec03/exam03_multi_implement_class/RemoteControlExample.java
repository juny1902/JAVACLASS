package sec03.exam03_multi_implement_class;

public class RemoteControlExample {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		Searchable searchable = tv;
		tv.turnOn();
		tv.setVolume(99);
		tv.search("http:/www.naver.com");
		tv.setMute(false);
		tv.turnOff();
		
	}
}
