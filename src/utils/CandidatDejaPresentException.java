package utils;

import Modele.Candidat;

public class CandidatDejaPresentException extends Exception{
    private Candidat candidat;

    public CandidatDejaPresentException(String message, Candidat candidat){
        super(message);
        this.candidat = candidat;
    }

    public Candidat getCandidat() {
        return candidat;
    }

    public void setCandidat(Candidat candidat) {
        this.candidat = candidat;
    }
}
