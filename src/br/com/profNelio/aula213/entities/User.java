package br.com.profNelio.aula213.entities;

public abstract class User {

	private Integer codUser;
	private String name;
	
	public User(String name) {
		this.codUser = name.hashCode();
		this.name = name;
	}

	public Integer getCodUser() {
		return codUser;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "User [codUser=" + codUser + ", name=" + name + "]";
	}

}
