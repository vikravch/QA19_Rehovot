public class ConverterCurrency{

	static final String USD_ILS = "usd/ils";
	static final String ILS_USD = "ils/usd";
	
	static final double USD_ILS_CURRENCY = 3.6;
	static final double ILS_USD_CURRENCY = 0.565;

	public static void main(String[] args){
		if (args.length<2) {
			System.out.println("Please insert correct data!");
			return;		
		}
		
		String currencyType = args[0];
		double volume = Double.parseDouble(args[1]);
		
		if (currencyType.equals(USD_ILS)){
			System.out.println(volume*USD_ILS_CURRENCY);	
		} else if (currencyType.equals(ILS_USD)){
			System.out.println(volume*ILS_USD_CURRENCY);	
		}
	}
}
