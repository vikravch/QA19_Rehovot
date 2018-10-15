
public class URLMaker {

	final String HEADER = "https://www.google.com/search?";
	
	public static final String RU = "ru";
	public static final String HW = "he";
	public static final String EN = "en";
	
	// https://www.google.com/search?q=yellow+fish
	public String getSimpleQuery(String query){
		if (query==null||query.equals("")) return null;
		String url = HEADER+"q="+query;
		url = url.replace(' ', '+');
		return url;
	}
	
	//https://www.google.com/search?q=chocolate&tbm=isch
	public String getImageQuery(String query){
		if (query==null||query.equals("")) return null;
		
		String url= HEADER+"q="+query+"&tbm=isch";
		url = url.replace(' ', '+');
		 /*
		 StringBuilder urlBuilder = new StringBuilder(HEADER);
		 urlBuilder.append("q=");
		 urlBuilder.append(query);
		 urlBuilder.append("&tbm=isch");
		 String res = "";
		 urlBuilder.replace(' ', '+', res);
		 return res;
		 */ 
		 return url;
	}
	
	public String getNews(String query, String lang){
		if (query==null||query.equals("")) return null;
		String url= HEADER+"q="+query+"&hl="+lang+"&tbm=nws";
		url = url.replace(' ', '+');
		return url;
	}
}
