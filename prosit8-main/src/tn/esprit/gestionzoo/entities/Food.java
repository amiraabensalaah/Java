package tn.esprit.gestionzoo.entities;

public enum Food {meat,plant,both};


class mekla{

public void whatareu(Food f){

if (f.equals(Food.meat)) {
    System.out.println("carnivore");
}
else {
    if (f.equals(Food.plant))
        System.out.println("herbivore");
}
        if (f.equals(Food.both)) {
        System.out.println("both");}
    }

}

