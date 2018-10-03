public class ConverterString{
	public static void main(String[] args){
		if (args.length<1) {
			System.out.println("Please insert string as the first parameter!");
			return;		
		}

		String str1 = args[0];
		for (int i=0; i<str1.length(); i++)
		{
			char ch1 = str1.charAt(i); // 'a' '%' '}'
			byte res = (byte) ch1;
			System.out.println(ch1+" - "+res);
		}
		
	}
}
