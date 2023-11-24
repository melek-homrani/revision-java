package tn.esprit.models;

import tn.esprit.collections.ListPatients;

import java.util.*;

public class Hopital {
    public Map<Medecin, ListPatients> medecinPatiens;

    public Hopital() {
        /*à completer (18) (0.5 point)*/
        this.medecinPatiens = new TreeMap<>(Comparator.comparing(Medecin::getNom));
    }

    public void ajouterMedecin(Medecin m) {
        /*à completer (19) (0.5 point)*/
        this.medecinPatiens.put(m, new ListPatients());
    }

    public void ajouterPatient(Medecin m, Patient p) {
        if (medecinPatiens.containsKey(m)) {
            /*à completer (20) (1 point)*/
            medecinPatiens.get(m).ajouterPatient(p);
        } else {
            /*à completer(21) (1 point) */
            ajouterMedecin(m);
        }
    }

    /*Avec l'api stream */
    public void afficherMap() {
        /*à completer*/
        medecinPatiens.forEach((medecin, patients) -> {
            System.out.println(medecin);
//            patients.afficherPatients();
        });
    }

    /* Afficher les patients d’un medecin dont le nom est &quot;mohamed&quot; */
    public void afficherMedcinPatients(Medecin m) {
        /*à completer*/
        medecinPatiens.forEach((medecin, patients) -> {
            if (medecin.getNom().equals("mohamed")) {
                patients.afficherPatients();
            }
        });
    }
}