import org.junit.Test;
import junit.framework.TestCase;

public class MainTest extends TestCase {

	@Test
	public void test1(){
		char ch = 'A';
		
		byte res = Main.getNumber(ch);
		
		//assertEquals(65,res);
		assertTrue(res==65);
	}
	
	@Test
	public void test2(){
		char ch = 'э';
		
		byte res = Main.getNumber(ch);
		
		//assertEquals(65,res);
		assertTrue(res==77);
	}
	
	@Test
	public void test3(){
		char ch = '~';
		
		byte res = Main.getNumber(ch);
		
		//assertEquals(65,res);
		assertTrue(res==126);
	}
	
	@Test
	public void test4(){
		char ch = '3';
		
		byte res = Main.getNumber(ch);
		
		//assertEquals(65,res);
		assertTrue(res==51);
	}
	
	/*
	 
	 @Test - аннотация теста 
	 public void <название теста>(){
	 
	 Задаем значения
	 char ch = '3';
	 
	 Выполняем функцию
	 byte res = Main.getNumber(ch);
	 
	 Сравниваем ожидания с результатом
	 assertTrue(res==51);
	 
	 }
	 */
}
