package recursion_problems_week21;
import java.util.Scanner;
public class Problem3_power {

	public static double findP(double base, int power) {
		if (power == 0) {
			return 1;
		}
		else return base * (findP(base, power - 1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number you want to find the power of: ");
		double base = in.nextDouble();
		System.out.print("Enter the power: ");
		int power = in.nextInt();
		System.out.println("Result: " + findP(base, power));
		in.close();
	}
}
