package projectBattleshipGame;
public class Ship {

	private int crewNumber = 0;
	private int length = 0;
	private double speed = 0.0;
	
	public Ship(int crewNumber, int length, double speed) {
		this.crewNumber = crewNumber;
		this.length = length;
		this.speed = speed;
	}
	public String toString() {
		return "\nNumber of crew members: " + crewNumber +
		       "\nLength of the ship (in meters): " + length +
		       "\nSpeed of the ship (in knots): " + speed;
	}
	public int getCrewNumber() {
		return crewNumber;
	}
	public void setCrewNumber(int crewNumber) {
		this.crewNumber = crewNumber;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
}
