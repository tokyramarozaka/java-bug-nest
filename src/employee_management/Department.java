package employee_management;

import java.util.Set;

public class Department {
    private String name;
    private Set<Employee> employees;

    public Department(String name, Set<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public Set<Employee> getEmployees () {
        return employees;
    }
}
