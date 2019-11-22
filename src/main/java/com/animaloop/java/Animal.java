package com.animaloop.java;

public class Animal {

    private String name;
    public void sounds(){
        System.out.println("sound test");
    }
    public void eat() {
        System.out.println(name + " Eats");
    }
    public String getName(){
        return name;
    }
    public void setName(String name2){
        this.name = name2;
    }
}