package fr.tanou.init.testspring.model;

public class Monstre {

    private String nom;
    private int hp = 100;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int infligerDegats() {
        if (Math.random() < 0.1) {
            return 30;
        }
        return (int) (Math.random() * 10) + 5;
    }
}
