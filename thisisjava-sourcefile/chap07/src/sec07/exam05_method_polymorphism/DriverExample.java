package sec07.exam05_method_polymorphism;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		K5 k5 = new K5();
		driver.drive(bus);
		driver.drive(taxi);
		driver.drive(k5);
	}
}
