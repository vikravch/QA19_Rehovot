public class Clock {

	public long addMinute(long timeInMillsecond) {
		return timeInMillsecond+(1000*60);
	}
	
	public int addMinute(int minutes){
		//return minutes++;
		//return ++minutes;
		return minutes+1;
		}
	
	public String addMinute(String time){
		// time = "12:34"
		String[] timeArr = time.split(":");
		//             0    1
		// timeArr = {"12","34"}
		
		int minutes = Integer.parseInt(timeArr[1]);
		minutes++;
		//			timeArr[0]   minutes
		// "12:35" - > "12" + ":" + 35
		
		String res = timeArr[0]+":"+minutes;
		
		return res;
	}
	
	public void addMinute(Time time){
		time.incMinutes();
	}
}