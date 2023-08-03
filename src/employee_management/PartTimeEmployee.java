package employee_management;
public class PartTimeEmployee extends Employee{
	
    private int employeeId;
    private String name;
    private double hoursWorked;
    private double hourlyRate;
    public PartTimeEmployee(int employeeId, String name, double hoursWorked, double hourlyRate) {
    	super(employeeId, name, hourlyRate, hourlyRate);
    	this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

    

    public double calculatePay() {
        return super.calculatePay();
    }
    
    @Override
	public String toString() {
		return "PartTimeEmployee [employeeId=" + employeeId + ", name=" + name + ", hoursWorked=" + hoursWorked
				+ ", hourlyRate=" + hourlyRate + "]";
	}
}

