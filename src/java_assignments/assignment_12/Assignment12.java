package java_assignments.assignment_12;

import java.util.ArrayList;
import java.util.List;

public class Assignment12 {
	public static void main(String args[]) {
		List<Student> studentList = new ArrayList<>();
		StudentHelper helper = new StudentHelper();
		
		helper.initializeStudentList(studentList);
		helper.printAllDepartments(studentList);
		helper.findStudentEnrolledAfterYear(2018,studentList);
		helper.getMaleStudentsOfDepartment("Computer Science", studentList);
		helper.countMaleAndFemaleStudents(studentList);
		helper.getAverageAgeOfMaleAndFemaleStudents(studentList);
		helper.getStudentWithHighestPercentage(studentList);
		helper.countStudentsByDepartment(studentList);
		helper.getAveragePercentageByDepartment(studentList);
		helper.getYoungestMaleByDepartment("Electronic", studentList);
		helper.countMaleAndFemaleStudentsByDepartment("Computer Science",studentList);
	}
}
