import static org.junit.Assert.*;
import org.junit.Test;

public class URLMakerTest{

	@Test
	public void getSimpleQueryTest1(){
		URLMaker urlMaker = new URLMaker();
		
		String res = urlMaker.getSimpleQuery("fish");
		
		assertEquals("https://www.google.com/search?q=fish",res);
	}
	
	@Test
	public void getSimpleQueryTest2(){
		URLMaker urlMaker = new URLMaker();
		
		String res = urlMaker.getSimpleQuery("yellow fish");
		
		assertEquals("https://www.google.com/search?q=yellow+fish",res);
	}
	
	@Test
	public void getSimpleQueryTest3(){
		URLMaker urlMaker = new URLMaker();
		
		String res = urlMaker.getSimpleQuery("");
		
		assertNull(res);
	}
	
	@Test
	public void getSimpleQueryTest4(){
		URLMaker urlMaker = new URLMaker();
		
		String res = urlMaker.getSimpleQuery(null);
		
		assertNull(res);
	}
	
	//https://www.google.com/search?q=chocolate&tbm=isch
	@Test
	public void getImageQueryTest1(){
		URLMaker urlMaker = new URLMaker();
		
		String res = urlMaker.getImageQuery("home");
		
		assertEquals("https://www.google.com/search?q=home&tbm=isch",res);
	}
	
	@Test
	public void getImageQueryTest2(){
		URLMaker urlMaker = new URLMaker();
		
		String res = urlMaker.getImageQuery("дом");
		
		assertEquals("https://www.google.com/search?q=дом&tbm=isch",res);
	}
	
	@Test
	public void getImageQueryTest3(){
		URLMaker urlMaker = new URLMaker();
		
		String res = urlMaker.getImageQuery(null);
		
		assertNull(res);
	}
	
	//https://www.google.com/search?q=hello&hl=he&tbm=nws
	@Test
	public void getNewsTest1(){
		URLMaker urlMaker = new URLMaker();
		
		String res = urlMaker.getNews("дом",URLMaker.RU);
		
		assertEquals("https://www.google.com/search?q=дом&hl=ru&tbm=nws",res);
	}
	
	@Test
	public void getNewsTest2(){
		URLMaker urlMaker = new URLMaker();
		
		String res = urlMaker.getNews("earth quality",URLMaker.EN);
		
		assertEquals("https://www.google.com/search?q=earth+quality&hl=en&tbm=nws",res);
	}
}
