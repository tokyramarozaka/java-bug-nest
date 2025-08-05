package employee_management;

public abstract class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public FullTimeEmployee(Employee employee, double monthlySalary) {
        super(employee.getEmployeeId(), employee.getName());
        monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }
}

