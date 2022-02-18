package printf_enum_week20_problems;
import java.util.Scanner;
public class Problem3_TicTacToeGame {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		char[][] board = new char[3][3];

		for(int t = 1; t < 10; t++) {
			if(t % 2 == 1) {
				for(int i = 0; i < 3; i++) {
					System.out.println("\n-------------");
					for(int j = 0; j < 3; j++) {		
						System.out.printf("| %s ", board[i][j]);
					}
					System.out.print("|");
				}
				System.out.println("\n-------------");
				System.out.print("Enter a row (0, 1 or 2) for player X: ");
			    int x = in.nextInt();
			    System.out.print("Enter a column (0, 1, 2) for player X: ");
			    int y = in.nextInt(); 
			    for(int i = 0; i < 3; i++) {
					for(int j = 0; j < 3; j++) {
						if((i == x) && (j == y)) {
							board[i][j] = 'X';
						}
					}
				}
			}
			if(t % 2 == 0) {
				for(int i = 0; i < 3; i++) {
					System.out.println("\n-------------");
					for(int j = 0; j < 3; j++) {
						System.out.printf("| %s ", board[i][j]);
					}
					System.out.print("|");
				}
				System.out.println("\n-------------");
				System.out.print("Enter a row (0, 1 or 2) for player O: ");
			    int x = in.nextInt();
			    System.out.print("Enter a column (0, 1, 2) for player O: ");
			    int y = in.nextInt(); 
			    for(int i = 0; i < 3; i++) {
					for(int j = 0; j < 3; j++) {
						if((i == x) && (j == y)) {
							board[i][j] = 'O';
						}
					}
				}
			}
		}
		in.close();
	}
}
