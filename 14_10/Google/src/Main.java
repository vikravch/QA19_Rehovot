
public class Main {

	private static StringBuilder append;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String str = "1  2 3 4 5";
		String[] array = str.split(" ");
		for (int i=0; i<array.length; i++){
			System.out.println(i+" - "+array[i]);
			if (array[i].equals("")) System.out.println("Empty is on the position - "+i);
		}
		
		String str1 = "Hello"; // 256 symbols = 256 bytes
		StringBuilder strBuilder = new StringBuilder("Hello"); // 16 symbols = 16 bytes
		strBuilder.deleteCharAt(1);
		*/
		//strBuilder.append("aaa");
		/*strBuilder.deleteCharAt(1);
		strBuilder.insert(2,"ad");
		strBuilder.length();
		strBuilder.reverse();*/
		//System.out.println(strBuilder+" capacity - "+strBuilder.capacity()+" lenght - "+strBuilder.length());
	
		URLMaker urlMaker = new URLMaker();
		System.out.println(urlMaker.getNews("Israel news", URLMaker.HW));
		
		// TDD test driven development
	
	}
	// https://www.google.com/search?safe=off&q=cat
	
	// part 1 - header - https://www.google.com/search
	// part 2 - parameters - ? safe=off (safety search) & q=cat (query to google)
}
