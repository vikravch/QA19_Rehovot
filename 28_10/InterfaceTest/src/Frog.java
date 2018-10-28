public class Frog implements AnimalInterface {

	public void move() {
		System.out.println("Frog jumped!");
	}

	public String makeSound() {
		System.out.println("Hrrrrrr-rrrr");
		return "Hrrrrrr-rrrr";
	}

	public String makeSoundWithNumber(int number) {
		System.out.println("number is- "+number+" Hrrrrrr-rrrr");
		return "number is- "+number+" Hrrrrrr-rrrr";
	}
}
