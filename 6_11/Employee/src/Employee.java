
public class Employee extends Man {
	final int MAX_PAST_POSITIONS = 7;
	
	//- position:String
	private String position;
	
	// - card:IdCard
	private IdCard card;
	
	// - room:Room [1..*]
	private Room[] room;
	
	// -department:Department
	private Department department;
	
	// -pastPosition:PastPosition [0..*]
	private PastPosition[] pastPosition = new PastPosition[MAX_PAST_POSITIONS];
	private ArrayHelper pastPositionHelper;
	
	public Employee(String n, String s, String p){
		this.name = n;
		this.surname = s;
		this.position = p;
		
		pastPositionHelper = new ArrayHelper(pastPosition);
	}
	
	//+setPosition(newPosition:String)
	public void setPosition(String newPosition){
		this.position = position;
	}
	//+getPosition():String
	public String getPosition(){
		return position;
	}
	
	
}