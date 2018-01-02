import ext1.Car;
public class Sportscar extends Car {
	private int lap_time;
	private String Stage;

	public Sportscar(String name, String color, int cc) {
		super(name, color, cc);
	}

	public int getLap_time() {
		return lap_time;
	}

	public void setLap_time(int lap_time) {
		this.lap_time = lap_time;
	}

	public String getStage() {
		return Stage;
	}

	public void setStage(String stage) {
		Stage = stage;
	}
	
}
