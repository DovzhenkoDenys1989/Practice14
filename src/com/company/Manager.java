package com.company;

import java.util.Objects;

public class Manager extends Employee {
    private String department;

    public Manager(String fullName, String dateOfBirth, String telephone, String employmentDate, double salary, String presence, String department) {
        super(fullName, dateOfBirth, telephone, employmentDate, salary, presence);
        this.department = department;
    }

    public String consultation (){
        return "консультирует клиента";
    }

    public String forDiscount () {
        return "расказывает про скидки";
    }

    public String giveAdvice () {
        return "советует, какой товар купить";
    }

    @Override
    public void work (){
        System.out.println("Менеджер" + " " + consultation() + ", " +  forDiscount() + " и " + giveAdvice());
    }

    @Override
    public void goToWork() {
        super.goToWork();
        System.out.print(" - менеджер. ");
    }

    @Override
    public void lunch() {
        super.lunch();
        System.out.print(" - менеджер. ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Objects.equals(department, manager.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), department);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "department='" + department + '\'' +
                '}';
    }
}
