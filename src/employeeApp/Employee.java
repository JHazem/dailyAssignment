package employeeApp;

public class Employee {

	String id;
	String firstName;
	String lastName;
	float basicSalary;
	boolean hasInsurance;
	int grade;
	int nuOfChildren;
	
	
	public float calcSalary() {
		float totalSalary = basicSalary;
		if(hasInsurance) {
			totalSalary -=totalSalary * 0.02f;
			totalSalary += nuOfChildren * 20;
		}
		return totalSalary;
	}
	
	public String getReport(int reportType) {
		String report ="";
		if(reportType ==1 ) {
			report+= "Name: "+ firstName +" "+lastName+"\nID: "+id +"\nGrade: "+grade ;
			
		}else if(reportType ==2) {
			report+= "Name: "+ firstName +" "+lastName+"\nID: "+id +"\nGrade: "+grade+
					"\nBasic Salary: "+basicSalary+"\nHas Insurance: " +hasInsurance+
					"\nNumber of Children: "+nuOfChildren+"\nTotal Salary: "+ calcSalary(); 
		}else {
			report +="Invalid report type";
			
		}
		return report;
	}
	
	
	
	
}
