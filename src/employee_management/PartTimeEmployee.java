package employee_management;

public abstract class PartTimeEmployee extends Employee {
    private double hoursWorked;
    private double hourlyRate;

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public PartTimeEmployee(Employee employee, double hourlyRate) {
        super(employee.getEmployeeId(), employee.getName());
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }
}

