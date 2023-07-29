package employee_management;

public class FullTimeEmployee extends Employee{
    private double monthlySalary;

    public FullTimeEmployee(int employeeId, String name, double monthlySalary) {
        super(employeeId, name);
        this.monthlySalary = monthlySalary;
    }

    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if(monthlySalary < 0){
            throw new IllegalArgumentException("Monthly salary must be positive.");
        }else{
            this.monthlySalary = monthlySalary;
        }
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", monthly salary = '"+this.monthlySalary+"'";
    }
}

