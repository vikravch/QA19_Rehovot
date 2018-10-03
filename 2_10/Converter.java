public class Converter{
	public static void main(String[] args){
//		System.out.println("Hello! "+args[0]);
		String str1 = args[0];
		char ch1 = str1.charAt(0); // 'a' '%' '}'
		byte res = (byte) ch1;
		System.out.println(res);
	}
}
