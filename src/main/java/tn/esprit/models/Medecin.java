package tn.esprit.models;

import java.util.Objects;

public class Medecin {
    private int cin;
    private String nom;
    private String prenom;
    private int numOrdre;

    public Medecin(int cin, String nom, String prenom, int numOrdre) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.numOrdre = numOrdre;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumOrdre() {
        return numOrdre;
    }

    public String toString() {
        /*à completer (11) (1 point) */
        return "Medecin {cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + ", numOrdre=" + numOrdre + "}";
    }

    public boolean equals(Object obj) {
        /*à completer (12) (1 point)*/
        if (obj == null) return false;
        if (obj == this) return true;
        if (!(obj instanceof Medecin medecin)) return false;
        return medecin.cin == this.cin;
    }

        /*à completer (13)indication le HasdhSet n’accepte pas les doublons
        (1point)*/
    @Override
    public int hashCode() {
        return Objects.hash(cin, numOrdre);
    }
}