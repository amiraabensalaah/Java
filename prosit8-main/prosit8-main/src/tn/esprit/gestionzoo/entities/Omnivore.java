package tn.esprit.gestionzoo.entities;

import interfaces.Carnivore;
import interfaces.Herbivore;

public class Omnivore <T> implements Carnivore<String>, Herbivore<String> {

    public void eatMeat(String meat) {
        System.out.println("I eat meat");
    }

    public void eatPlant(String plant) {

        System.out.println("I eat herbs");
    }

    public void eatPlantAndMeet(T food) {
        System.out.println("I eat meat and herbs");

    }
}
