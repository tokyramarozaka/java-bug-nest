package employee_management;

public abstract class Employee {
    public static int lastEmployeeId = 0;
    private final int employeeId;
    private final String name;

    public Employee(int employeeId, String name) {
        if (employeeId <= 0 || employeeId < lastEmployeeId) {
            throw new IllegalArgumentException("Invalid Employee Id");
        }
        this.employeeId = employeeId;
        lastEmployeeId = employeeId;
        this.name = name;
    }

    public Employee (String name){
        this.employeeId = lastEmployeeId + 1;
        lastEmployeeId++;
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public abstract double calculatePay();
    public abstract double calculateTax();
    @Override
    public String toString() {
        return "EmployeeId : " + employeeId + "\nName : " + name + "\nPay : " + calculatePay();
    }
}
