
public class Truck extends Car {
	private int max_weight;
	public static void help(){
		System.out.println("To use : Truck(차종, 실린더 수, 배기량, 휠 직경, 구동륜 수, 적재 중량)");
	}
	public Truck(String name, int c, int cc, int r, int n, int w) {
		super(name, c, cc, r, n);
		this.max_weight = w;
		// TODO Auto-generated constructor stub
	}

	public void carInfo() {
		super.carInfo();
		System.out.printf("최대 적재 중량 : %d[kg]\n",this.max_weight);
	}

}
