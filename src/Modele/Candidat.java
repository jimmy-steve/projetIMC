package Modele;


public class Candidat {
    // création des attributs d'un candidat
    private String nom;
    private String prenom;
    private double taille;
    private double poids;
    private double imc1;

    /**
     * fonction name : Candidat
     * constructeur surchargé
     *
     * @param nom
     * @param prenom
     * @param taille
     * @param poids
     * @param imc1
     */
    public Candidat(String nom, String prenom, double taille, double poids, double imc1) {
        this.nom = nom;
        this.prenom = prenom;
        this.taille = taille;
        this.poids = poids;
        this.imc1 = 0;
    }

    public double getImc1() {
        return imc1;
    }

    public void setImc1(double imc1) {
        this.imc1 = imc1;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    /**
     * function name : calculerIMC
     * poue calculer l"imc avec différend parametre
     * @param taille
     * @param poids
     * @return
     */
    public double calculerImc(double taille, double poids) {
        double imc = poids / Math.pow(taille / 100, 2);
        return imc;
    }

    /**
     * function names : calculeRisque
     * pour calculer le risque
     *
     * @param imc
     * @return
     */
    public String calculeRisque(double imc){
        String risk =" ";
        if (imc < 18.5){
            risk = "Accru";
        }else if (imc >= 18.5 && imc <= 24.9){
            risk = "Moindre";
        }else if (imc >= 25 && imc <= 29.9){
            risk = "Accru";
        }else if (imc >= 30 && imc <= 34.9){
            risk = "Élevé";
        }else if (imc >= 35 && imc <= 39.9){
            risk = "Très Élevé";
        }else if (imc >=40){
            risk ="Extrémement Élevé";
        }
        return risk;
    }

    /**
     * refaire la methode to string
     * @return
     */
    @Override
    public String toString() {
        return "Candidat{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", taille=" + taille +
                ", poids=" + poids +
                ", imc1=" + imc1 +
                '}';
    }
}
