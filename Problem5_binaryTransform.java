package recursion_problems_week21;
import java.util.Scanner;
public class Problem5_binaryTransform {

    public static String dec2Bin(int value) {
        
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int x = in.nextInt();
		if(x > 0) {
			System.out.println("The binary equivalent of the entered number: " + dec2Bin(x) + ".");
		}
		in.close();
	}
}
