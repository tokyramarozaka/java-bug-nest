package employee_management;

import java.util.ArrayList;

public class TestCases {
    public static FullTimeEmployee fullTimeEmployeeKoto(){
        return new FullTimeEmployee(1, "Koto", 3_000_000);
    }

    public static PartTimeEmployee partTimeEmployeeLita(){
        return new PartTimeEmployee(1, "Lita", 22, 11_750);
    }


    public static void main(String[] args) {
        Department department = new Department("Informatique", new ArrayList<>());
        department.addEmployee(fullTimeEmployeeKoto());
        department.addEmployee(fullTimeEmployeeKoto());
        department.addEmployee(fullTimeEmployeeKoto());
        department.addEmployee(fullTimeEmployeeKoto());
        department.addEmployee(fullTimeEmployeeKoto());
        department.addEmployee(partTimeEmployeeLita());
        department.addEmployee(partTimeEmployeeLita());
        department.addEmployee(partTimeEmployeeLita());
        department.addEmployee(partTimeEmployeeLita());

        System.out.println(department.getEmployees());
    }










}
