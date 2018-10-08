import static org.junit.Assert.*;

import org.junit.Test;

public class LetterTest {

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
	
	@Test
	public void letterTest1(){
		char ch = 'A';
		byte res = Main.getNumberOnlyLetters(ch);
		assertEquals(65,res);
	}
	
	@Test
	public void letterTest2(){
		char ch = '0';
		byte res = Main.getNumberOnlyLetters(ch);
		assertEquals(0,res);
	}
	
	@Test
	public void letterTest3(){
		char ch = '~';
		byte res = Main.getNumberOnlyLetters(ch);
		assertEquals(0,res);
	}
	// 'A' - 65
	// '0' - 0
	// '~' - 0
	
	@Test
	public void symbolUpperTest1(){
		char ch = 'A';
		boolean res = Main.isSymbolUppercase(ch);
		assertTrue(res);
	}
	
	@Test
	public void symbolUpperTest2(){
		char ch = 'a';
		boolean res = Main.isSymbolUppercase(ch);
		assertFalse(res);
	}
	
	@Test
	public void symbolUpperTest3(){
		char ch = '0';
		boolean res = Main.isSymbolUppercase(ch);
		assertFalse(res);
	}
	
	@Test
	public void symbolUpperTest4(){
		char ch = '+';
		boolean res = Main.isSymbolUppercase(ch);
		assertFalse(res);
	}
	
	@Test
	public void wordUpperTest1(){
		String word = "Hello";
		boolean res = Main.isWordWithUppercase(word);
		assertTrue(res);
	}
	
	@Test
	public void wordUpperTest2(){
		String word = "hello";
		boolean res = Main.isWordWithUppercase(word);
		assertFalse(res);
	}
	
	@Test
	public void wordUpperTest3(){
		String word = "3ello";
		boolean res = Main.isWordWithUppercase(word);
		assertFalse(res);
	}
	
	@Test
	public void wordUpperTest4(){
		String word = " ";
		boolean res = Main.isWordWithUppercase(word);
		assertFalse(res);
	}
	
	@Test
	public void wordUpperTest5(){
		String word = "";
		boolean res = Main.isWordWithUppercase(word);
		assertFalse(res);
	}
	
	@Test
	public void wordUpperTest6(){
		String word = null;
		boolean res = Main.isWordWithUppercase(word);
		assertFalse(res);
	}
}
