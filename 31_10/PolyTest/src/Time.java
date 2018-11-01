
public class Time {
	private int hours;
	private int minutes;
	
	public Time(int hours, int minutes){
		this.hours = hours;
		this.minutes = minutes;
	}
	
	public int getHours(){
		return hours;
	}
	
	public int getMinutes(){
		return minutes;
	}
	
	public void incMinutes(){
		this.minutes+=1;
	}
	
	public String toString(){
		return "hours - " +hours+" minutes - "+minutes;
	}
}
