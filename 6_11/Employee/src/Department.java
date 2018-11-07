
public class Department implements Unit {

	final int MAX_EMPLOYEE = 10;
	
	//-name:String
	private String name;
	
	//-employees:Employee[1..*]
	private Employee[] employees = new Employee[MAX_EMPLOYEE];
	private ArrayHelper arrayHelper;
	
	//+Department(n:String)
	public Department(String n){
		this.name = n;
		arrayHelper = new ArrayHelper(employees);
	}
	
	//+setName(newName:String)
	public void setName(String newName){
		this.name = newName;
	}
	//+getName():String
	public String getName(){
		return name;
	}
	
	public int getPersonCount() {
		return arrayHelper.getCount();
	}
	
	//+addEmployee(newEmployee:Employee)
	public void addEmployee(Employee newEmployee){
		arrayHelper.add(newEmployee);
	}
	
	//+removeEmployee(e:Employee)
	public void removeEmployee(Employee e){
		arrayHelper.remove(e);
	}
	
}
