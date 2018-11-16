
// + Man
public class Man {

	// # name: String
	protected String name;
	// # surname: String
	protected String surname;
	
	// + setName(newName:String) :void
	public void setName(String newName){
		this.name = newName;
	}
	
	// + setSurname(newSurname:String) :void
	public void setSurname(String newSurname){
		this.surname = newSurname;
	}
	
	// + getName() :String
	public String getName(){
		return name;
	}
	
	// + getSurname() :String
	public String getSurname(){
		return surname;
	}
}
