package employee_management;

public class TestCases {
    public static FullTimeEmployee fullTimeEmployeeKoto(){
        return new FullTimeEmployee(1, "Koto", 3_000_000);
    }

    public static PartTimeEmployee partTimeEmployeeLita(){
        return new PartTimeEmployee(1, "Lita", 22, 11_750);
    }

    public static void main(String[] args) {
        FullTimeEmployee koto = TestCases.fullTimeEmployeeKoto();
        PartTimeEmployee lita = TestCases.partTimeEmployeeLita();

        koto.setMonthlySalary(6_000_000);
        lita.setHoursWorked(1_000);

        lita.setHourlyRate(-10_000_000);

        System.out.println("Details about Koto " + koto);
        System.out.println("Details about Lita " + lita);
    }
}
