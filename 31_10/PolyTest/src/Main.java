
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		System.out.println(MyClass.getCounter());     // instanceCounter = 0 
        
        new MyClass();          // instanceCounter = 1      
        new MyClass(34);		// instanceCounter = 35  
        new MyClass();			// instanceCounter = 36 

        System.out.println(MyClass.getCounter());
        
        double var = MyClass.PI_CONSTANT;*/
		
		/*Example example = new Example();
		System.out.println(example.sum(12, 89));
		System.out.println(example.sum("12","89"));*/
		
		Clock clock = new Clock();
		System.out.println(clock.addMinute(12332133214l));
		System.out.println(clock.addMinute(34));
		System.out.println(clock.addMinute("12:50"));
		
		Time time = new Time(21,43);
		clock.addMinute(time);
		System.out.println(time);
		
	}

}
