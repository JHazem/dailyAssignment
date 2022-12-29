package studentReport;

public class Student {
	String id;
	String name;
	String college;
	String department;
	float gpa;
	
	public String getReport() {
		String report = "";
		
		report += "************  Report about  " +name + "  ************\n";
		report += "ID: "+id +"\n";
		report += "Name: "+name +"\n";
		report += "College: "+college +"\n";
		report += "Department: "+department +"\n";
		report += "GPA: "+gpa+"\n";
		return report;
	}
	
	
	public String getStaudentGrade() {
		String grade = "";
		if(gpa >= 90) {
			grade = "Excellent";
		}
		else if(gpa >= 80 && gpa < 90) {
			grade = "Very Good";
		}
		else if(gpa >= 70 && gpa < 80) {
			grade = "Good";
		}
		else if(gpa >= 60 && gpa < 70) {
			grade = "Accepted";
		}else {
			grade = "Failed";
		}
		return grade;
		
	}
}
