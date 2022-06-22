package fr.afpa.module8.tp8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jeu jeu = new Jeu();
        jeu.menu();
        int saisie = scanner.nextInt();
        Choix choixUtilisateur = null;
        if (saisie == 0) {
            choixUtilisateur = Choix.PIERRE;
        }
        if (saisie == 1) {
            choixUtilisateur = Choix.FEUILLE;
        }
        if (saisie == 2) {
            choixUtilisateur = Choix.CISEAU;
        }
        Choix choixOrdinateur = jeu.choixIA();
        jeu.quiGagne(choixUtilisateur, choixOrdinateur);
        jeu.afficherLesScores();
        scanner.close();
    }
}
