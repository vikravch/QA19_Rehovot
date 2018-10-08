
public class Main {

	// begin function
	
	//public - открытая для другого класса
	//static - можем запустить без создания объекта класса
	//byte - тип возвращаемого результата
	//getNumber - название
	//char incomeCh - входящие данные
	
	public static byte getNumber(char incomeCh){
		byte res = (byte) incomeCh;
		return res;
	}
	
	//end function
	
	// 'A' - 65
	// '0' - 0
	// '~' - 0
	
	public static byte getNumberOnlyLetters(char incomeCh){
		byte res = (byte) incomeCh;
		if ((res>=65&&res<=90)||(res>97&&res<122))
			return res;
		else 
			return 0;
	}
	
	// Вычислить является ли символ большой буквой латинского алфавита.
	// Должны принимать char и возвращать boolean 
	// Название функции - isSymbolUppercase
	public static boolean isSymbolUppercase(char incomeCh){
		byte number = (byte) incomeCh;
		boolean res = number>=65&&number<=90;
		return res;
	}
	
	public static boolean isWordWithUppercase(String str){
		if (str!=null&&str.length()>0){
			char chFirst = str.charAt(0);
			boolean res = isSymbolUppercase(chFirst);
			return res;			
		} else 
			return false;
	}
	
	// A - 65
	// Z - 90
	// a - 97
	// z - 122
	
	public static void main(String[] args) {
		
		byte res1 = getNumber('A');
		System.out.println(res1);
		
		byte res2 = getNumber('Z');
		System.out.println(res2);
		
		byte res3 = getNumber('a');
		System.out.println(res3);
		
		byte res4 = getNumber('z');
		System.out.println(res4);
		// 'A' 'э' '~' '3'
		
		/*char ch = 'A';
		byte chNum = (byte) ch; 
		System.out.println(chNum);*/
	}

}
