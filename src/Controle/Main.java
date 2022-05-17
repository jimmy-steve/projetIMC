package Controle;

import Modele.Candidat;
import Modele.RegistreCandidat;
import ui.GuiMedium;
import utils.Utilitaire;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
//création des variables
//        boolean ok = false;








        GuiMedium fenetre = new GuiMedium();
        fenetre.setSize(400,400);
        fenetre.setTitle("Calculateur d'indice de masse corporel");
        fenetre.setVisible(true);
        fenetre.setLocationRelativeTo(null);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setResizable(false);





//création des candidat pour la question à la dure

//        Candidat cand1 = new Candidat("Flouflou", "Alain", 170, 92, 0);
//        registre.ajouterCandidat(cand1);
//        registre.afficherCandidat();
//
//        System.out.println("-------------------------------traitement imc -----------");
//        cand1.setImc1(cand1.calculerImc(cand1.getTaille(), cand1.getPoids()));
//        System.out.println("Vous avez un IMC de : " + cand1.getImc1());
//        System.out.println("Risque de Développer des problèmes de santé : "
//                + cand1.calculeRisque(cand1.calculerImc(cand1.getTaille(), cand1.getPoids())));
//
//        registre.afficherCandidat();




        //création du candidate pour la question avec le scanner

//        Candidat cand2;
//        while (!ok) {
//            String nom = Utilitaire.saisirChaine("SVP Saisir nom : ");
//            String prenom = Utilitaire.saisirChaine("SVP Saisir prénom : ");
//            double taille = Utilitaire.saisirDouble("SVP Saisir votre taille en cm : ",
//                    "SVP Saisir un nombre réel en cm");
//            double poids = Utilitaire.saisirDouble("SVP Saisir le poids en kg : ",
//                    "Enter un nombre réel en kg ");
//
//            cand2 = new Candidat(nom, prenom, taille, poids, 0 );
//
//            registre.ajouterCandidat(cand2);
//
////TODO : faire un test
//            System.out.println("------------------Traitement imc------------");
//            //on ARRONDIS et assigne à une variable l'imc
//            double imcArrondis = Math.round(cand2.calculerImc(cand2.getTaille(), cand2.getPoids())*100.0)/100.0;
//            cand2.setImc1(imcArrondis);//set imc du candidat
//            System.out.println("Vous avez un IMC de : " + imcArrondis);
//
//            System.out.println("------------------------------");
//            System.out.println("Risque de Développer des problèmes de santé : "
//                    + cand2.calculeRisque(cand2.calculerImc(cand2.getTaille(), cand2.getPoids())));
//            System.out.println("------------------------------");
//
//
//            int rep = Utilitaire.saisirEntier("Faite 1 pour Saisir un nouveau candidat, 2 Pour lister les candidats 3. Pour quitter",
//                    "SVP saisir un nombre Entier");
//            if (rep == 3) {
//                System.out.println("Merci et à la prochaine");
//                ok = true;
//            }else if (rep == 2){
//                registre.afficherCandidat();
//                System.out.println("Merci et à la prochaine");
//                ok = true;
//            }
//        }








    }
}