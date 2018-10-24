package pack1;

public class Message {
	
	// global variables 
	private String fromUser;
	private String toUser;
	private long sendedTime;
	
	protected String title;

	public Message(){
		fromUser = "System";
		toUser = "Call back";
		title = "Default title";
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
	
	public boolean equals(Object obj){
		// 1. Object to message
		char ch1 = 'a';
		
		//result type      var name    result type  icoming var
		  int            intFromChar =     (int)         ch1;
		  Message        message     =   (Message)       obj;   
		
		// 2. is this equals incoming object
		  boolean isEqualsFromUser = this.fromUser.equals(message.getFromUser());
		  
		  /* boolean isEqualsFromUser;
		     if (this.fromUser.equals(message.getFromUser())) isEqualsFromUser=true;
		     	else isEqualsFromUser=false;
		   * */
		  boolean isEqualsToUser = this.toUser.equals(message.getToUser());
		
		  // 3. return result
		  /*boolean result;
		  if (isEqualsFromUser&&isEqualsToUser) result = true;
		  	else result = false;
		  */
		  boolean result = isEqualsFromUser&&isEqualsToUser;
			  
			  /*
			   *   isEqualsFromUser   isEqualsToUser   result
			   *       true              true			true
			   *       true              false			false
			   *       false             true			false
			   *       false             false			false
			  						AND &&
			   */
		  return result;
	}
}
