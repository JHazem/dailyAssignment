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


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCollege() {
		return college;
	}


	public void setCollege(String college) {
		this.college = college;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public float getGpa() {
		return gpa;
	}


	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	
	
	public boolean equals(Student a) {
		if(this.getName().equals(a.getName())) {
			return true;
		}
		return false;
	}
	
	
	
	
}
