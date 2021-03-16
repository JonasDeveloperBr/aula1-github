package br.com.profNelio.aula198.model.entities;

import br.com.profNelio.aula198.model.enums.Color;

public abstract class AbstractShape implements Shape {

	private Color color;
	
	public AbstractShape(Color color) {
		this.color = color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
}
