package com.company;

import java.util.Objects;

public class Client extends Person {
    private String discount;
    private double money;

    public Client(String fullName, String telephone) {
        super(fullName, telephone);
    }

    public void aboutProduct (){
        System.out.println("Узнать о товаре");
    }
    public void buy (){
        System.out.println("Купить");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Client client = (Client) o;
        return Double.compare(client.money, money) == 0 &&
                Objects.equals(discount, client.discount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), discount, money);
    }

    @Override
    public String toString() {
        return "Client{" +
                "discount='" + discount + '\'' +
                ", money=" + money +
                '}';
    }
}
