
public class Example4 {
	public static void oddsum(int end){
		int sum = 0;
		for(int i=1; i<=end; i++){
			if(i % 2 == 1) sum += i;
		}
		System.out.println(sum);
	}
	public static void ex3(int end){
		int sum = 0;
		for(int i=1; i<=end; i++){
			if(i%3 == 0)
			{
				sum += i;
			}
		}
		System.out.println(sum);
	}
	public static void ex4(){
		int a = 0;
		int b =0;
		int c =0;
		while(true){
			a = (int)(Math.random()*6+1);
			b = (int)(Math.random()*6+1);
			c = a+b;
			System.out.println("(" + a + "," + b + ")");
			if(c == 5) break;
		}
	}
	public static void ex5(){
		int result = 0;
		for(int x=0;x<=10;x++){
			for(int y=0;y<=10;y++){
				result = 4*x + 5*y;
				if(result == 60)
					System.out.println("4x+5y=60, when x=" + x + " and y=" + y);
			}
		}
	}
	public static void main(String[] args){
		oddsum(5);
	}
}
