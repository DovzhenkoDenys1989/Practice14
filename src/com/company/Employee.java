package com.company;

import java.util.Objects;

public class Employee extends Person {
    private String employmentDate;
    private double salary;
    private String presence;

    public Employee(String fullName, String dateOfBirth, String telephone, String employmentDate, double salary, String presence) {
        super(fullName, dateOfBirth, telephone);
        this.employmentDate = employmentDate;
        this.salary = salary;
        this.presence = presence;
    }

    public void goToWork (){
        System.out.print("Сотрудник пришел на работу");
    }

    public void lunch (){
        System.out.print("Сотрудник идет на обед");
    }

    public void work (){
        System.out.println("Сотрудник делает работу");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(employmentDate, employee.employmentDate) &&
                Objects.equals(presence, employee.presence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), employmentDate, salary, presence);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employmentDate='" + employmentDate + '\'' +
                ", salary=" + salary +
                ", presence='" + presence + '\'' +
                '}';
    }
}
