package employeeApp;

public class EmployeeRunner {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.firstName = "Ahmad";
		e1.lastName = "Yousef";
		e1.basicSalary = 2000;
		e1.grade = 3;
		e1.id = "324";
		e1.hasInsurance = false;
		e1.nuOfChildren = 2;

		Employee e2 = new Employee();
		e2.firstName = "Malik";
		e2.lastName = "Jaber";
		e2.basicSalary = 3500;
		e2.grade = 5;
		e2.id = "1482";
		e2.hasInsurance = true;
		e2.nuOfChildren = 4;
		
		Employee[] employees = {e1,e2};
		for(Employee c : employees) {
			//System.out.println("Salary of: " +c.firstName +" " + c.lastName +" = "+ c.calcSalary());
			System.out.println(c.getReport(2));
			System.out.println("-------------------");
		}
	}

}
