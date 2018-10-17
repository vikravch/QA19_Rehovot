
public class Fish extends Animals {
 //                     ||
	//          String name;
	//          double weight;
                      
	float depth;
	boolean isRiver;
	
	public Fish(String name, double weight, float depth, boolean isRiver){
		super(name,weight);
		this.depth = depth;
		this.isRiver = isRiver;
	}
	
	public void move(int deltaX, int deltaY){
		System.out.println("fish can only swim :(");
	}
}
