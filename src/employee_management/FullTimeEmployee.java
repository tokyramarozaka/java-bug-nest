package employee_management;

public class FullTimeEmployee extends Employee{
    private double monthlySalary;

    public FullTimeEmployee(int employeeId, String name, double monthlySalary) {
        super(employeeId, name);
        this.monthlySalary = monthlySalary;
    }
    @Override
    public double calculatePay() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMonthly Salary : " + monthlySalary;
    }

    @Override
    public double calculateTax() {
        return monthlySalary * 0.2;
    }
}

