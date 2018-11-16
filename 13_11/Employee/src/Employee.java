
public class Employee extends Man {
	final int MAX_PAST_POSITIONS = 7;
	
	//- position:String
	private String position;
	
	// - card:IdCard
	private IdCard card;
	
	// - room:Room [1..*]
	private Room[] room;
	private ArrayHelper roomHelper;
	
	// -department:Department
	private Department department;
	
	// -pastPosition:PastPosition [0..*]
	private PastPosition[] pastPosition = new PastPosition[MAX_PAST_POSITIONS];
	private ArrayHelper pastPositionHelper;
	
	public Employee(String n, String s, String p){
		this.name = n;
		this.surname = s;
		this.position = p;
		
		roomHelper = new ArrayHelper(room);
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
	
	//+setIdCard(newIdCard:IdCard)
	public void setIdCard(IdCard newIdCard){
		this.card = newIdCard;
	}
	
	//+getIdCard():IdCard
	public IdCard getIdCard(){
		return card;
	}
	
	//+getRoom():Room[1..*]
	public Room[] getRoom(){
		return room;
	}
	
	//+setRoom(newRoom:Room)
	public void setRoom(Room newRoom){
		roomHelper.add(newRoom);
	}
	
	//+deleteRoom(r:Room)
	public void deleteRoom(Room r){
		roomHelper.remove(r);
	}
	
	//+setDepartment(d:Department)
	public void setDepartment(Department d){
		this.department = d;
	}
	
	//+getDepartment():Department
	public Department getDepartment(){
		return department;
	}
	
	//+setPastPosition(p:PastPosition)
	public void setPastPosition(PastPosition p){
		pastPositionHelper.add(p);
	}
	
	//+getPastPosition():PastPosition[1..*]
	public PastPosition[] getPastPosition(){
		return pastPosition;
	}
	
	//+deletePastPosition(p:PastPosition)
	public void deletePastPosition(PastPosition p){
		pastPositionHelper.remove(p);
	}
}