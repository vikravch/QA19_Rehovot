public class Dog implements AnimalInterface {

	public void move() {
		System.out.println("Dog moved!");
	}

	public String makeSound() {
		System.out.println("wOW-WOW-WOW");
		return "wOW-WOW-WOW";
	}

	public String makeSoundWithNumber(int number) {
		System.out.println("number is- "+number+" wOW-WOW-WOW");
		return "number is- "+number+" wOW-WOW-WOW";
	}
	
}
