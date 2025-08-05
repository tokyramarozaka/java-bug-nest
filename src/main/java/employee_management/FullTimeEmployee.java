package employee_management;

public class FullTimeEmployee  extends   Employee{

    private final double  monthlySalary;

    public FullTimeEmployee(int employeeId, String fullname, String email, String phoneNumber, String adresse, double monthlySalary) {
        super(employeeId, fullname, email, phoneNumber, adresse);
        this.monthlySalary = monthlySalary;
    }


    public double calculatePay() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return super.toString() ;
    }


}

