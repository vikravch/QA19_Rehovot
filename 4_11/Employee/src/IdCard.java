import java.util.Date;

public class IdCard {
	
	// - number:int
	private int number;
	
	// - dateExpire:Date
	// UML
	private Date dateExpire;

	// We are constructors when:
	// 1. Our name == name of class
	// 2. We do not return anything
	// + IdCard(n:int)
	public IdCard(int n){
		this.number = n;
	}
	
	// +setNumber(newNumber:int)
	public void setNumber (int newNumber){
		this.number = newNumber;
	}
	
	// +setDateExpire(newNumber:Date)
	public void setDateExpire (Date newDate){
		this.dateExpire = newDate;
	}
	
	// + getNumber():int
	public int getNumber(){
		return number;
	}
	
	// + getDateExpire():int
	public Date getDateExpire(){
		return dateExpire;
	}

}