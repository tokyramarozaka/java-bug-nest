package employee_management;

public class FullTimeEmployee extends Employee {
    public double monthlySalary;

    public FullTimeEmployee(int employeeId, String name,  double monthlySalary) {
        super(employeeId, name);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return super.toString() + ", [Full time Employee]";
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }
}

