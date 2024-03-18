package fr.tanou.init.testspring.armes;

import fr.tanou.init.testspring.model.Arme;
import fr.tanou.init.testspring.model.Potion;

public class HealingPotion implements Potion {

    @Override
    public int utiliser() {
        if (Math.random() < 0.2) {
            System.out.println("La potion a soigné 50 points de vie!");
            return 50;
        } else {
            System.out.println("La potion a soigné 20 points de vie!");
            return 20;
        }
    }
}
