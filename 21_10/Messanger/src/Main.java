
public class Main extends Object{
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Object message = (Object) new Message("Olia", "Tolia");
		
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
		System.out.println("Voice mesage is - "+messageShort);
	}

}
