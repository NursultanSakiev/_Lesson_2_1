package com.company;

import java.util.Random;

public class Pet {
    private int age=generateDefaultAge();
    private ColorEnum colourEnum;
    private Shelter shelter;

    public int getAge() {
        return age;
    }

    public ColorEnum getColour() {
        return colourEnum;
    }

    public void setColour(ColorEnum colour) {
        this.colourEnum = colour;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }
    private int generateDefaultAge(){
        Random random=new Random();
        return random.nextInt(10)+1;
    }
    public String getInfo(){
        return "Age:"+age+
                "\nColor:"+colourEnum+
                "\nShelter:"+shelter.getAddres()+
                "\nShelter name;"+shelter.getName();
    }
}
