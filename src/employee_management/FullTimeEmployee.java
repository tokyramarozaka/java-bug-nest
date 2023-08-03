package employee_management;

class FullTimeEmployee extends Employee {
    private int employeeId;
    private String name;
    private double monthlySalary;
    FullTimeEmployee(int employeeId, String name, double monthlySalary) {
    	super(employeeId, name, monthlySalary);
    	this.employeeId = employeeId;
        this.name = name;
        this.monthlySalary = monthlySalary;
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

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	

    public double calculatePay() {
        return monthlySalary;
    }
    @Override
	public String toString() {
		return "FullTimeEmployee [employeeId=" + employeeId + ", name=" + name + ", monthlySalary=" + monthlySalary
				+ "]";
	}

}
