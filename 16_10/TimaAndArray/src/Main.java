
public class Main {

	public static void main(String[] args){
		/*Timer timer = new Timer();
		timer.getTimeSec();
		timer.setName(null);*/
		
		Fish fish1 = new Fish("Salomon", 3.6, 100.5f, false);
		fish1.move(1, 90);
		System.out.println(fish1.name);
		
		Cats cat = new Cats("Green",4);
		System.out.println(cat.name);
		System.out.println(cat);
		
		String newStr = "cat is - "+cat; // == String newStr = "cat is - "+cat.toString;
		
		cat.jump();
		cat.move(30, -67);
		System.out.println(cat);
	}
}
