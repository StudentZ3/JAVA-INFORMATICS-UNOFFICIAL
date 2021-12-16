package projectBattleshipGame;
import java.util.Scanner;
public class MyShipsLatestVersion {

	public static final Scanner in = new Scanner(System.in);
	public static String water = "~";
	public static String ship = "X";

	public static void checkAnglePoints(String map[][], int row, int column) {
		if ((row > 0) && (column > 0) && (row < 9) && (column < 9)) {
			if (map[row - 1][column - 1] == ship || map[row + 1][column + 1] == ship || map[row + 1][column - 1] == ship
					|| map[row - 1][column + 1] == ship) {
				System.out.println("Impossible positioning. Ships cannot touch at their angle points. Try again!");
				System.exit(0);
			}
		} else if (row == 0 && column == 0) {
			if (map[row + 1][column + 1] == ship) {
				System.out.println("Impossible positioning. Ships cannot touch at their angle points. Try again!");
				System.exit(0);
			}
		} else if (row == 9 && column == 9) {
			if (map[row - 1][column - 1] == ship) {
				System.out.println("Impossible positioning. Ships cannot touch at their angle points. Try again!");
				System.exit(0);
			}
		} else if (row == 9 && column == 0) {
			if (map[row - 1][column + 1] == ship) {
				System.out.println("Impossible positioning. Ships cannot touch at their angle points. Try again!");
				System.exit(0);
			}
		} else if (row == 0 && column == 9) {
			if (map[row + 1][column - 1] == ship) {
				System.out.println("Impossible positioning. Ships cannot touch at their angle points. Try again!");
				System.exit(0);
			}
		}
	}

	public static void checkSides(String map[][], int row, int column) {
		if ((row > 0) && (column > 0) && (row < 9) && (column < 9)) {
			if (map[row - 1][column] == ship || map[row][column + 1] == ship || map[row][column - 1] == ship
					|| map[row + 1][column] == ship) {
				System.out.println("Impossible positioning. Ships cannot touch laterally. Try again!");
				System.exit(0);
			}
		}
	}

	public static void importCutters(String map[][]) {
		for (int i = 0; i < 4; i++) {
			System.out.print("Enter the row of cutter number " + (i + 1) + ": ");
			int row = in.nextInt();
			System.out.print("Enter the column of cutter number " + (i + 1) + ": ");
			char column = in.next().charAt(0);
			int r = row - 1;
			int k = (int) column % 65;
			if (map[r][k] == ship) {
				System.out.println("Ships cannot overlap. Try again!");
				System.exit(0);
			} else
				map[r][k] = ship;

			checkSides(map, r, k);
			checkAnglePoints(map, r, k);
			System.out.println();
		}
	}

	public static void importCorvettes(String map[][]) {
		for (int i = 0; i < 3; i++) {
			System.out.print("Enter the starting row coordinate of corvette number " + (i + 1) + ": ");
			int rowStart = in.nextInt();
			System.out.print("Enter the starting column coordinate  of corvette number " + (i + 1) + ": ");
			char columnStart = in.next().charAt(0);
			int row1 = rowStart - 1;
			int column1 = (int) columnStart % 65;
			if (map[row1][column1] == ship) {
				System.out.println("Ships cannot overlap. Try again!");
				System.exit(0);
			} else
				map[row1][column1] = ship;

			checkAnglePoints(map, row1, column1);

			System.out.print("Enter the ending row coordinate of corvette number " + (i + 1) + ": ");
			int rowEnd = in.nextInt();
			System.out.print("Enter the ending column coordinate of corvette number " + (i + 1) + ": ");
			char columnEnd = in.next().charAt(0);
			int row2 = rowEnd - 1;
			int column2 = (int) columnEnd % 65;
			if (map[row2][column2] == ship) {
				System.out.println("Ships cannot overlap. Try again!");
				System.exit(0);
			} else
				map[row2][column2] = ship;

			checkAnglePoints(map, row2, column2);

			if (row1 != row2 && column1 != column2) {
				System.out.println("Imposible positioning. Ships are alligned horizontally or vertically! Try again!");
				System.exit(0);
			} else if (row1 == row2 && column2 - column1 != 1) {
				System.out.println("Impossible positioning. The length of the corvette is 2. Try again!");
				System.exit(0);
			} else if (column1 == column2 && row2 - row1 != 1) {
				System.out.println("Impossible positioning. The length of the corvette is 2. Try again!");
				System.exit(0);
			}
			System.out.println();
		}
	}

