
public class Timer {

	// parameters 
	
	// примитивные типы
	private int timeSec; //this.timeSec
	private double timeHour = 5.8; //this.timeHour
	private boolean fl = true; //this.fl
	
	// составной объект
	private String name; //this.name
	
	// getter -  read private parameters
	public int getTimeSec(){
		return timeSec;
	}
	
	// setter - set/write private parameters
	public void setFl(boolean fl){
		this.fl = fl;
	}
	
	public void setName(String name){
		if (name==null || name.equals("")) 
			this.name = "Default";
		else 
			this.name = name;
	}
}
