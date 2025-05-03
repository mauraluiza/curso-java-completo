package entities;

public class Student {

	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double totalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public double missingGrade() {
		if (totalGrade() < 60.0 ) {
			return 60.0 - totalGrade();
		} else {
			return 0.0;
		}
	}
}
