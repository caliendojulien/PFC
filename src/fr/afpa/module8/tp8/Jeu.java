package fr.afpa.module8.tp8;

import java.util.Random;

public class Jeu {

    private int scoreUtilisateur = 0;
    private int scoreOrdinateur = 0;

    public void menu() {
        System.out.println("0 - Pierre");
        System.out.println("1 - Feuille");
        System.out.println("2 - Ciseau");
    }
    public Choix choixIA() {
        // double borne1 = 0.33;
        // double borne2 = 0.66;
        Random random = new Random();
        int hasard = random.nextInt(3);
        // double hasard = Math.random();
        Choix choixIA = null;
        if (hasard == 0) {
        // if (hasard < borne1) {
            choixIA = Choix.PIERRE;
        }
        if (hasard == 1) {
        // if (hasard > borne1 && hasard < borne2) {
            choixIA = Choix.FEUILLE;
        }
        if (hasard == 2) {
            choixIA = Choix.CISEAU;
        }
        return choixIA;
    }

    public void quiGagne(Choix choixUtilisateur, Choix choixOrdinateur) {
        if (choixOrdinateur == choixUtilisateur) {
            System.out.println("Egalité");
        }
        if (choixOrdinateur == Choix.CISEAU && choixUtilisateur == Choix.FEUILLE) {
            this.scoreOrdinateur = this.scoreOrdinateur + 1;
        }
    }

    public void afficherLesScores() {
        System.out.println("Joueur : " + this.scoreUtilisateur);
        System.out.println("Ordinateur : " + this.scoreOrdinateur);
    }
}
