package objectsAndClasses.StudentScholarship;
public class ScholarshipTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student ("Barbara", 5.50);
		giveScholarshipIfEligible(student1);
		System.out.println(student1.scholarshipBalance);
	}
	
	public static void giveScholarshipIfEligible( Student s ) {
		if( s.grade >= 5.50) {
			s.scholarshipBalance += 100;
		}
	}

}


