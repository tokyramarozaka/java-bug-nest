package employee_management;

import lombok.*;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
/**
 * TODO : a department is a collection of employees. It has a name and a set of employees in it.
 */
public class Department {
    /**
     * TODO : Employees should never ever be duplicated in a single department.
     * Please check if it already exists in the department before inserting if need be. Duplicate
     * here means : their employee id and name are the same.
     *
     * TODO : for our HR officer, give a function to show all details about employees, including
     * their pay.
     */
    private String name;
    private List<Employee> listOfEmployee;

    public void addEmployee(Employee employee) {
        boolean found = this.listOfEmployee.stream().anyMatch((employee1) -> employee1 == employee);
        if(found == false){
            listOfEmployee.add(employee);
        }else{
            throw new RuntimeException("This employee has existed");
        }


    }





}
