import static org.junit.Assert.*;

import org.junit.Test;

public class TextTest {

	@Test
	public void test1(){
		Text text = new Text("Hello, how are you?");
		
		int res = text.getWordsCount();
		
		assertEquals(4,res);
	}
	
	@Test
	public void test2(){
		Text text = new Text("");
		
		int res = text.getWordsCount();
		
		assertEquals(0,res);
	}
	
	@Test
	public void test3(){
		Text text = new Text(null);
		
		int res = text.getWordsCount();
		
		assertEquals(0,res);
	}
	
	@Test
	public void test4(){
		Text text = new Text("12");
		
		int res = text.getWordsCount();
		
		assertEquals(1,res);
	}
	
	@Test
	public void test(){
		Text text = new Text("12");
		
		int res = text.getWordsCount();
		
		assertEquals(1,res);
	}
	
	@Test
	public void getWordsWithUppercaseTest1(){
		Text text = new Text("Hello, how are you?");
		
		int res = text.getWordsWithUppercase();
		
		assertEquals(1,res);
	}
	
	@Test
	public void getWordsWithUppercaseTest2(){
		Text text = new Text("Hello");
		
		int res = text.getWordsWithUppercase();
		
		assertEquals(1,res);
	}
	
	@Test
	public void getWordsWithUppercaseTest3(){
		Text text = new Text("hello");
		
		int res = text.getWordsWithUppercase();
		
		assertEquals(0,res);
	}
	
	@Test
	public void getWordsWithUppercaseTest4(){
		Text text = new Text("");
		
		int res = text.getWordsWithUppercase();
		
		assertEquals(0,res);
	}
	
	@Test
	public void getWordsWithUppercaseTest5(){
		Text text = new Text(null);
		
		int res = text.getWordsWithUppercase();
		
		assertEquals(0,res);
	}
	
	@Test
	public void getAllSentencesTest1(){
		Text text = new Text("Hello, how are you?");
		
		int res = text.getAllSentences();
		
		assertEquals(1,res);
	}
	
	@Test
	public void getAllSentencesTest2(){
		Text text = new Text("Hello, how are you? What did you do?");
		
		int res = text.getAllSentences();
		
		assertEquals(2,res);
	}
	
	@Test
	public void getAllSentencesTest3(){
		Text text = new Text("Hello. How are you! What did you do?");
		
		int res = text.getAllSentences();
		
		assertEquals(3,res);
	}
	
	@Test
	public void getAllSentencesTest4(){
		Text text = new Text("Hello");
		
		int res = text.getAllSentences();
		
		assertEquals(0,res);
	}
	
	@Test
	public void getAllSentencesTest5(){
		Text text = new Text("");
		
		int res = text.getAllSentences();
		
		assertEquals(0,res);
	}
	
	@Test
	public void getAllSentencesTest6(){
		Text text = new Text(null);
		
		int res = text.getAllSentences();
		
		assertEquals(0,res);
	}
}
