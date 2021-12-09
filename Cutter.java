package projectBattleshipGame;
public class Cutter extends Ship {
	
	private double sonarRange;
	private double radarRange;

	public Cutter(int crewNumber, int length, double speed, double sonarRange, double radarRange) {
		super(crewNumber, length, speed);
		this.sonarRange = sonarRange;
		this.radarRange = radarRange;
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return getClass().getSimpleName() + super.toString() + "\nSonar range (in km): " + sonarRange +  
				"\nRadar range (in km): " + radarRange;
	}
	public double getSonarRange() {
		return sonarRange;
	}
	public void setSonarRange(double sonarRange) {
		this.sonarRange = sonarRange;
	}
	public double getRadarRange() {
		return radarRange;
	}
	public void setRadarRange(double radarRange) {
		this.radarRange = radarRange;
	}
}
