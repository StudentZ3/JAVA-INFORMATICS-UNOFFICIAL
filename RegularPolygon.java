package objectsAndClasses.Polygon;

public class RegularPolygon {
	private int numberOfSides = 3;
	private double sideLength = 1;
	private double x = 0.0;
	private double y = 0.0;
	
	public RegularPolygon() {
		
	}
	double getPerimeter() {
		return numberOfSides * sideLength;
        }
	double getArea() {
		return numberOfSides * sideLength * sideLength / (4 * Math.tan (Math.PI / numberOfSides));
    }
}

