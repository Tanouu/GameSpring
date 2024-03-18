package fr.tanou.init.testspring;

import fr.tanou.init.testspring.model.Joueur;
import fr.tanou.init.testspring.model.Monstre;
import fr.tanou.init.testspring.service.JeuService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class TestspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestspringApplication.class, args);
		JeuService jeuService = new JeuService();


		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez votre nom:");
		String nom = scanner.nextLine();
		System.out.println("Choisissez votre classe (Archer/Combattant/Mage):");
		String classe = scanner.nextLine();

		Joueur joueur = jeuService.creerJoueur(nom, classe);
		Monstre monstre = new Monstre();

		jeuService.combattre(joueur, monstre);

	}

}
