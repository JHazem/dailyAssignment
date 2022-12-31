package studentReport;

public class MainRunner {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.id = "3443";
		s1.name = "Mike";
		s1.college = "MMM";
		s1.department = "Science";
		s1.gpa = 80;
		
		Student s2 = new Student();
		s2.id = "2313";
		s2.name = "Jhon";
		s2.college = "KKK";
		s2.department = "Art";
		s2.gpa = 72;
		
//		String report = s1.getReport();
//		System.out.println(report);
//		
//		String report2 = s2.getReport();
//		System.out.println(report2);
// 					or
		Student[] students = {s1, s2};
		for(Student b: students) {
			System.out.println(b.getReport());
			System.out.println("Grade: " + b.getStaudentGrade());
		}
		  
		
		boolean result = s1.equals(s2);
	}

}
