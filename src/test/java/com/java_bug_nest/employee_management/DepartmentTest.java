package com.java_bug_nest.employee_management;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DepartmentTest {

  @Test
  void should_add_new_employee() {
    FullTimeEmployee koto = new FullTimeEmployee("Koto", 300000.00);
    PartTimeEmployee lita = new PartTimeEmployee("Lita", 1000000.0, 10);
    Department backend = new Department("Backend");

    backend.addNewEmployee(koto);
    backend.addNewEmployee(lita);

    Assertions.assertEquals(backend.getEmployeesList().size(), 2);
    Assertions.assertEquals(backend.getEmployeesList().get(0), koto);
  }

  @Test
  void employee_should_exist() {
    FullTimeEmployee koto = new FullTimeEmployee("Koto", 300000.00);
    PartTimeEmployee lita = new PartTimeEmployee("Lita", 1000000.0, 10);
    Department backend = new Department("Backend");

    backend.addNewEmployee(koto);
    backend.addNewEmployee(lita);

    Assertions.assertTrue(backend.employeeExist(koto));
    Assertions.assertTrue(backend.employeeExist(lita));
  }
}
