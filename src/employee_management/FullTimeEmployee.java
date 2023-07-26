package employee_management;

public class FullTimeEmployee {
    public int employeeId;
    public String name;
    public double monthlySalary;

    public FullTimeEmployee(int employeeId, String name, double monthlySalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public double calculatePay() {
        return monthlySalary;
    }
}

