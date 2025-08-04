package employee_management;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private final String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public boolean addEmployee(Employee employee) {
        if (employees.contains(employee)) {
            return false;
        }
        employees.add(employee);
        return true;
    }

    public void showEmployees(){
        for(Employee e: employees){
            System.out.println(e);
        }
    }
}
