package com.company;

import java.util.Objects;

public class Shop {
    private String name;
    private String address;
    private Manager manager;
    private Cashier cashier;
    private Security security;
    private Client client;

    public void open (){
        System.out.println("Открыться");
    }
    public void onlunch(){
        System.out.println("Пойти на обед");
    }
    public void sellProduct (){
        System.out.println("Продавать товары");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Objects.equals(name, shop.name) &&
                Objects.equals(address, shop.address) &&
                Objects.equals(manager, shop.manager) &&
                Objects.equals(cashier, shop.cashier) &&
                Objects.equals(security, shop.security) &&
                Objects.equals(client, shop.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, manager, cashier, security, client);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", manager=" + manager +
                ", cashier=" + cashier +
                ", security=" + security +
                ", client=" + client +
                '}';
    }
}
