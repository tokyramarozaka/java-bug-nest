package com.java_bug_nest.employee_management;

public abstract class Employee {
  protected int employeeId;
  protected String employeeName;
  private static int lastEmployeeId = 0;

  // FIXME:
  // - It doensn't prevent from duplicated ID.

  protected Employee(int employeeId, String employeeName) {
    this.employeeId = employeeId;
    this.employeeName = employeeName;
    lastEmployeeId = employeeId;
    lastEmployeeId++;
  }

  protected Employee(String employeeName) {
    this.employeeName = employeeName;
    this.employeeId = lastEmployeeId;
    lastEmployeeId++;
  }

  public abstract double calculatePay();

  public abstract double calculateTaxe();

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + employeeId;
    result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
    return result;
  }

  /**
   * This method is only working well if the current Employee works at the
   * departement.
   */
  public abstract String showSensitiveInfo(Department departement);

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Employee other = (Employee) obj;
    if (employeeId != other.employeeId)
      return false;
    if (employeeName == null) {
      if (other.employeeName != null)
        return false;
    } else if (!employeeName.equals(other.employeeName))
      return false;
    return true;
  }

}
