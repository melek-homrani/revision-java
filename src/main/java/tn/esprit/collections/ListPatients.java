package tn.esprit.collections;

import tn.esprit.interfaces.InterfacePatient;
import tn.esprit.models.Patient;

import java.util.*;

public class ListPatients implements InterfacePatient {
    /*à completer (3)  (0.5 point)*/
    private List<Patient> listP;

    public ListPatients() {
        this.listP = new ArrayList<Patient>();
    }

    public void ajouterPatient(Patient p) {
        if (p != null)
            if (!listP.contains(p))
                listP.add(p);
    }

    public void supprimerPatient(Patient p) {
        if (p != null)
            listP.remove(p);
    }

    /* Avec l’api Stream */
    public boolean rechercherPatient(Patient p) {
        return listP.stream().anyMatch(e-> e.equals(p));
    }

    /* Avec l’api Stream */
    public boolean rechercherPatient(int cin) {
        /*à completer (8) } (1 point)*/
        return listP.stream().anyMatch(p -> p.getCin() == cin);
    }
    /* Avec l’api Stream */

    public void afficherPatients() {
        listP.stream().forEach(System.out::println);
    }

    /* Avec l’api Stream */
    public void trierPatientsParNom() {
        /*à completer (10) (1 point)*/
        listP = listP.stream().sorted(Comparator.comparing(Patient::getNom)).toList();
    }

    /* Avec l api stream */
    public void PatientSansRedondance() {
        /*à completer : Afficher la liste des patients sans redondance*/
        listP.stream().distinct().forEach(System.out::println);
    }
}