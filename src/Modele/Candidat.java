package Modele;


import java.util.Objects;

public class Candidat {
    // création des attributs d'un candidat
    private String nom;
    private double taille;
    private double poids;
    private double imc1;

    public Candidat() {
    }

    /**
     * fonction name : Candidat
     * constructeur surchargé
     *
     * @param nom
     * @param taille
     * @param poids
     * @param imc1
     */
    public Candidat(String nom, double taille, double poids, double imc1) {
        this.nom = nom;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Candidat)) return false;
        Candidat candidat = (Candidat) o;
        return Double.compare(candidat.getTaille(), getTaille()) == 0 && Double.compare(candidat.getPoids(), getPoids()) == 0 && Double.compare(candidat.getImc1(), getImc1()) == 0 && Objects.equals(getNom(), candidat.getNom());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNom(), getTaille(), getPoids(), getImc1());
    }

    /**
     * refaire la methode to string
     * @return
     */
    @Override
    public String toString() {
        return "Candidat{" +
                "nom='" + nom + '\'' +
                ", taille=" + taille +
                ", poids=" + poids +
                ", imc1=" + imc1 +
                '}';
    }
}
