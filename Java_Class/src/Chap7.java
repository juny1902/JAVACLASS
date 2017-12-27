class Parent {
	public String nation;

	public Parent() {
		this("대한민국");
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
		this("홍길동");
		System.out.println("Child() Call");
	}

	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
class Tire{
	public void run(){
		System.out.println("일반 타이어");
	}
}
class SnowTire extends Tire{
	@Override
	public void run(){
		System.out.println("스노우 타이어");
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
