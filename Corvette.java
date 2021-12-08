package projectBattleshipGame;
public class Corvette extends Ship {
	
	private double sonarRange;
	private int numberOfRockets;

	public Corvette(int crewNumber, int length, double draft, double sonarRange, int numberOfRockets) {
		super(crewNumber, length, draft);
		this.numberOfRockets = numberOfRockets;
		this.sonarRange = sonarRange;
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return getClass().getSimpleName() + super.toString() + "\nSonar range (in km): " + sonarRange +
				"\nNumber of rockets: " + numberOfRockets + "\n";
	}
	public double getSonarRange() {
		return sonarRange;
	}
	public void setSonarRange(double sonarRange) {
		this.sonarRange = sonarRange;
	}
	public int getNumberOfRockets() {
		return numberOfRockets;
	}
	public void setNumberOfRockets(int numberOfRockets) {
		this.numberOfRockets = numberOfRockets;
	}
}
