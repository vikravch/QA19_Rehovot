
public class Cats extends Animals {
	
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
}
