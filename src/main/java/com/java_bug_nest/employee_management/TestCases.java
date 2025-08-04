package com.java_bug_nest.employee_management;

public class TestCases {
  public static FullTimeEmployee fullTimeEmployeeKoto() {
    return new FullTimeEmployee(0, "Koto", 3_000_000);
  }

  public static PartTimeEmployee partTimeEmployeeLita() {
    return new PartTimeEmployee(2, "Lita", 22, 11_750);
  }

  public static void main(String[] args) {
    FullTimeEmployee koto = TestCases.fullTimeEmployeeKoto();
    FullTimeEmployee john = new FullTimeEmployee("employeeName", 3000.0);
    FullTimeEmployee rakoto = new FullTimeEmployee("Rkoo", 3000.00);
    PartTimeEmployee lita = TestCases.partTimeEmployeeLita();
    Department dev = new Department("Backend");

    System.out.println("\n");
    System.out.println(koto.toString());
    System.out.println(john.toString());
    System.out.println(rakoto.toString());
    System.out.println(lita.toString());
  }
}
