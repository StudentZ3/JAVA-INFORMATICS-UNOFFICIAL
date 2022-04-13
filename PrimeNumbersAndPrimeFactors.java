package week27_problems;
import java.util.*;
public class PrimeNumbersAndPrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number to check if prime and to factorize to prime multipliers: ");
		String input = in.next();
		if(input.matches("\\d+")) {
			double num = Integer.valueOf(input);
			int number = (int) num;
			for(int i = 0; i <= number/2; i++) {
				if(number % i == 0) {
					
				}
			}
		}
		else System.out.println("Enter a number, not a string. Try again.");
		in.close();
	}
}
