package fr.tanou.init.testspring.service;

import fr.tanou.init.testspring.armes.Arc;
import fr.tanou.init.testspring.armes.Baguette;
import fr.tanou.init.testspring.armes.Epee;
import fr.tanou.init.testspring.model.Joueur;
import fr.tanou.init.testspring.model.Monstre;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class JeuService {

    public Joueur creerJoueur(String nom, String classe) {
        Joueur joueur = new Joueur();
        joueur.setNom(nom);
        joueur.setClasse(classe);
        switch (classe) {
            case "combattant":
                System.out.println("Vous avez choisi la classe combattant, vous avez donc une épée.");
                joueur.setArme(new Epee());
                break;
            case "archer":
                System.out.println("Vous avez choisi la classe archer, vous avez donc un arc.");
                joueur.setArme(new Arc());
                break;
            case "mage":
                System.out.println("Vous avez choisi la classe mage, vous avez donc une baguette.");
                joueur.setArme(new Baguette());
                break;
    }
        return joueur;
    }

    public void combattre(Joueur joueur, Monstre monstre) {
        System.out.println("Le combat commence !");
        Scanner scanner = new Scanner(System.in);
        while (joueur.getHp() > 0 && monstre.getHp() > 0) {
            System.out.println("Appuyez sur 'a' pour attaquer");
            String input = scanner.nextLine();
            if ("a".equals(input)) {
                int degats = joueur.getArme().infligerDegats();
                joueur.getArme().utiliser();
                System.out.println("Vous attaquez le monstre et infligez " + degats + " dégâts.");
                monstre.setHp(monstre.getHp() - degats);

                if (monstre.getHp() > 0) {
                    int degatsMonstre = monstre.infligerDegats();
                    joueur.setHp(joueur.getHp() - degatsMonstre);
                    System.out.println("Le monstre riposte et vous inflige " + degatsMonstre + " dégâts.");
                }

                System.out.println("Vos HP: " + joueur.getHp());
                System.out.println("HP du monstre: " + monstre.getHp());
            }

            if (joueur.getHp() <= 0) {
                System.out.println("Vous avez été vaincu...");
                break;
            } else if (monstre.getHp() <= 0) {
                System.out.println("Vous avez vaincu le monstre !");
                break;
            }
        }
    }
}
