package objectsAndClasses.Polygon;
public class RegularPolygonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RegularPolygon RP1 = new RegularPolygon();
		System.out.println("The perimeter of the regular polygon with default parameters is: " + RP1.getPerimeter() + ".");
		System.out.println("The area of the regular polygon with default parameters is: " + RP1.getArea() + ".");
		System.out.println("The polygon with default parameters is centred in the point with coordinates " + RP1.getX() + "; " + RP1.getY() + ".");
		System.out.println();;
		
		RegularPolygon RP2 = new RegularPolygon(6,4);
		RP2.setNumberOfSides(6);
		RP2.setSideLenght(4);
		System.out.println("The perimeter of the regular polygon with " + RP2.getNumberOfSides() + " sides and length of each side, egual to "
				+ RP2.getSideLenght() + ", is: " + RP2.getPerimeter() + ".");
		System.out.println("The area of the regular polygon with " + RP2.getNumberOfSides() + " sides and length of each side, egual to "
				+ RP2.getSideLenght() + ", is: " + RP2.getArea() + ".");
		System.out.println("The regular polygon with " + RP2.getNumberOfSides() + " sides and length of each side, egual to "
				+ RP2.getSideLenght() + ", is centered in the point with coordinates " +  RP2.getX() + "; " + RP2.getY() + ".");
		System.out.println();
		
		RegularPolygon RP3 = new RegularPolygon(10,4,5.6,7.8);
		RP3.setNumberOfSides(10);
		RP3.setSideLenght(4);
		RP3.setxCoord(5.6);
		RP3.setyCoord(7.8);
		System.out.println("The perimeter of the regular polygon with " + RP3.getNumberOfSides() + " sides and length of each side, egual to "
				+ RP3.getSideLenght() + ", is: " + RP3.getPerimeter() + ".");
		System.out.println("The area of the regular polygon with " + RP3.getNumberOfSides() + " sides and length of each side, egual to "
				+ RP3.getSideLenght() + ", is: " + RP3.getArea() + ".");
		System.out.println("The regular polygon with " + RP3.getNumberOfSides() + " sides and length of each side, egual to "
				+ RP3.getSideLenght() + ", is centered in the point with coordinates " +  RP3.getX() + "; " + RP3.getY() + ".");
	}

}
