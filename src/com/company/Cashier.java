package com.company;

import java.util.Objects;

public class Cashier extends Employee {
    private byte cashierNumber;

    public Cashier(String fullName, String dateOfBirth, String telephone, String employmentDate, double salary, String presence, byte cashierNumber) {
        super(fullName, dateOfBirth, telephone, employmentDate, salary, presence);
        this.cashierNumber = cashierNumber;
    }

    public String countMoney (){
        return "считает деньги";
    }

    @Override
    public void work (){
        System.out.println("Кассир продает товар" + " и " + countMoney());
    }

    @Override
    public void goToWork() {
        super.goToWork();
        System.out.print(" - кассир. ");
    }

    @Override
    public void lunch() {
        super.lunch();
        System.out.print(" - кассир. ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cashier cashier = (Cashier) o;
        return cashierNumber == cashier.cashierNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cashierNumber);
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "cashierNumber=" + cashierNumber +
                '}';
    }
}
