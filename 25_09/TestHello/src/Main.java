
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String helloStr = "Hello";
		//                 01234567
		System.out.println(helloStr);
		
		char ch1 = helloStr.charAt(1);
		//               0123456789
		String string = "My life is good!";
		String[] arrString = string.split(" ");
		
		for (int i=0; i<arrString.length; i++)
			System.out.println(arrString[i]);
		
		final int i323 =9;
		
		
		System.out.println(helloStr.indexOf('l'));
		System.out.println(string.substring(3, 7));
		
		String string2 = "My work is not hard!";
		System.out.println(string2.substring(11, 14));
		
		String str1 = "aaaa";
		String str2 = "aAaa";
		
		if (str1.equalsIgnoreCase(str2)){
			System.out.println("equals");
		} else{
			System.out.println(" not equals");
		}
		
		String num1 = "14324";
		int number = Integer.parseInt(num1)+10000;
		System.out.println(number);
		
		String doub1 = "12.45";
		double numberDouble = Double.parseDouble(doub1)-0.45;
		System.out.println(numberDouble);
		
		char chSearch = 'd';
		String strSearch = "fghgfg";
		System.out.println(strSearch.indexOf(chSearch));
		
		// +
		
		System.out.println(doub1+" "+strSearch);
		
		int a = 7;
		String strB = "number is - ";
		System.out.println(strB+a+1);
		System.out.println(strB+(a+1));
		
		// concat
		String strA1 = "aaa";
		String strB1 = "bb";
		System.out.println(strA1.concat(strB1));
		
		int a5=8;
		double b5 = 12.5;
		boolean c5 = true;
		System.out.println("a="+a5+" b="+b5+" c="+c5);
		//String strFormatted = String.format("a=%1$d b=%2$d c=%3$d",a5,a5,a5);
	}

}
