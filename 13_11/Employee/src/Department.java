
public class Department implements Unit {

	final int MAX_EMPLOYEE = 10;
	
	//-name:String
	private String name;
	
	//-employees:Employee[1..*]
	private Employee[] employees = new Employee[MAX_EMPLOYEE];
	private ArrayHelper employeesHelper;
	
	//+Department(n:String)
	public Department(String n){
		this.name = n;
		employeesHelper = new ArrayHelper(employees);
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
		return employeesHelper.getCount();
	}
	
	//+addEmployee(newEmployee:Employee)
	public void addEmployee(Employee newEmployee){
		employeesHelper.add(newEmployee);
	}
	
	//+removeEmployee(e:Employee)
	public void removeEmployee(Employee e){
		employeesHelper.remove(e);
	}
	
}
