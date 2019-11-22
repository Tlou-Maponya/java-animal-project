package com.animaloop.java;
import java.util.*;
public class Home{
    ArrayList<Animal> pets = new ArrayList<Animal>();
    public void adoptPet(Animal pet){
        pets.add(pet);
    }
    public void makeAllSounds(){
        for(Animal a: pets){
            a.sounds();
        }
    }
}