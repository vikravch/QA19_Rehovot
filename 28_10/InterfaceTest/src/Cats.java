
public class Cats extends Animals implements AnimalInterface {
	
	String color;
	int height;
	
	public Cats(String color, int height){
		// super();
		this.color = color;
		this.height = height;
	}
	
	public void jump(){
		super.move(-4, 3);
	}
	
	public String toString(){
		return "color - "+color+" height - "+height+" x - "+getX()+" y - "+getY();
	}

	public void move() {
		System.out.println("Cat don't want to move!");
	}

	public String makeSound() {
		System.out.println("Meuuuuuu");
		return "Meuuuuuuu";
	}

	public String makeSoundWithNumber(int number) {
		System.out.println("number is- "+number+" Meuuuuuu");
		return "number is- "+number+" Meuuuuuu";
	}
}
