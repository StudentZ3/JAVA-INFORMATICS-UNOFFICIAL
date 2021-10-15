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
	
	
	public RegularPolygon() {
		
	}
	public RegularPolygon(int numOfSides, double sidLength, double xcoor, double ycoor) {
		numberOfSides = numOfSides;
		sideLength = sidLength;
		x = xcoor;
		y = ycoor;
	}
	
	
	public void setNumberOfSides(int newNumberOfSides) {
		newNumberOfSides = numberOfSides;
	}
	public void setSideLenght(double newSideLength) {
		newSideLength = sideLength;
	}
	public void setxCoord(double newX) {
		newX = x;
	}
	public void setyCoord(double newY) {
		newY = y;
	}
	

	//public RegularPolygon(int newNumberOfSides, double newSideLength, double newX, double newY) {
		

	double getPerimeter() {
		return numberOfSides * sideLength;
    }
	double getArea() {
		return numberOfSides * sideLength * sideLength / (4 * Math.tan (Math.PI / numberOfSides));
    }
}

