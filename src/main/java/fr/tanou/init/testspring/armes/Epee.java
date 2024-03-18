package fr.tanou.init.testspring.armes;

import fr.tanou.init.testspring.model.Arme;

public class Epee implements Arme {

    public void utiliser() {
        System.out.println("Attaque à l'épée !");
    }

    public int infligerDegats() {
        if (Math.random() < 0.1) {
            return 30;
        }

        return (int) (Math.random() * 10) + 5;
    }

}
