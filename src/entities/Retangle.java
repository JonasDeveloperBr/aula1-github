package entities;

public class Retangle {

	private double width;
	private double height;
	
	public void setWidth(double val) {
		this.width = val;
	}
	
	public void setHeight(double val) {
		this.height = val;
	}
	
	public double areaRetangle() {
		return width * height;
	}
	
	public double perimeterRetangle() {
		return (width * height) * 2;
	}
	
	public double diagonalRetangle() {
		return 0;
	}
}
