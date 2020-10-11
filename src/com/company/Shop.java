package com.company;

import java.util.Objects;

public class Shop {
    private String name;
    private String address;
    private Manager manager;
    private Cashier cashier;
    private Security security;
    private Client client;

    public Shop(String name, String address, Manager manager, Cashier cashier, Security security, Client client) {
        this.name = name;
        this.address = address;
        this.manager = manager;
        this.cashier = cashier;
        this.security = security;
        this.client = client;
    }

    public void open (){
        System.out.println("Магазин открывается");
    }

    public void sellProduct (){
        System.out.println("Магазин начинает продавать товары");
        client.aboutProduct();
        manager.work();
        client.buy();
        cashier.work();
        security.work();
    }

    public void onlunch(){
        System.out.println("Магазин закрывается на обед");
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
