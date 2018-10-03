public class CesariusEncrypt{
	public static void main(String[] args){
		if (args.length<1) {
			System.out.println("Please insert string as the first parameter!");
			return;		
		}
// aaaa  ->2  cccc
		
		String str1 = args[0];
		String str2 = args[1];
		int sh = Integer.parseInt(str2);
		for (int i=0; i<str1.length(); i++)
		{
			char ch1 = str1.charAt(i); // 'a' '%' '}'
			byte res = (byte) ch1;
			res+=sh;
			char resCh = (char) res;
			System.out.print(resCh);
		}
		System.out.println("");
	}
}
