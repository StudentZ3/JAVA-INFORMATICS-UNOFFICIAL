package objectsAndClasses.ScolarshipWithPrivateFields;

public class StudentWithPrivateFields {
	private String name = " ";
	private double grade = 0;
	private double scholarshipBalance = 0;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public double getScholarshipBalance() {
		return scholarshipBalance;
	}
	public void setScholarshipBalance(double scholarshipBalance) {
		this.scholarshipBalance = scholarshipBalance;
	}
	
	StudentWithPrivateFields(){
		//empty constructor;
	}
	StudentWithPrivateFields( String name, double grade, double scholarshipBalance){
		this.name = name;
		this.grade = grade;
		this.scholarshipBalance = scholarshipBalance;
	}
	boolean isEligibleForScolarship() {
		return grade > 5.50;
	}
	
}
