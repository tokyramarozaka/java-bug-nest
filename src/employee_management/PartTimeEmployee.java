package employee_management;

public class PartTimeEmployee extends Employee{
    private double hoursWorked;
    private double hourlyRate;

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
    @Override
    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public double calculateTax() {
        return hoursWorked * hourlyRate * 0.15;
    }

    @Override
    public String toString() {
        return super.toString() +"\nHours Worked : " + hoursWorked +
                                    "\nHourly Rate : " + hourlyRate +
                                    "\nTax:" + calculateTax();
    }


}

