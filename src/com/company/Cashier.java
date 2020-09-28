package com.company;

import java.util.Objects;

public class Cashier extends Employee {
    private byte cashierNumber;

    public Cashier(String fullName, String telephone) {
        super(fullName, telephone);
    }

    public String countMoney (){
        return "считает деньги";
    }

    @Override
    public void work (){
        System.out.println("Кассир продает товар" + " и " + countMoney());
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
