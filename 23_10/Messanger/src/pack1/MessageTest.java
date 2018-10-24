package pack1;
import pack1.Message;
import static org.junit.Assert.*;


import org.junit.Test;

public class MessageTest {

	@Test
	public void equalsTest1(){
		Message message1 = new Message();
		Message message2 = new Message();
		
		boolean res = message1.equals(message2);
		
		assertTrue(res);
	}
	
	@Test
	public void equalsTest2(){
		Message message1 = new Message("Hanna","Olja");
		Message message2 = new Message("Hanna","Olja");

		boolean res = message1.equals(message2);
		
		assertTrue(res);
	}
	
	@Test
	public void equalsTest3(){
		Message message1 = new Message("Oleg","Olja");
		Message message2 = new Message("Hanna","Olja");

		boolean res = message1.equals(message2);
		
		assertFalse(res);
	}
	
	@Test
	public void equalsTest4(){
		Message message1 = new Message();
		Message message2 = new Message("Hanna","Olja");

		boolean res = message1.equals(message2);
		
		assertFalse(res);
	}
	
}