	public static void importDestroyers(String map[][]) {
		for (int i = 0; i < 2; i++) {
			System.out.print("Enter the starting row coordinate of destroyer number " + (i + 1) + ": ");
			int rowStart = in.nextInt();
			System.out.print("Enter the starting column coordinate of destroyer number " + (i + 1) + ": ");
			char columnStart = in.next().charAt(0);
			int row1 = rowStart - 1;
			int column1 = (int) columnStart % 65;
			if (map[row1][column1] == ship) {
				System.out.println("Ships cannot overlap. Try again!");
				System.exit(0);
			} else
				map[row1][column1] = ship;

			checkAnglePoints(map, row1, column1);

			System.out.print("Enter the ending row coordinate of destroyer number " + (i + 1) + ": ");
			int rowEnd = in.nextInt();
			System.out.print("Enter the ending column coordinate of destroyer number " + (i + 1) + ": ");
			char columnEnd = in.next().charAt(0);
			int row3 = rowEnd - 1;
			int column3 = (int) columnEnd % 65;
			if (map[row3][column3] == ship) {
				System.out.println("Ships cannot overlap. Try again!");
				System.exit(0);
			} else
				map[row3][column3] = ship;

			checkAnglePoints(map, row3, column3);

			if (row1 != row3 && column1 != column3) {
				System.out.println("Imposible positioning. Ships are alligned horizontally or vertically! Try again!");
				System.exit(0);
			}

			if (row1 == row3) {
				if (column3 - column1 != 2) {
					System.out.println("Impossible positioning. The length of the destroyer is 3. Try again!");
					System.exit(0);
				}
				int row2 = row1;
				int column2 = (column3 + column1) / 2;
				if (map[row2][column2] == ship) {
					System.out.println("Ships cannot overlap. Try again!");
					System.exit(0);
				} else
					map[row2][column2] = ship;
				checkAnglePoints(map, row2, column2);
			} else if (column1 == column3) {
				if (row3 - row1 != 2) {
					System.out.println("Impossible positioning. The length of the destroyer is 3. Try again!");
					System.exit(0);
				}
				int column2 = column1;
				int row2 = (row1 + row3) / 2;
				if (map[row2][column2] == ship) {
					System.out.println("Ships cannot overlap. Try again!");
					System.exit(0);
				} else
					map[row2][column2] = ship;
				checkAnglePoints(map, row2, column2);
			}
			System.out.println();
		}
	}

