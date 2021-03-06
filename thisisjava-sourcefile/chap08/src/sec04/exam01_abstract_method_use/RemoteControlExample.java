package sec04.exam01_abstract_method_use;

public class RemoteControlExample {
	public static void setVol(RemoteControl r) {
		r.setVolume(50);
	}

	public static void main(String[] args) {
		RemoteControl rc = null;

		rc = new Television();
		rc.turnOn();
		setVol(rc);
		rc.turnOff();
		System.out.println(Integer.toBinaryString(rc.hashCode()));
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();
		System.out.println(Integer.toBinaryString(rc.hashCode()));
	}
}
