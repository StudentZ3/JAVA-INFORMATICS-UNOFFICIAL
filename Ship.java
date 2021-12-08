package projectBattleshipGame;
public class Ship {
	private int crewNumber = 0;
	private int length = 0;
	private double draft = 0.0;
	
	public Ship(int crewNumber, int length, double draft) {
		this.crewNumber = crewNumber;
		this.length = crewNumber;
		this.draft = draft;
	}
	public String toString() {
		return "Number of crew members: " + crewNumber +
			   "\nLength of the ship (in meters): " + length +
			   "\nDraft of the ship (in meters): " + draft;
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
	public double getDraft() {
		return draft;
	}
	public void setDraft(double draft) {
		this.draft = draft;
	}
}
