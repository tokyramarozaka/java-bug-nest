package employee_management;

public class PartTimeEmployee extends Employee {
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

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate){
        if(hourlyRate < 0){
            // throw : generer une érreur.
            throw new IllegalArgumentException("hourly rate cannot be negative.");
        }else{
            this.hourlyRate = hourlyRate;
        }
    }

    @Override
    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", hours worked = '"+this.hoursWorked+"'" +
                ", hourly rate = '"+this.hourlyRate+"'";
    }
}

