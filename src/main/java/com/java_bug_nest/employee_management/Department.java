package com.java_bug_nest.employee_management;

import java.util.ArrayList;

public class Department {
  private String departmentName;

  private ArrayList<Employee> employeesList;

  public Department(String departmentName) {
    this.departmentName = departmentName;
    this.employeesList = new ArrayList<>();
  }

  public ArrayList<Employee> getEmployeesList() {
    return employeesList;
  }

  public String getDepartmentName() {
    return departmentName;
  }

  public boolean addNewEmployee(Employee newEmployee) {
    if (employeeExist(newEmployee)) {
      return false;
    }
    this.employeesList.add(newEmployee);
    return true;
  }

  public boolean employeeExist(Employee employee) {
    for (Employee e : this.employeesList) {
      if (e.equals(employee)) {
        return true;
      }
    }
    return false;
  }

  public String showAllEmployeesAbout() {
    String info = "Employees information: \n";
    if (this.employeesList.size() == 0) {
      return "There are no employees here.";
    }
    for (Employee e : this.employeesList) {
      info += e.showSensitiveInfo(this);
      info += "\n";
    }
    return info;
  }
}
