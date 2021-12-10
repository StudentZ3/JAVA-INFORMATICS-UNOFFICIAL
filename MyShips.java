package projectBattleshipGame;
import java.util.Scanner;
public class MyShips {
	public static final Scanner in = new Scanner(System.in);
	public static String water = "~";
	public static String ship = "X";
	
	public static void checkAnglePoints(String map[][], int row, int column) {
		if((row > 0) && (column > 0) && (row < 9) && (column < 9)) {
			if(map[row - 1][column - 1] == ship||
			   map[row + 1][column + 1] == ship||  
			   map[row + 1][column - 1] == ship||
			   map[row - 1][column + 1] == ship){
			   System.out.println("Impossible positioning. Ships cannot touch at their angle points. Try again!");
			   System.exit(0);
			}		
		}
		else if(row == 0 && column == 0) {
			if(map[row + 1][column + 1] == ship) {
			   System.out.println("Impossible positioning. Ships cannot touch at their angle points. Try again!");
			   System.exit(0);
		    }
		}
		else if(row == 9 && column == 9) {
			if(map[row - 1][column - 1] == ship) {
		      System.out.println("Impossible positioning. Ships cannot touch at their angle points. Try again!");
		      System.exit(0);
			}
		}
		else if(row == 9 && column == 0) {
			if(map[row - 1][column + 1] == ship) {
			  System.out.println("Impossible positioning. Ships cannot touch at their angle points. Try again!");
			  System.exit(0);
			}
		}
        else if(row == 0 && column == 9) {
        	if(map[row + 1][column - 1] == ship) {
  		      System.out.println("Impossible positioning. Ships cannot touch at their angle points. Try again!");
  		      System.exit(0);
  			}
		}
	}
	public static void checkSides(String map[][], int row, int column) {
	   if((row > 0) && (column > 0) && (row < 9) && (column < 9)) {
			if(map[row - 1][column] == ship||
			   map[row][column + 1] == ship||  
			   map[row][column - 1] == ship||
			   map[row + 1][column] == ship){
			   System.out.println("Impossible positioning. Ships cannot touch laterally. Try again!");
			   System.exit(0);
			}
		}	
	}
	public static void importCutters(String map[][]) {
		for(int i = 0; i < 4; i ++) {
			System.out.print("Enter the row of cutter number " + (i+1) + ": ");
			int row = in.nextInt();
			System.out.print("Enter the column of cutter number " + (i+1) + ": ");
			char column = in.next().charAt(0);
			int r = row-1; int k = (int)column % 65;
			if(map[r][k] == ship) {
				System.out.println("Ships cannot overlap. Try again!");
				System.exit(0);
			}
			else map[r][k] = ship;
			
            checkSides(map, r, k);
			checkAnglePoints(map,r,k);
			System.out.println();
		}
	}
	public static void importCorvettes(String map[][]) {
		for(int i = 0; i < 3; i ++) {
			System.out.print("Enter the starting row coordinate of corvette number " + (i+1) + ": ");
			int rowStart = in.nextInt();
			System.out.print("Enter the starting column coordinate  of corvette number " + (i+1) + ": ");
			char columnStart = in.next().charAt(0);
			int row1 = rowStart-1; int column1 = (int)columnStart % 65;
			if(map[row1][column1] == ship) {
				System.out.println("Ships cannot overlap. Try again!");
				System.exit(0);
			}
			else map[row1][column1] = ship;
			
			checkAnglePoints(map,row1,column1);
			
			System.out.print("Enter the ending row coordinate of corvette number " + (i+1) + ": ");
			int rowEnd = in.nextInt();
			System.out.print("Enter the ending column coordinate of corvette number " + (i+1) + ": ");
			char columnEnd = in.next().charAt(0);
			int row2 = rowEnd-1; int column2 = (int)columnEnd % 65;
			if(map[row2][column2] == ship) {
				System.out.println("Ships cannot overlap. Try again!");
				System.exit(0);
			}
			else map[row2][column2] = ship;
			
			checkAnglePoints(map,row2,column2);
			
			System.out.println();
		}
	}
	public static void importDestroyers(String map[][]) {
		for(int i = 0; i < 2; i ++) {			
			System.out.print("Enter the starting row coordinate of destroyer number " + (i+1) + ": ");
			int rowStart = in.nextInt();
			System.out.print("Enter the starting column coordinate of destroyer number " + (i+1) + ": ");
			char columnStart = in.next().charAt(0);
			int row1 = rowStart-1; int column1 = (int)columnStart % 65;
			if(map[row1][column1] == ship) {
				System.out.println("Ships cannot overlap. Try again!");
				System.exit(0);
			}
			else map[row1][column1] = ship;
			
			checkAnglePoints(map,row1,column1);
			
			System.out.print("Enter the ending row coordinate of destroyer number " + (i+1) + ": ");
			int rowEnd = in.nextInt();
			System.out.print("Enter the ending column coordinate of destroyer number " + (i+1) + ": ");
			char columnEnd = in.next().charAt(0);
			int row3 = rowEnd-1; int column3 = (int)columnEnd % 65;
			if(map[row3][column3] == ship) {
				System.out.println("Ships cannot overlap. Try again!");
				System.exit(0);
			}
			else map[row3][column3] = ship;	
			
			checkAnglePoints(map,row3,column3);
			
			if(row1 == row3) {
				int row2 = row1;
				int column2 = (column3 + column1)/2;
				if(map[row2][column2] == ship) {
					System.out.println("Ships cannot overlap. Try again!");
					System.exit(0);
				}
				else map[row2][column2] = ship;
				checkAnglePoints(map,row2,column2);
			}
			else if(column1 == column3) {
				int column2 = column1;
				int row2 = (row1 + row3)/2;
				if(map[row2][column2] == ship) {
					System.out.println("Ships cannot overlap. Try again!");
					System.exit(0);
				}
				else map[row2][column2] = ship;
				checkAnglePoints(map,row2,column2);
			}
			System.out.println();
		}
	}
	public static void importCarrier(String map[][]) {
		System.out.print("Enter the starting row coordinate of the carrier: ");
		int rowStart = in.nextInt();
		System.out.print("Enter the starting column coordinate of carrier: ");
		char columnStart = in.next().charAt(0);
		int row1 = rowStart-1; 
		int column1 = (int)columnStart % 65;
		if(map[row1][column1] == ship) {
			System.out.println("Ships cannot overlap. Try again!");
			System.exit(0);
		}
		else map[row1][column1] = ship;
		
		checkAnglePoints(map,row1,column1);
		
		System.out.print("Enter the ending row coordinate of the carrier: ");
		int rowEnd = in.nextInt();
		System.out.print("Enter the ending column coordinate of the carrier: ");
		char columnEnd = in.next().charAt(0);
		int row4 = rowEnd-1; int column4 = (int)columnEnd % 65;
		if(map[row4][column4] == ship) {
			System.out.println("Ships cannot overlap. Try again!");
			System.exit(0);
		}
		else map[row4][column4] = ship;
		
		checkAnglePoints(map,row4,column4);
		
		if(row1 == row4) {
			int row2 = row1;
			int row3 = row1;
			double column2 = (column1 + column4)/2.0 - 0.5;
			double column3 = (column1 + column4)/2.0 + 0.5;
			if(map[row2][(int)column2] == ship || map[row3][(int)column3] == ship) {
				System.out.println("Ships cannot overlap. Try again!");
				System.exit(0);
			}
			else {
				map[row2][(int)column2] = ship;
			    map[row3][(int)column3] = ship;	
			}
			checkAnglePoints(map,row2,(int)column2);
			checkAnglePoints(map,row3,(int)column3);
			if((map[row1][column1 - 1] == ship) || (map[row1][column4 + 1] == ship)) {
				System.out.println("Impossible positioning. Ships cannot touch laterally. Try again!");
				System.exit(0);
			}
		}
		else if(column1 == column4) {
			int column2 = column1;
			int column3 = column1;
			double row2 = (row1 + row4)/2.0 - 0.5;
			double row3 = (row1 + row4)/2.0 + 0.5;
			if(map[(int)row2][column2] == ship || map[(int)row3][column3] == ship) {
				System.out.println("Ships cannot overlap. Try again!");
				System.exit(0);
			}
			else {
				map[(int)row2][column2] = ship;
			    map[(int)row3][column3] = ship;	
			}	
			checkAnglePoints(map,(int)row2,column2);
			checkAnglePoints(map,(int)row3,column3);
			if((map[row1 - 1][column1] == ship) || (map[row4 + 1][column1] == ship)) {
				System.out.println("Impossible positioning. Ships cannot touch laterally. Try again!");
				System.exit(0);
			}
		}
		System.out.println();	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Ship[] ships = new Ship[4];
		ships[0] = new Cutter(33, 35, 34.5, 8.5, 150);
		System.out.println(ships[0].toString() + "\nYou have 4 identical cutters with the shown parameters. \n");
		ships[1] = new Corvette(70, 83, 29.5, 11.5, 30);
		System.out.println(ships[1].toString() + "You have 3 identical corvettes with the shown parameters. \n");
		ships[2] = new Destroyer(340, 150, 25.3, 2, 17);
		System.out.println(ships[2].toString() + "You have 2 identical destroyers with the shown parameters. \n");
		ships[3] = new AircraftCarrier(2500, 330, 14.5, 12, 35);
		System.out.println(ships[3].toString() + "You have 1 carrier with the shown parameters. \n");*/
		String[][] map = new String[11][11];
		int Xvalues[] = new int[10];
		int Yvalues[] = new int[10];
		System.out.println("You have to positionize/arrange: \n" +
		                   "  FOUR (4) cutters - single field; \n" + "  THREE (3) corvettes - double field; \n" + 
				           "  TWO (2) destroyers - triple field; \n" + "  ONE (1) carrier - quadruple field \n" +
				           "on a 10 X 10 grid map." + "\n");
		//importCutters(map);
	    //importCorvettes(map);
		//importDestroyers(map);
		importCarrier(map);
		System.out.println("Your ships on the map: \n");
		
		for(int i = 0; i < 10; i++) {
			if(i == 0) {
				System.out.printf("%6s",(char)(65+i));
			}
			else System.out.printf(" " + "%3s",(char)(65+i));
		}
		System.out.println();
		int numberOfRepeat = 0;
		for(int i = 0; i < 10; i++) {
			System.out.printf("%2d",(i+1));
			for(int j = 0; j < 10; j++) {
				if(map[i][j] == ship) {
					System.out.printf("%4s", ship);
					Xvalues[numberOfRepeat] = i;
					Yvalues[numberOfRepeat] = j;
					numberOfRepeat ++;
				}
				else System.out.printf("%4s", water);	
			}
			System.out.println();
			System.out.println();
		}
		System.out.println("Change players. Press 'ENTER': ");
		try{System.in.read();}
        catch(Exception e){};
		for(int i = 0; i < 150; i ++) {
			System.out.println();
		}
		for (int o = 0; o < 100; o ++) {
			System.out.print("Enter the row coordiate of the cell you want to check for: ");
			int row = in.nextInt();
			System.out.print("Enter the column coordiate of the cell you want to check for: ");
			int column = (int) in.next().charAt(0) % 65;
			System.out.println();
			for(int i = 0; i < 10; i++) {
				if(i == 0) {
					System.out.printf("%6s",(char)(65+i));
				}
				else System.out.printf(" " + "%3s",(char)(65+i));
			}
			System.out.println();
			for(int i = 0; i < 10; i++) {
				System.out.printf("%2d",(i+1));
				for(int j = 0; j < 10; j++) {
					if((i == row) && (j == column)) {
						for(numberOfRepeat = 0; numberOfRepeat < 10; numberOfRepeat ++) {
							
						}
						System.out.print(ship);
					}
					else System.out.print(" ");
				}
				System.out.println();
				System.out.println();
			}	
		}
		in.close();
	}
}
