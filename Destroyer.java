package projectBattleshipGame;
public class Destroyer extends Ship {
	
	private int numberOfHelicopters = 0;
	private double attackRange = 0.0;

	public Destroyer(int crewNumber, int length, double speed, int numberOfHelicopters, double attackRange) {
		super(crewNumber, length, speed);
		this.attackRange = attackRange;
		this.numberOfHelicopters = numberOfHelicopters;
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return getClass().getSimpleName() + super.toString() + "\nNumber of helicopters: " + numberOfHelicopters +
				"\nAttack range (in km): " + attackRange + "\n";
	}
	public int getNumberOfHelicopters() {
		return numberOfHelicopters;
	}
	public void setNumberOfHelicopters(int numberOfHelicopters) {
		this.numberOfHelicopters = numberOfHelicopters;
	}
	public double getAttackRange() {
		return attackRange;
	}
	public void setAttackRange(double attackRange) {
		this.attackRange = attackRange;
	}
}
