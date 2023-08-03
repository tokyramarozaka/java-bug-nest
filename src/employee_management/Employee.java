package employee_management;


abstract class Employee {
	 int employeeId;
	 String name;
	 double monthlySalary;
	 private double hoursWorked;
	 private double hourlyRate;
	 
	 public Employee(int employeeId, String name, double monthlySalary) {
		this.employeeId = employeeId;
		this.name = name;
		this.monthlySalary=monthlySalary;
			
	 }
	  public Employee(int employeeId, String name, double hoursWorked, double hourlyRate) {
		
		this.employeeId = employeeId;
		this.name = name;
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	double calculatePay() {
		  return hoursWorked * hourlyRate;
	 }
   
}
