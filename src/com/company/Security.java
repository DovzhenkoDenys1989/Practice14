package com.company;

public class Security extends Employee {

    public Security(String fullName, String dateOfBirth, String telephone, String employmentDate, double salary, String presence) {
        super(fullName, dateOfBirth, telephone, employmentDate, salary, presence);
    }

    public String talkRadio (){
        return "говорит по рации";
    }

    @Override
    public void work (){
        System.out.println("Охранник следит за клиентом" + " и " + talkRadio());
    }

    @Override
    public void goToWork() {
        super.goToWork();
        System.out.println(" - охранник.");
    }

    @Override
    public void lunch() {
        super.lunch();
        System.out.println(" - охранник.");
    }

    @Override
    public String toString() {
        return "Security{}";
    }
}
