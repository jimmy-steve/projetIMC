package Modele;

import java.util.ArrayList;

public class RegistreCandidat {
    //création liste de candidat
    ArrayList<Candidat> registre = new ArrayList<>();

    /**fucntion name ajouterCandidat()
     * ajouter un candidat
     * @param candidat
     */
    public void ajouterCandidat(Candidat candidat){
            registre.add(candidat);

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
