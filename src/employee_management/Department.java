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
}
