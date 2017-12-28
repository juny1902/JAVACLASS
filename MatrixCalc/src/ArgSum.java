
public class ArgSum {
	public static void main(String args[]) {
		int sum = 0;
		System.out.print("java ArgSum ");
		for(String n:args){
			
			System.out.print(n + " ");
			sum += Integer.parseInt(n);
		}
		System.out.println();
		System.out.println(sum);
	}
}
