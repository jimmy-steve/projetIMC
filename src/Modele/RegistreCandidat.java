package Modele;

import utils.CandidatDejaPresentException;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Objects;

public class RegistreCandidat {
    //création liste de candidat
    ArrayList<Candidat> registre = new ArrayList<>();

    /**fucntion name ajouterCandidat()
     * ajouter un candidat
     * @param candidat
     */
    public void ajouterCandidat(Candidat candidat)throws CandidatDejaPresentException {

        if(validerCandidat(candidat)){
            throw new CandidatDejaPresentException("Situation grave Doublon", candidat);
        }else{
            JOptionPane. showMessageDialog(null, "Candidat ajouté avec succès  !", "Insertion", JOptionPane.ERROR_MESSAGE);

            registre.add(candidat);
        }



    }

    private boolean validerCandidat(Candidat candidat) {
        for (Candidat tmp : registre
        ){
            if (tmp.equals(candidat)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "RegistreCandidat{" +
                "registre=" + registre +
                '}';
    }

    /**
     * function names afficherCandidat()
     * pour afficher le candidat
     *
     */
    public  void afficherCandidat(){
        for (Candidat tmp : registre
             ) {
            System.out.println(tmp);
        }
    }
}
