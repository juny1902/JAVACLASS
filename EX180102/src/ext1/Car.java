package ext1;

public class Car implements Drive {
	String name;
	String color;
	int cc;

	public Car(String name, String color, int cc) {
		this.name = name;
		this.color = color;
		this.cc = cc;
	}
	public void carInfo(){
		System.out.println(color + "�� " + name + ", ��ⷮ : " + cc + "[cc]");
	}
	@Override
	public void ignition() {
		// TODO Auto-generated method stub
		System.out.println("�θ��θ�");
	}
}
