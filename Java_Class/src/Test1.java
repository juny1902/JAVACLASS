
// import java.util.Scanner;
interface Soundable {
	int n = 3; // Constant Field
	String sound();
	void number();
}

class Dog implements Soundable {
	public String sound(){
		return "港港";
	}
	public void number(){
		System.out.println(n);
	}
}
class Cat implements Soundable {
	public String sound(){
		return "具克";
	}
	public void number(){
		System.out.println(n+1);
	}
}

public class Test1 {
	public static void printSound(Soundable soundable){
		System.out.println(soundable.sound());
	}
	public static void printNumber(Soundable soundable){
		soundable.number();
	}
	public static void main(String[] args) {
		printSound(new Dog());
		printSound(new Cat());
		printNumber(new Dog());
		printNumber(new Cat());
	}
}