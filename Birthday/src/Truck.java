
public class Truck extends Car {
	private int max_weight;
	public static void help(){
		System.out.println("To use : Truck(����, �Ǹ��� ��, ��ⷮ, �� ����, ������ ��, ���� �߷�)");
	}
	public Truck(String name, int c, int cc, int r, int n, int w) {
		super(name, c, cc, r, n);
		this.max_weight = w;
		// TODO Auto-generated constructor stub
	}

	public void carInfo() {
		super.carInfo();
		System.out.printf("�ִ� ���� �߷� : %d[kg]\n",this.max_weight);
	}

}