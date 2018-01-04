package sec02_runtime_exception;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal; 				//ClassCastException 惯积 啊瓷
		}else{
			System.out.println("抗寇 惯积.");
		}
	}
}

class Animal {}
class Dog extends Animal {
	public Dog(){
		System.out.println("港港");
	}
}
class Cat extends Animal {
	public Cat(){
		System.out.println("具克");
	}
}

