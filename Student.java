package objectsAndClasses.StudentScholarship;
public class Student {
	
	String name = " ";
	double grade = 0;
	double scholarshipBalance = 0;
	
	Student(){
		//empty constructor;
	}
	Student( String name, double grade ){
		this.name = name;
		this.grade = grade;
	}
	boolean isEligibleForScolarship() {
		return grade > 5.50;
	}

}
