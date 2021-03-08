package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client01032021 {

	private String name;//Client name's
	private String email;
	private Date birthDate;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Client01032021(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}
	
	public String toString() {
		return this.name + " (" + this.birthDate + ") - " + this.email;
	}
	
}
