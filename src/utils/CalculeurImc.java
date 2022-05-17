package utils;

import Modele.Candidat;

public class CalculeurImc {
    public static double calculerImc(Candidat candidat) {

        return Math.round(candidat.getPoids() / Math.pow(candidat.getTaille() / 100, 2)  *100.0)/100.0;
    }

    public static String calculeRisque(double imc) {
        String risk = " ";
        if (imc < 18.5) {
            risk = "Accru";
        } else if (imc >= 18.5 && imc <= 24.9) {
            risk = "Moindre";
        } else if (imc >= 25 && imc <= 29.9) {
            risk = "Accru";
        } else if (imc >= 30 && imc <= 34.9) {
            risk = "Élevé";
        } else if (imc >= 35 && imc <= 39.9) {
            risk = "Très Élevé";
        } else if (imc >= 40) {
            risk = "Extrémement Élevé";
        }
        return risk;
    }


}





