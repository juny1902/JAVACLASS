class Parent {
	public String nation;

	public Parent() {
		this("���ѹα�");
		System.out.println("Parent() call");
	}

	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");

	}
}

class Child extends Parent {
	private String name;

	public Child() {
		this("ȫ�浿");
		System.out.println("Child() Call");
	}

	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
class Tire{
	public void run(){
		System.out.println("�Ϲ� Ÿ�̾�");
	}
}
class SnowTire extends Tire{
	@Override
	public void run(){
		System.out.println("����� Ÿ�̾�");
	}
}
public class Chap7 {
	public static void main(String[] args) {
		SnowTire sT = new SnowTire();
		Tire T = new Tire();
		sT.run();
		T.run();
	}
}
