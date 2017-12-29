
public class Tire {
	protected int radius;
	protected int n_tires;
	protected String material;

	public void setMaterial(String a) {
		this.material = a;
	}

	public Tire(int r, int n) {
		this.radius = r;
		this.n_tires = n;
	}
}
