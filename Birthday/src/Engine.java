
public class Engine  {
	protected int cylinder;
	protected int liter;
	protected String name;

	public void setName(String a) {
		this.name = a;
	}

	public Engine(int c, int cc) {
		this.cylinder = c;
		this.liter = cc;
	}
}
