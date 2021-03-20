package br.com.profNelio.aula213.entities;

public class Teacher extends User {

	private String name;
	
	public Teacher(String name) {
		super(name);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Teacher name: ");
		sb.append(name);
		return sb.toString();
	}
}
