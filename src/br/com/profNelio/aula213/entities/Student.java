package br.com.profNelio.aula213.entities;

public class Student extends User {

	private String name;
	
	public Student(String name) {
		super(name);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
