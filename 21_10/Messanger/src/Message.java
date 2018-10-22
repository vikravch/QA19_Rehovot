
public class Message {
	
	// global variables 
	private String fromUser;
	private String toUser;
	private long sendedTime;

	public Message(){
		fromUser = "System";
		toUser = "Call back";
	}
	
	// constructor
	public /*anything = Message */ Message(String fromUser, String toUser){
		this();
		this.fromUser = fromUser;
		this.toUser = toUser;
	}
	
	public Message(String fromUser, String toUser, long sendedTime) {
		this(fromUser,toUser);
		this.sendedTime = sendedTime;
	}

	//getter
	public String getFromUser(){
		return this.fromUser; // == return fromUser;
	}
	
	public String getToUser(){
		return this.toUser; // == return toUser;
	}
	
	// @Override
	public String toString(){
		return super.toString()+" fromUser - "+fromUser+" toUser - "+toUser;
	}
}
