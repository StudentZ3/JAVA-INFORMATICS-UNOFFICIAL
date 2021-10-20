package objectsAndClasses.ScolarshipWithPrivateFields;
import java.util.Scanner;
public class ScolarshipTestWithPrivateFields {

	public static void giveScholarshipIfEligible( StudentWithPrivateFields s ) {
		if (s.getGrade() >= 5.50) {
			s.setScholarshipBalance(s.getScholarshipBalance() + 100);
		}
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the name of the student: ");
		String names = input.nextLine();
		System.out.print("Enter the average progress of the student. Use , for fractions: ");
		double prog = input.nextDouble();
		System.out.print("Enter the current scolarship balance of the student. Use , for fractions: ");
		double scholarshipBalance = input.nextDouble();
		
		StudentWithPrivateFields student1 = new StudentWithPrivateFields (names, prog, scholarshipBalance);

		giveScholarshipIfEligible(student1);
		System.out.println("Available balance: " + student1.getScholarshipBalance());
		
		input.close();
	}	
}
