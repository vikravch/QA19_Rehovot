
public class Main {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		//int res = divide(4, 0);
      	//System.out.println(res);
         
      	//String str = null;
      	//print(str);
		
        /*int[] array = new int[]{12,67,85,76};
        for (int i=0; i<array.length; i++){
        	System.out.println(array[i]);
        }
        
        String number = "123"+5;
        int parsed = parse(number);
        parsed += 5;
        System.out.println(parsed);
        
        printStr("addd");
        printStr("HellO");
        printStr("addd");
        printStr("addd");*/
        
		System.out.println(getRandomNumber(1,7));
		System.out.println(getRandomNumber(0,100));
		System.out.println(getLaconicRandomNumber(-60,60));
	}
	
	private static double getRandomNumber(){
		return Math.random();
	}
	
	private static int getRandomNumber(int from, int to){
		int delta = to - from;
		double randomDouble = Math.random();
		int res = (int) ( randomDouble*delta + from);
		return res;
	}
	
	private static int getLaconicRandomNumber(int from, int to){
		return (int) ( Math.random()*(to - from) + from);
	}
	
	private static void printStr(String str) throws Exception{
		if (str.equalsIgnoreCase("hello")){
			Exception exception = new Exception("You don't understand me??? I do not print 'hello'!");
			throw exception;
		} else{
			System.out.println(str);			
		}
	}
	
	 private static int parse(String number) {
		 
	        int res = Integer.parseInt(number);
	        return res;
	    }
	 
	    static int divide(int arg1, int arg2) {
	         
	        int result = arg1/arg2;
	         
	        return result;
	         
	    }
	     
	    static void print(String str) {
	        System.out.println(str.toString());
	    }
	
	private static void divisionWithThrow(int a, int b) {
		try{
			int c = a/b;
			System.out.println(c);
		} catch (Exception ex){
			System.out.println("Zero in b");
		}
	}

	static void divisionSimple(int a,int b){
		if (b!=0){
			int c = a/b;
			System.out.println(c);
		} else {
			System.out.println("Zero in b");
		}
	}

}
