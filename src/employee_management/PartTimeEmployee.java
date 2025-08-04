package employee_management;

public class PartTimeEmployee extends Employee {
    public double hoursWorked;
    public double hourlyRate;

    public PartTimeEmployee(int employeeId, String name,  double hoursWorked, double hourlyRate) {
        super(employeeId, name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
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

    @Override
    public String toString() {
        return super.toString() + ", [Part time employee ] ";
    }

    @Override
    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }
}