	public static void importCarrier(String map[][]) {
		System.out.print("Enter the starting row coordinate of the carrier: ");
		int rowStart = in.nextInt();
		System.out.print("Enter the starting column coordinate of carrier: ");
		char columnStart = in.next().charAt(0);
		int row1 = rowStart - 1;
		int column1 = (int) columnStart % 65;
		if (map[row1][column1] == ship) {
			System.out.println("Ships cannot overlap. Try again!");
			System.exit(0);
		} else
			map[row1][column1] = ship;

		checkAnglePoints(map, row1, column1);

		System.out.print("Enter the ending row coordinate of the carrier: ");
		int rowEnd = in.nextInt();
		System.out.print("Enter the ending column coordinate of the carrier: ");
		char columnEnd = in.next().charAt(0);
		int row4 = rowEnd - 1;
		int column4 = (int) columnEnd % 65;
		if (map[row4][column4] == ship) {
			System.out.println("Ships cannot overlap. Try again!");
			System.exit(0);
		} else
			map[row4][column4] = ship;

		checkAnglePoints(map, row4, column4);

		if (row1 != row4 && column1 != column4) {
			System.out.println("Imposible positioning. Ships are alligned horizontally or vertically! Try again!");
			System.exit(0);
		}

		if (row1 == row4) {
			if (column4 - column1 != 3) {
				System.out.println("Impossible positioning. The length of the carrier is 4. Try again!");
				System.exit(0);
			}
			int row2 = row1;
			int row3 = row1;
			double column2 = (column1 + column4) / 2.0 - 0.5;
			double column3 = (column1 + column4) / 2.0 + 0.5;
			if (map[row2][(int) column2] == ship || map[row3][(int) column3] == ship) {
				System.out.println("Ships cannot overlap. Try again!");
				System.exit(0);
			} else {
				map[row2][(int) column2] = ship;
				map[row3][(int) column3] = ship;
			}
			checkAnglePoints(map, row2, (int) column2);
			checkAnglePoints(map, row3, (int) column3);
		} else if (column1 == column4) {
			if (row4 - row1 != 3) {
				System.out.println("Impossible positioning. The length of the carrier is 4. Try again!");
				System.exit(0);
			}
			int column2 = column1;
			int column3 = column1;
			double row2 = (row1 + row4) / 2.0 - 0.5;
			double row3 = (row1 + row4) / 2.0 + 0.5;
			if (map[(int) row2][column2] == ship || map[(int) row3][column3] == ship) {
				System.out.println("Ships cannot overlap. Try again!");
				System.exit(0);
			} else {
				map[(int) row2][column2] = ship;
				map[(int) row3][column3] = ship;
			}
			checkAnglePoints(map, (int) row2, column2);
			checkAnglePoints(map, (int) row3, column3);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ship[] ships = new Ship[4];
		ships[0] = new Cutter(33, 35, 34.5, 8.5, 150);
		System.out.println(ships[0].toString() + "\nYou have 4 identical cutters with the shown parameters. \n");
		ships[1] = new Corvette(70, 83, 29.5, 11.5, 30);
		System.out.println(ships[1].toString() + "You have 3 identical corvettes with the shown parameters. \n");
		ships[2] = new Destroyer(340, 150, 25.3, 2, 17);
		System.out.println(ships[2].toString() + "You have 2 identical destroyers with the shown parameters. \n");
		ships[3] = new AircraftCarrier(2500, 330, 14.5, 12, 35);
		System.out.println(ships[3].toString() + "You have 1 carrier with the shown parameters. \n");

		String[][] map = new String[11][11];
		int Xvalues[] = new int[20];
		int Yvalues[] = new int[20];
		int XfieldsHit[] = new int[100];
		int YfieldsHit[] = new int[100];
		String typeHitField[][] = new String[10][10];
		System.out.println("You have to positionize/arrange: \n" + "  FOUR (4) cutters - single field; \n"
				+ "  THREE (3) corvettes - double field; \n" + "  TWO (2) destroyers - triple field; \n"
				+ "  ONE (1) carrier - quadruple field \n" + "on a 10 X 10 grid map." + "\n");
	    importCutters(map);
		importCorvettes(map);
		importDestroyers(map);
		importCarrier(map);
		System.out.println("Your ships on the map: \n");

		for (int i = 0; i < 10; i++) {
			if (i == 0) {
				System.out.printf("%5s", (char) (65 + i));
			} else
				System.out.printf(" " + "%2s", (char) (65 + i));
		}
		System.out.println();
		int cellNumber = 0;
		for (int i = 0; i < 10; i++) {
			System.out.printf("%2d", (i + 1));
			for (int j = 0; j < 10; j++) {
				if (map[i][j] == ship) {
					System.out.printf("%3s", ship);
					Xvalues[cellNumber] = i + 1;
					Yvalues[cellNumber] = j + 1;
					cellNumber++;
				} else
					System.out.printf("%3s", water);
			}
			System.out.println();
		}
		System.out.println("\nChange players. Press 'ENTER': ");
		try {
			System.in.read();
		} catch (Exception e) {}
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
		int attempts = 0;
		int cellsHit = 0;
		for (int o = 0; o < 100; o++) {
			System.out.print("\nEnter the row coordiate of the cell you want to check for: ");
			int row = in.nextInt() - 1;
			System.out.print("Enter the column coordiate of the cell you want to check for: ");
			int column = (int) in.next().charAt(0) % 65;

			System.out.println();
			for (int i = 0; i < 10; i++) {
				if (i == 0) {
					System.out.printf("%5s", (char) (65 + i));
				} else System.out.printf(" " + "%2s", (char) (65 + i));	
			}
			System.out.println();
			for (int i = 0; i < 10; i++) {
				System.out.printf("%2d", (i + 1));
				for (int j = 0; j < 10; j++) {
					if ((i == row) && (j == column)) {
						XfieldsHit[attempts] = row;
						YfieldsHit[attempts] = column;
						int check = 0;
						for (int z = 0; z < cellNumber; z++) {
							if ((row == Xvalues[z] - 1) && (column == Yvalues[z] - 1)) {
								cellsHit++;
								check = 1;
								break;
							} else continue;	
						}
						if (check == 1) {
							typeHitField[row][column] = ship;
						} else if (check == 0) {
							typeHitField[row][column] = water;
						}
					}
					boolean isFieldHit = false;
					for (int y = 0; y < attempts; y++) {
						if ((i == XfieldsHit[y]) && (j == YfieldsHit[y])) {
							isFieldHit = true;
							if (typeHitField[i][j] == ship) {
								System.out.printf("%3s", ship);
							} else
								System.out.printf("%3s", water);
						} 
					}
					if(!isFieldHit) {
					    System.out.printf("%3s", "");
					}
				}
				System.out.println();
			}
			attempts++;
			if (cellsHit == 20) break;
		}
		System.out.println("\nCongratulations! Level passed in " + attempts + " attempts.");
		System.out.println("Number of 'ship' cells hit: " + cellsHit + ".");
		in.close();
	}
}
