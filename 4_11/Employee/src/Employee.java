
public class Employee extends Man {
	//- position:String
	private String position;
	
	// - card:IdCard
	private IdCard card;
	
	// - room:Room [1..*]
	private Room[] room;
	
	// -department:Department
	private Department department;
	
	// -pastPosition:PastPosition [0..*]
	// private PastPosition[] pastPosition;
	
	public Employee(String n, String s, String p){
		this.name = n;
		this.surname = s;
		this.position = p;
	}
	
	
}