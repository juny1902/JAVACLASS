import java.lang.Math;
public class Exercise06 {
	public static void getArea(int lengthTop, int lengthBottom, int height)
	{
		double area = 2 * Math.sqrt(Math.pow((lengthBottom/2 - lengthTop/2),2) + Math.pow(height,2))
				+ lengthTop * height;
		System.out.println(Double.toString(area));
	}
	public static void main(String[] args)
	{
		getArea(5,10,7);
	}
}
