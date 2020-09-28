package com.company;

public class Security extends Employee {

    public Security(String fullName, String telephone) {
        super(fullName, telephone);
    }

    public String talkRadio (){
        return "говорит по рации";
    }

    @Override
    public void work (){
        System.out.println("Охранник следит за клиентами" + " и " + talkRadio());
    }

    @Override
    public String toString() {
        return "Security{}";
    }
}
