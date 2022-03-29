package com.company;

public class Main {

    public static void main(String[] args) {
        Shelter romashka=new Shelter("Romashka","Pervomayskaya 19");
Dog rex=new Dog("Rex","Ovcharka",new String[]{"сидеть","лежать"},ColorEnum.BROWN,romashka);
        System.out.println(rex.getInfo());
        rex.makeVoice();
        rex.makeVoice(" гув гув");

Shelter shine=new Shelter("Shine","Ahunbaeva 172");
        Dog cool=new Dog("cool","pitbul",ColorEnum.BLACK,shine);
        System.out.println(cool.getInfo());
        cool.makeVoice();
        cool.makeVoice(" раф раф");
    }
}
