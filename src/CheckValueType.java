import java.util.Date;

public class CheckValueType {

	String	valString;
	Double	valDouble;
	Long	valLong;
	Integer	valInteger;
	Date	valDate;
	Float	valFloat;
	
	public CheckValueType(String val) {
		this.valString = val;
		System.out.println("Tipo String");
	}
	
	public CheckValueType(Double val) {
		this.valDouble = val;
		System.out.println("Tipo Double");
	}
	
	public CheckValueType(Long val) {
		this.valLong = val;
		System.out.println("Tipo Long");
	}
	
	public CheckValueType(Integer val) {
		this.valInteger = val;
		System.out.println("Tipo Integer");
	}
	
	public CheckValueType(Date val) {
		this.valDate = val;
		System.out.println("Tipo Date");
	}
	
	public CheckValueType(Float val) {
		this.valFloat = val;
		System.out.println("Tipo Float");
	}
}
