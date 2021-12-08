package projectBattleshipGame;
public class Cutter extends Ship {
	
	private double sonarRange;

	public Cutter(int crewNumber, int length, double draft, double sonarRange) {
		super(crewNumber, length, draft);
		this.sonarRange = sonarRange;
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return getClass().getSimpleName() + super.toString() + "\nSonar range (in km): " + sonarRange + "\n";
	}
	public double getSonarRange() {
		return sonarRange;
	}
	public void setSonarRange(double sonarRange) {
		this.sonarRange = sonarRange;
	}
}
