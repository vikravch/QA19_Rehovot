public class Main {

	public static void saySomething(AnimalInterface someAnimal){
		someAnimal.makeSound();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*Dog dog = new Dog();
		saySomething(dog);
		
		Cats cats = new Cats("green",14);
		saySomething(cats);*/
		
		Dog dog1 = new Dog();
		
		AnimalInterface[] animalsQueue = new AnimalInterface[]{
			new Dog(),
			new Frog(),
			new Cats("grey",67),
			new Dog(),
			new Bird(),
			dog1,
			new Frog(),
			new Bird(),
			new Dog(),
			dog1
		};
		
		for (int i=0; i<animalsQueue.length; i++){
			if (animalsQueue[i] instanceof Bird){
				System.out.println("Bird catched!");
			} else{
				animalsQueue[i].move();	
			}
		}
		
		dog1 = null;
		System.gc();
		/*for (int i=0; i<animalsQueue.length; i++){
			//saySomething(animalsQueue[i]);
			animalsQueue[i].makeSoundWithNumber(i);
		}*/
	}
	
	/*
	 * file I.java:
	 * public interface I{
	 * 		public void func();
	 * }
	 * 
	 * file A.java:
	 * public class A implements I{
	 * 		public void func(){
	 * 			command-1.....
	 * 		}
	 * }
	 * 
	 * file B.java:
	 * public class B implements I{
	 * 		public void func(){
	 * 			command-1.....
	 * 		}
	 * } 
	 * 
	 * file C.java:
	 * public class C{
	 * 		public void makeFunc(I objectI){
	 * 			objectI.func();
	 * 		}
	 * 
	 * 		public static void main(String[] args) {
	 * 			A a1 = new A();
	 * 			B b1 = new B();
	 * 			makeFunc(a1);
	 * 			makeFunc(b1);
	 * 		}
	 * }
	 * */

}
