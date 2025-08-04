package employee_management;

public abstract class Employee {
    private final int employeeId;
    private final String name;
    private double pay;

    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
        this.pay = pay;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getPay() {
        return pay;
    }

    public abstract double calculatePay ();

    @Override
    public String toString() {
        return "Employee : ID = " + employeeId + ", name = " + name + ", pay = " + pay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee e = (Employee) o;
        return getEmployeeId() == e.getEmployeeId() &&
                getName().equals(e.getName());
    }
}
