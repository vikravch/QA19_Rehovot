
public class Main {

	public static void main(String[] args) {
		
		// begin of safety zone 
		try{
			// operator 1
			// operator 2
			// operator 3
			// ...
		}
		// begin of exceptions catching
		// now we are catching all exceptions (because Exception ex)
		catch(ArithmeticException ex){
			// operator if error
		}
		catch(Exception ex){
			// operator if error
		}
		// we will do it after try
		finally{
			
		}
		
		//String str1 = null;
		try {
			String str1 = "Hello!";
			int a1 = 19;
		} catch (Exception e) {
			System.out.println("catch");
			String str2 = "bye!";
			//System.out.println(str1);
		}
		
		//System.out.println(str2);
		
		
		int i=0;
		try {
			printStr("one");
			i++;
			printStr("two");
			i++;
			printStr("HeLLo");
			i++;
			printStr("after hello");
			i++;
		} catch (Exception e) {
			System.out.println("from catch - "+i);
		} finally{
			System.out.println("from finally - "+i);
		}
		i++;
		System.out.println("after try-catch - "+i);
	
		
	}
	
	private static void printStr(String str) throws Exception{
		if (str.equalsIgnoreCase("hello")){
			Exception exception = new Exception("You don't understand me??? I do not print 'hello'!");
			throw exception;
		} else{
			System.out.println(str);			
		}
	}
	
	private static void waitOneSecond(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}			
	}
	
	private static void counter(int n){
		int i=0;
		while (i<n){
			waitOneSecond();
			System.out.println(i);
			i++;
		}
	}
	
	private static void counter(){
		int i=0;
		while (1==1){
			waitOneSecond();
			System.out.println(i);
			i++;
			if (i == 10){
				try {
					throw new Exception("You time is over!!!");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					i=0;
				} finally{
					
				}
			}
		}
	}


}
