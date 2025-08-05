package employee_management;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public class PartTimeEmployee extends Employee{

    private double hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String fullname, String email, String phoneNumber, String adresse,double hourlyRate,double hoursWorked) {
        super(employeeId, fullname, email, phoneNumber, adresse);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }


    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public String toString() {
        return super.toString() +
                ",hoursWorked=" + hoursWorked ;
    }
}

