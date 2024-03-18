package fr.tanou.init.testspring.armes;

import fr.tanou.init.testspring.model.Arme;

public class Baguette implements Arme {

        public void utiliser() {
            System.out.println("Vous lancez un sort !");
        }

        public int infligerDegats() {
            if (Math.random() < 0.1) {
                return 30;
            }

            return (int) (Math.random() * 10) + 5;
        }

}
