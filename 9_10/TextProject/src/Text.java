
public class Text {

	private String content;
	
	public Text(String content){
		this.content = content;
	}
	
	public boolean isTextNotEmpty(){
		return content!=null && !content.equals("");
	}
	
	public int getWordsCount(){
		if (isTextNotEmpty()){
			int res = content.split(" ").length;
			return res;			
		} else
			return 0;
	}
	
	public boolean isSymbolUppercase(char incomeCh){
		byte number = (byte) incomeCh;
		boolean res = number>=65&&number<=90;
		return res;
	}
	
	public int getWordsWithUppercase(){
		if (!isTextNotEmpty()) return 0;
		
		String[] words = content.split(" ");
		int counter = 0;
		for (int i=0; i<words.length; i++){
			/*
				String word = words[i];
				char firstSymbol = word.charAt(0);
				boolean isUppercase = isSymbolUppercase(firstSymbol);
				if (isUppercase){...
			 */
			
			if (isSymbolUppercase(words[i].charAt(0)))
				counter++;
		}
		return counter;
	}
	// '.' '!' '?'
	public int getAllSentences(){
		if (!isTextNotEmpty()) return 0;
		
		String[] words = content.split(" ");
		int counter = 0;
		for (int i=1; i<words.length; i++){
			// is uppercase first letter
			String word = words[i];
			char firstSymbol = word.charAt(0);
			boolean isUppercase = isSymbolUppercase(firstSymbol);
			
			// is last symbol of prev word '.' '!' '?'
			String prevWord = words[i-1];
			char lastSymbol = prevWord.charAt(prevWord.length()-1);
			boolean isSymbolPoint = lastSymbol=='.'||lastSymbol=='!'||lastSymbol=='?';
			
			if (isUppercase&&isSymbolPoint) counter++;
		}
		
		String last = words[words.length-1];
		char lastSymbol = last.charAt(last.length()-1);
		boolean isSymbolPoint = lastSymbol=='.'||lastSymbol=='!'||lastSymbol=='?';
		if (isSymbolPoint){
			counter++;
		}
		return counter;
	}
}