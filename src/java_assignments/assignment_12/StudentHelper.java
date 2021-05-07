package java_assignments.assignment_12;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentHelper {

	 // A method to print all the departments of the studentsList using the Stream API
	
	public void printAllDepartments(List<Student> studentList) {
		Stream<Student> stream = studentList.stream();
		Set<String> departments = stream
										.map((student) -> student.getEngDepartment())
										.collect(Collectors.toSet());
		
		
		System.out.println("Departments of the studentList : ");
		System.out.println("---------------------------------------------------------------");
		
		for(String department : departments) {
			System.out.println(department);
		}
		
		System.out.println("---------------------------------------------------------------");
	}
	
	
	// A method to find all the students of the studentsList who enrolled after a particular 
	// year given as a parameter using the Stream API
	
	public void findStudentEnrolledAfterYear(int year,List<Student> studentList) {
		Stream<Student> stream = studentList.stream();
		List<Student> filterList = stream
										.filter((student) -> student.getYearOfEnrollment() > year)
										.collect(Collectors.toList());
		
		System.out.println("Students enrolled after year " + year + " : ");
		System.out.println("---------------------------------------------------------------");
		
		for(Student student : filterList) {
			System.out.println(student);
		}
		
		System.out.println("---------------------------------------------------------------");
	}
	
	// A method to find all the male students of a particular department and print them
	// using the Stream API
	
	public void getMaleStudentsOfDepartment(String department,List<Student> studentList) {
		Stream<Student> stream = studentList.stream();
		List<Student> maleStudents = stream
										.filter((student) -> student.getEngDepartment().equalsIgnoreCase(department))
										.filter((student) -> student.getGender().equalsIgnoreCase("male"))
										.collect(Collectors.toList());
		
		System.out.println("Male students of department " + department + " : ");
		System.out.println("---------------------------------------------------------------");
		
		for(Student student : maleStudents) {
			System.out.println(student);
		}
		
		System.out.println("---------------------------------------------------------------");
	}
	
	// A method which prints the total no. of male students and female students present in the studentList
	
	public void countMaleAndFemaleStudents(List<Student> studentList) {
		Stream<Student> stream = studentList.stream();
		Map<String,List<Student>> genderCount = stream.collect(Collectors.groupingBy(Student :: getGender));
		
		System.out.println("No. of male students :" + genderCount.get("Male").size());
		System.out.println("No. of female students :" + genderCount.get("Female").size());

		System.out.println("---------------------------------------------------------------");
		
	}
	
	// A method which gives the average age of male and female students of the studentList
	
	public void getAverageAgeOfMaleAndFemaleStudents(List<Student> studentList) {
		Stream<Student> stream = studentList.stream();
		Map<String,List<Student>> genderCount = stream.collect(Collectors.groupingBy(Student :: getGender));
		
		double maleAverage = 0.0;
		double femaleAverage = 0.0;
		
		int maleCount = genderCount.get("Male").size();
		int femaleCount = genderCount.get("Female").size();
		
		for(Student student : genderCount.get("Male")) {
			maleAverage += student.getAge();
		}
		
		for(Student student : genderCount.get("Female")) {
			femaleAverage += student.getAge();
		}
		
		maleAverage /= maleCount;
		femaleAverage /= femaleCount;
		
		System.out.println("Average age of male students :" + maleAverage);
		System.out.println("Average age of female students :" + femaleAverage);

		System.out.println("---------------------------------------------------------------");
	}
	
	// A method which prints the student with the highest percentage in the studentList
	
	public void getStudentWithHighestPercentage(List<Student> studentList) {
		Stream<Student> stream = studentList.stream();
		Optional<Student> student = stream.max(new Comparator<Student>() {
			public int compare(Student s1,Student s2) {
				if(s2.getPerTillDate() - s1.getPerTillDate() > 0) return -1;
				else if(s2.getPerTillDate() - s1.getPerTillDate() < 0) return 1;
				else return 0;
			}
		});
		
		if(student.isPresent()) {
			System.out.println("Student with the highest percentage " + student);
		}
		else {
			System.out.println("There are no students to display");
		}	

		System.out.println("---------------------------------------------------------------");
	}
	
	// A method to count the students in each department of the studentList
	
	public void countStudentsByDepartment(List<Student> studentList) {
		Stream<Student> stream = studentList.stream();
		Map<String,List<Student>> studentCountByDepartment = stream.collect(Collectors.groupingBy(Student :: getEngDepartment));

		System.out.println("Student count by department : ");
		System.out.println("---------------------------------------------------------------");
		
		for(Map.Entry<String, List<Student>> entry : studentCountByDepartment.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue().size());
		}
		
		System.out.println("---------------------------------------------------------------");
	}
	
	// A method which is used to get the average percentage grouped by department in the studentList
	
	public void getAveragePercentageByDepartment(List<Student> studentList) {
		Stream<Student> stream = studentList.stream();
		Map<String,List<Student>> studentCountByDepartment = stream.collect(Collectors.groupingBy(Student :: getEngDepartment));
		
		System.out.println("Average percentage count by department : ");
		System.out.println("---------------------------------------------------------------");
		
		for(Map.Entry<String, List<Student>> entry : studentCountByDepartment.entrySet()) {
			double avg = 0.0;
			List<Student> tempList = entry.getValue();
			int deptSize = tempList.size();
			
			for(Student student : tempList) {
				avg += student.getPerTillDate();
			}
			
			avg /= deptSize;
			System.out.println(entry.getKey() + " - " + avg);
		}
		
		System.out.println("---------------------------------------------------------------");
	}
	
	// A method to find the youngest male student in the given department in the studentList
	
	public void getYoungestMaleByDepartment(String department,List<Student> studentList) {
		Stream<Student> stream = studentList.stream();
		Optional<Student> youngestMale = stream
										.filter((student) -> student.getEngDepartment().equalsIgnoreCase(department))
										.filter((student) -> student.getGender().equalsIgnoreCase("Male"))
										.collect(Collectors.minBy(new Comparator<Student>() {
											
											public int compare(Student s1,Student s2) {
												return s1.getAge() - s2.getAge();
											}
										}));
		
		if(youngestMale.isPresent()) {
			System.out.println("The youngest male student of " + department + " department is \n"+ youngestMale);
		}
		else {
			System.out.println("There are no students to display");
		}	

		System.out.println("---------------------------------------------------------------");	
	}
	
	// A method which prints the total no. of male students and female of a given department
	//present in the studentList
	
		public void countMaleAndFemaleStudentsByDepartment(String department,List<Student> studentList) {
			Stream<Student> stream = studentList.stream();
			Map<String,List<Student>> genderCountByDept = stream
														.filter((student) -> student.getEngDepartment().equalsIgnoreCase(department))
														.collect(Collectors.groupingBy(Student :: getGender));
			
			System.out.println("No. of male students of " + department + " department : " + 
														genderCountByDept.get("Male").size());
			System.out.println("No. of female students of " + department + " department : " +
														genderCountByDept.get("Female").size());

			System.out.println("---------------------------------------------------------------");
			
		}
	
	// A method to initialize the list passed as a parameter to the method
	
	public void initializeStudentList(List<Student> studentList) {
		studentList.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
		studentList.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
		studentList.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
		studentList.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
		studentList.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
		studentList.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
		studentList.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
		studentList.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
		studentList.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
		studentList.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
		studentList.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
		studentList.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
		studentList.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
		studentList.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
		studentList.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
		studentList.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
		studentList.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));
	}
}
