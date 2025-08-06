package employee_management;

public class PartTimeEmployee extends Employee {
    public double hoursWorked;
    public double hourlyRate;


    public PartTimeEmployee(int employeeId, String name, double hoursWorked, double hourlyRate) {
        super(employeeId, name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
    public double getHourlyRate() {
        return hourlyRate;
    }

    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }
}

