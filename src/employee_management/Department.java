package employee_management;
import java.util.Set;

public class Department {
	
    /**
     * TODO : Employees should never ever be duplicated in a single department.
     * Please check if it already exists in the department before inserting if need be. Duplicate
     * here means : their employee id and name are the same.
     *
     * TODO : for our HR officer, give a function to show all details about employees, including
     * their pay.
     */
	
	
	private Set<Employee>employee;
	
	Department(Set<Employee>employee){
		this.employee=employee;
	}

	public Set<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Department [employee=" + employee + "]";
	}
	
}
	
	