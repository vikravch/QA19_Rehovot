
public class PastPosition {
	// - name: String
	private String name;
	// - department:Department
	private Department department;
	
	//+PastPosition(position:String,dep:Department)
	public PastPosition(String position, Department dep){
		this.name = position;
		this.department = dep;
	}
	//+setName(newName:String)
	public void setName(String newName){
		this.name = newName;
	}
	//+getName():String
	public String getName(){
		return name;
	}
	//+setDepartment(d:Department)
	public void setDepartment(Department d){
		this.department = d;
	}
	//+getName():String
	public Department getDepartment(){
		return department;
	}
}
