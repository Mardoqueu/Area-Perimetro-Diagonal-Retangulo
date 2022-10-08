package entities;

public class Rectangle {
	
	public double h;
	public double b;
	
	public double area() {
		double a =  b * h;
		return a;
	}
	
	
	public double perimeter() {
		double p =  2 * (b + h);
		return p;
	}
	
	public double diagonal() {
		return Math.sqrt(b * b + h * h);
	}
	
}
