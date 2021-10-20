package objectsAndClasses.Polygon;

public class RegularPolygonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularPolygon RP1 = new RegularPolygon();
		System.out.println("The perimeter of the regular polygon with default parameters is: " + RP1.getPerimeter() + ".");
		System.out.println("The area of the regular polygon with default parameters is: " + RP1.getArea() + ".");
		System.out.println("The polygon with default parameters is centred in the point with coordinates " + RP1.getX() + "; " + RP1.getY() + ".");
		System.out.println();
		
		RegularPolygon rp2 = new RegularPolygon(6,4);

		System.out.println("The perimeter of the regular polygon with " + rp2.getNumberOfSides() + " sides and length of each side, egual to "
				+ rp2.getSideLenght() + ", is: " + rp2.getPerimeter() + ".");
		System.out.println("The area of the regular polygon with " + rp2.getNumberOfSides() + " sides and length of each side, egual to "
				+ rp2.getSideLenght() + ", is: " + rp2.getArea() + ".");
		System.out.println("The regular polygon with " + rp2.getNumberOfSides() + " sides and length of each side, egual to "
				+ rp2.getSideLenght() + ", is centered in the point with coordinates " +  rp2.getX() + "; " + rp2.getY() + ".");
		System.out.println();
		
		RegularPolygon rp3 = new RegularPolygon(10,4,5.6,7.8);

		System.out.println("The perimeter of the regular polygon with " + rp3.getNumberOfSides() + " sides and length of each side, egual to "
				+ rp3.getSideLenght() + ", is: " + rp3.getPerimeter() + ".");
		System.out.println("The area of the regular polygon with " + rp3.getNumberOfSides() + " sides and length of each side, egual to "
				+ rp3.getSideLenght() + ", is: " + rp3.getArea() + ".");
		System.out.println("The regular polygon with " + rp3.getNumberOfSides() + " sides and length of each side, egual to "
				+ rp3.getSideLenght() + ", is centered in the point with coordinates " +  rp3.getX() + "; " + rp3.getY() + ".");
	
	}
}
