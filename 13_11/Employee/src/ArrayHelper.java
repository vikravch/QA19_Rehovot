
public class ArrayHelper {
	
	private Object[] objects;

	public ArrayHelper(Object[] employees) {
		this.objects = objects;
	}

	// {"empl1","empl2","empl3","empl4"}
	// after remove second - {"empl1",null,"empl3","empl4"}
	// after add fifth - {"empl1",---"empl5"----,"empl3","empl4"}
	
	public int getCount() {
		int counter = 0;
		for (int i=0; i <objects.length; i++){
			if (objects[i]!=null) i++;
		}
		return counter;
	}
	public void add(Object newObject) {
		for (int i=0; i <objects.length; i++){
			if (objects[i]==null){
				objects[i] = newObject;
				return;
			}
		}
	}
	public void remove(Object e) {
		for (int i=0; i <objects.length; i++){
			if (objects[i].equals(e)){
				objects[i] = null;
				return;
			}
		}
		
	}
}
