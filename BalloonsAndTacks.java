package week_25_problems;
import java.util.Scanner;
import java.util.Stack;
public class BalloonsAndTacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string, which contains the symbols 'O', 'T' and 'L': ");
		String string1 = input.nextLine().toUpperCase();
		input.close();
		display(string1);
	}
	public static void display (String string) {
		Stack <Character> stack = new Stack <Character>();
		for(int i = 0; i < string.length(); i++) {
			if((string.charAt(i) == 'O') ||
			   (string.charAt(i) == 'T') ||
			   (string.charAt(i) == 'L')) {
				   if(!stack.empty() && (stack.peek() == 'O') && (string.charAt(i) == 'T')){
					   stack.pop();
					   while (!stack.empty() && (stack.peek() == 'O') && (string.charAt(i) == 'T')) {
						   stack.pop();
					   }
				   }
				   else if(!stack.empty() && (stack.peek() == 'L') && (string.charAt(i) == 'O')){
					   continue;
				   }
				   stack.push(string.charAt(i));
			}
		}
		System.out.println("Result: " + stack);
	}	
}

