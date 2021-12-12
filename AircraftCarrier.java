package projectBattleshipGame;
public class AircraftCarrier extends Ship {
	
	private int numberOfHelicopters = 0;
	private int numberOfAirplanes = 0;

	public AircraftCarrier(int crewNumber, int length, double speed, int numberOfHelicopters, int numberOfAirplanes) {
		super(crewNumber, length, speed);
		this.numberOfAirplanes = numberOfAirplanes;
		this.numberOfHelicopters = numberOfHelicopters; 
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return getClass().getSimpleName() + super.toString() + "\nNumber of helicopters: " + numberOfHelicopters +
				"\nNumber of airplanes: " + numberOfAirplanes + "\n";
	}
	public int getNumberOfHelicopters() {
		return numberOfHelicopters;
	}
	public void setNumberOfHelicopters(int numberOfHelicopters) {
		this.numberOfHelicopters = numberOfHelicopters;
	}
	public int getNumberOfAirplanes() {
		return numberOfAirplanes;
	}
	public void setNumberOfAirplanes(int nmberOfAirplanes) {
		this.numberOfAirplanes = nmberOfAirplanes;
	}
}
