package oops;


abstract class Animals {

	public abstract void animalSound();
	// Regular method
	public void sleep() {
		System.out.println("Zzz");
	}
}

class Pig extends Animals {
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}
}



class Main {
	public static void main(String[] args) {
		Pig myPig = new Pig(); // Create a Pig object
		myPig.animalSound();
		myPig.sleep();
	}
}