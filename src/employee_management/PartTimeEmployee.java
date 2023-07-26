package employee_management;

public class PartTimeEmployee {
    public int employeeId;
    public String name;
    public double hoursWorked;
    public double hourlyRate;


    public PartTimeEmployee(int employeeId, String name, double hoursWorked, double hourlyRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }
}

