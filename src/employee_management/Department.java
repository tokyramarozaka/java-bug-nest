package employee_management;

import java.util.List;

/**
 * TODO : a department is a collection of employees. It has a name and a set of employees in it.
 */
public class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee toAdd){
        if(this.employees.contains(toAdd)){
            System.out.println("Erreur ! l'employé existe déjà dans la base de données");
        }else{
            this.employees.add(toAdd);
        }
    }








}
