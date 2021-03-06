package sec08.exam02_abstract_method;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Anaconda anaconda = new Anaconda();
		dog.sound();
		dog.move();
		cat.sound();
		cat.move();
		anaconda.sound();
		anaconda.move();
		System.out.println("-----");
		
		//변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		animal = new Anaconda();
		animal.sound();
		System.out.println("-----");
		
		//매개변수의 자동 타입 변환
		animalSound(new Dog());
		animalSound(new Cat());
		animalSound(new Anaconda());
	}
	
	public static void animalSound(Animal animal) {
  		animal.sound();
	}
}
