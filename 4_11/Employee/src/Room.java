
public class Room {
	
	// - number:int
	private int number;
	
	// +Room(n:int)
	public Room(int n){
		this.number = n;
	}
	
	// +setNumber(newNumber:int)
	public void setNumber(int newNumber){
		this.number = newNumber;
	}
	
	// +getNumber():int
	public int getNumber(){
		return number;
	}
}
