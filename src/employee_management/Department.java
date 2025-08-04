package employee_management;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private final String name;
    private List<Employee> employees = new ArrayList<>() ;

    public Department(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee){
        boolean isExisting = false;
        for (Employee e : employees) {
            if (e.getEmployeeId() == employee.getEmployeeId() && e.getName().equals(employee.getName())) {
                isExisting = true;
                break;
            }
        }
        if (!isExisting) {
            employees.add(employee);
        }
    }

    public String getDepartmentDetails(){
        StringBuilder details = new StringBuilder();
        details.append("Department Name : ").append(name).append("\n");
        details.append("-----------------------------------\n");
        for (Employee e : employees) {
            details.append(e.toString()).append("\n");
            details.append("-----------------------------------\n");
        }
        return details.toString();
    }

    public String getEmployeesFullDetails(){
        StringBuilder details = new StringBuilder();
        details.append("Department Name : ").append(name).append("\n");
        details.append("-----------------------------------\n");
        for (Employee e : employees) {
            if (e instanceof FullTimeEmployee) {
                details.append(e.toString())
                        .append("\nPay : ")
                        .append(((FullTimeEmployee) e).calculatePay())
                        .append("\n-----------------------------------\n");
            }
            else if (e instanceof PartTimeEmployee) {
                details.append(e.toString())
                        .append("\nHourly Rate : ")
                        .append(((PartTimeEmployee) e).getHourlyRate())
                        .append("\nHours Worked : ")
                        .append(((PartTimeEmployee) e).getHoursWorked())
                        .append("\nPay : ")
                        .append(((PartTimeEmployee) e).calculatePay())
                        .append("\n-----------------------------------\n");
            }
        }
        return details.toString();
    }
}
