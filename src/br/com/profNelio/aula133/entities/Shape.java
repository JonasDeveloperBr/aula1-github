package br.com.profNelio.aula133.entities;

import br.com.profNelio.aula133.util.EnumColor;

public abstract class Shape {

	private EnumColor color;
	
	public Shape() {
	}

	public Shape(EnumColor color) {
		this.color = color;
	}
	
	public EnumColor getColor() {
		return color;
	}
	
	public void setColor(EnumColor color) {
		this.color = color;
	}
	
	public abstract double area();
}
