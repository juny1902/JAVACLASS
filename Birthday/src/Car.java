
public class Car implements Motion {
	private static int carCount;
	private int speed;
	private String name;
	private Engine e;
	private Tire t;

	public static void help() {
		System.out.println("To use : Car(����, �Ǹ��� ��, ��ⷮ, �� ����, ������ ��)");
	}

	public static void sellCar(Car c){
		carCount--;
		System.out.println(c.name + "�� �Ⱦҽ��ϴ�.");
		c = null;
		System.gc();
	}

	public Car(String name, int c, int cc, int r, int n) {
		carCount++;
		this.name = name;
		this.speed = 0;
		e = new Engine(c, cc);
		t = new Tire(r, n);
	}

	public static void getCarQuantity() {
		System.out.printf(">> ���� %d �� ������\n", carCount);
	}

	public void carInfo() {
		System.out.printf("-----[%s �� ����]-----\n", this.name);
		System.out.printf("%d[cc], %d����, %d�� ����, %d ��ġ ��\n", e.liter, e.cylinder, t.n_tires, t.radius);
	}

	@Override
	public void Accelate() {
		// TODO Auto-generated method stub
		this.speed += this.e.liter / 250;
		System.out.printf("%d ��ŭ �����Ͽ� ���� %d[km]\n", this.e.liter / 250, this.speed);
	}

	@Override
	public void Brake() {
		// TODO Auto-generated method stub
		this.speed -= this.e.liter / 250;
		System.out.printf("%d ��ŭ �����Ͽ� ���� %d[km]\n", this.e.liter / 250, this.speed);
	}

	@Override
	public void turn(int angle) {
		// TODO Auto-generated method stub
		System.out.printf("%d �� �ӵ��� %d ȸ��\n", this.speed, angle);
	}
}