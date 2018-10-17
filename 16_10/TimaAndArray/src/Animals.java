
public class Animals {
	
	public String name = "No name";
	public double weight = 2;
	
	private int x = 100;
	private int y = 100;
	
	public Animals(){}
	
	public Animals(String name, double weight){
		this.name = name;
		this.weight = weight;
	}
	
	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}
	
	public void move(int deltaX, int deltaY){
		x+=deltaX;
		y+=deltaY;
	}
}
