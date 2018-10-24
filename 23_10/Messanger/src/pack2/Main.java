package pack2;
import pack1.Message;


public class Main extends Object{
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Object message = (Object) new Message("Olia", "Tolia");
		
		//Message message = new Message();
		System.out.println("Send message to - "+message);
		
		// <Object class>      <name>     <define new part of memory>   <name of constructor>
   			Message     	messageEmpty        = new                    Message();
		System.out.println("Empty is - "+messageEmpty);
		
		long sendedTime = 345434565;
		Message messageWithTime = new Message("John", "Lesli", sendedTime);
		
		System.out.println("Empty is - "+messageWithTime);
		
		VoiceMessage voiceMessage = new VoiceMessage("D://Audio/file.mp3");
		System.out.println("Voice mesage is - "+voiceMessage);
		
		// <Object class>      <name>     				<define new part of memory>   <name of constructor>
			Message 		messageShort = (Message)	 new 				VoiceMessage("D://Audio/file.mp3");
		System.out.println("Voice mesage is - "+messageShort);*/

		/*Message message1 = new Message();
		message1.title = "unused";
		message1.fromUser = "User";*/
		
		int day = 1;
		String result = "";
		if (day==1) {
			result = "Monday";
		} else if (day==2){
			result = "Tuesday";
		} else if (day==3){
			result = "Wednesday";
		} else if (day==4){
			result = "Thursday";
		} else if (day==5){
			result = "Friday";
		} else if (day==6){
			result = "Saturday";
		} else if (day==7){
			result = "Sunday";
		} else result = "Not a day";
		
		System.out.println(result);
		
		int day2 = 20;
		switch(day2){
			case 1: 
				result = "Monday"; 
				break;
			case 2: result = "Tuesday"; break;
			case 3: result = "Wednesday"; break;
			case 4: result = "Thursday"; break;
			case 5: result = "Friday"; break;
			case 6:
			case 7: 
				result = "Holyday"; 
			break;
			default: result = "Not a day";
		}
		System.out.println(result);
	}

}
