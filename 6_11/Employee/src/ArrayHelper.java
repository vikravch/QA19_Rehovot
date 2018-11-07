
public class ArrayHelper {
	
	private Object[] employee;

	public ArrayHelper(Object[] employees) {
		this.employee = employee;
	}

	// {"empl1","empl2","empl3","empl4"}
	// after remove second - {"empl1",null,"empl3","empl4"}
	// after add fifth - {"empl1",---"empl5"----,"empl3","empl4"}
	
	public int getCount() {
		int counter = 0;
		for (int i=0; i <employee.length; i++){
			if (employee[i]!=null) i++;
		}
		return counter;
	}
	public void add(Object newEmployee) {
		for (int i=0; i <employee.length; i++){
			if (employee[i]==null){
				employee[i] = newEmployee;
				return;
			}
		}
	}
	public void remove(Object e) {
		for (int i=0; i <employee.length; i++){
			if (employee[i].equals(e)){
				employee[i] = null;
				return;
			}
		}
		
	}
}
