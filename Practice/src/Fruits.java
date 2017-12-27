class Fruit {
	private static int quantity;
	private int acidity;
	private int sweetness;
	private String name;
	public Fruit(int acidity, int sweetness, String name)
	{
		if(acidity >= 10)
		{
			this.acidity = 10;
		}
		else
		{
			this.acidity = acidity;
		}
		if(sweetness >= 10)
		{
			this.sweetness = 10;
		}
		else
		{
			this.sweetness = sweetness;
		}
		this.name = name;
		quantity = 1;
	}
	public void getName() {
		String info = "This is " + name + ".";
		System.out.println(info);
	}
	public void getInfo() {
		System.out.println("품명 : " + name);
		System.out.println("산도 : " + Integer.toString(acidity));
		System.out.println("당도 : " + Integer.toString(sweetness));
		System.out.println("수량 : " + Integer.toString(quantity));
	}
	public void getTaste() {
		if(this.sweetness > 5)
		{
			System.out.println("It's really sweet !");
		}
		else
		{
			System.out.println("It's not sweet !");
		}
		if(this.acidity > 5)
		{
			System.out.println("and It's really sour !");
		}
		else
		{
			System.out.println("It's not sour !");
		}
	}
}
public class Fruits {
	public static void main(String[] args) {
		Fruit merch = new Fruit(7,7,"Grape");
		merch.getInfo();
		merch.getTaste();
	}

}
