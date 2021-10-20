package objectsAndClasses.Polygon;

public class RegularPolygon {
	private int numberOfSides = 3;
	private double sideLength = 1;
	private double x = 0.0;
	private double y = 0.0;
	
	public int getNumberOfSides() {
		return numberOfSides;
	}
	public double getSideLenght() {
		return sideLength;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public void setNumberOfSides(int newNumberOfSides) {
		this.numberOfSides = newNumberOfSides;
	}
	public void setSideLenght(double newSideLength) {
		this.sideLength = newSideLength;
	}
	public void setxCoord(double newX) {
		this.x = newX;
	}
	public void setyCoord(double newY) {
		this.y = newY;
	}
	
	
	public RegularPolygon() {
		
	}
	public RegularPolygon(int numberOfSides, double sideLength) {
		this.numberOfSides = numberOfSides;
		this.sideLength = sideLength;
	}
	public RegularPolygon(int numberOfSides, double sideLength, double x, double y) {
		this.numberOfSides = numberOfSides;	
		this.sideLength = sideLength;
		this.x = x;
		this.y = y;
	}
	
	
	double getPerimeter() {
		return numberOfSides * sideLength;
    }
	double getArea() {
		return numberOfSides * sideLength * sideLength / (4 * Math.tan (Math.PI / numberOfSides));
    }
}

