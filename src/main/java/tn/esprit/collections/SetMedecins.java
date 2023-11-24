package tn.esprit.collections;

import tn.esprit.models.Medecin;

import java.util.*;

public class SetMedecins {
    private Set<Medecin> setM;
    public SetMedecins(){
        /*à completer(14) (1 point)*/
        this.setM = new HashSet<>();
    }
    public void ajouterMedecin(Medecin m) {
        /*à completer(15) (0.5 point)*/
        this.setM.add(m);

    }
    /* Avec l’api Stream */
    public boolean rechercherMedecin(int cin) {
        /*à completer(16) (1 point)*/
        return this.setM.stream().anyMatch(medecin -> medecin.getCin() == cin);
    }
    /* Avec l’api Stream */
    public void afficherMedecins() {
        /*à completer(17) } (1 point)*/
        this.setM.forEach(System.out::println);
    }
    /* Avec l’api Stream */
    public long nombreMedecins(){
        /*à completer*/
        return this.setM.stream().count();
    }
    /* Avec l’api Stream */
    public TreeSet<Medecin> trierMedecins(){
        /*à completer*/
        return new TreeSet<>(this.setM);
    }
}
