package com.company;

import java.util.Objects;

public class Manager extends Employee {
    private String department;

    public Manager(String fullName, String telephone) {
        super(fullName, telephone);
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
