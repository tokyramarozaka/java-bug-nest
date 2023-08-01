package employee_management;
public class Test {

    public static FullTimeEmployee fullTimeEmployeeKoto(){
        return new FullTimeEmployee(1, "Koto", 3_000_000);
    }

    public static PartTimeEmployee partTimeEmployeeLita(){
        return new PartTimeEmployee(1, "Lita", 22, 11_750);
    }

    public static void main(String[] args) {
    	FullTimeEmployee koto = fullTimeEmployeeKoto();
        PartTimeEmployee lita = partTimeEmployeeLita();
        // TODO : prevent the direct access here
        koto.setMonthlySalary(6_000_000);
        lita.setHoursWorked(1_000);

        // TODO : do not allow incoherent changes on salaries (applies to full time employees too)
        lita.setHourlyRate(10_000_000);

        // TODO : fix the string format of both full time and part time employees
        // NOTE : do not show sensitive data such as hourlyRate or monthlySalary here !
        System.out.println("Details about Koto " + koto);
        System.out.println("Details about Lita " + lita);
    }
}



