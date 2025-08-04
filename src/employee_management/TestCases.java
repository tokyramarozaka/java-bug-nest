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

        System.out.println("Details about Koto " + koto);
        System.out.println("Details about Lita " + lita);
    }
}
