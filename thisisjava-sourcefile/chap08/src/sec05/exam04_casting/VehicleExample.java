package sec05.exam04_casting;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();

		vehicle.run();
		//vehicle.checkFare(); (x)
		System.out.println(vehicle instanceof Bus);
		Bus bus = (Bus) vehicle;  //����Ÿ�Ժ�ȯ
		
		bus.run();
		bus.checkFare();
	}
}
