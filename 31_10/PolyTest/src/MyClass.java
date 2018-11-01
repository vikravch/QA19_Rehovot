
public class MyClass {
		 
	 private static int instanceCounter = 0;
	 public static final double PI_CONSTANT = 3.14;
	     
	 private String example;
	     
	 public MyClass() {
	    instanceCounter++;
	 }
	 
	 public MyClass(int a) {
		    instanceCounter+=a; // instanceCounter = instanceCounter + a;
		 }
	     
	 public static int getCounter() {
	    return instanceCounter;
	 }
}
