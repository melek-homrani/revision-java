package tn.esprit;

import tn.esprit.collections.ListPatients;
import tn.esprit.collections.SetMedecins;
import tn.esprit.data.Data;
import tn.esprit.models.Hopital;
import tn.esprit.models.Medecin;
import tn.esprit.models.Patient;


public class Main {
    public static void main(String[] args) {
        Hopital hopital = new Hopital();

        hopital.ajouterMedecin(Data.medecins.get(0));
        hopital.ajouterMedecin(Data.medecins.get(1));
        hopital.ajouterMedecin(Data.medecins.get(2));

        hopital.ajouterPatient(Data.medecins.get(0), Data.patients.get(0));
        hopital.ajouterPatient(Data.medecins.get(0), Data.patients.get(1));
        hopital.ajouterPatient(Data.medecins.get(0), Data.patients.get(2));
        hopital.ajouterPatient(Data.medecins.get(0), Data.patients.get(3));

        hopital.ajouterPatient(Data.medecins.get(1), Data.patients.get(4));
        hopital.ajouterPatient(Data.medecins.get(1), Data.patients.get(5));
        hopital.ajouterPatient(Data.medecins.get(1), Data.patients.get(6));
        hopital.ajouterPatient(Data.medecins.get(1), Data.patients.get(7));

        hopital.ajouterPatient(Data.medecins.get(2), Data.patients.get(8));
        hopital.ajouterPatient(Data.medecins.get(2), Data.patients.get(9));
        hopital.ajouterPatient(Data.medecins.get(2), Data.patients.get(10));
        hopital.ajouterPatient(Data.medecins.get(2), Data.patients.get(11));

        hopital.ajouterPatient(Data.medecins.get(3), Data.patients.get(12));
        hopital.ajouterPatient(Data.medecins.get(3), Data.patients.get(13));
        hopital.ajouterPatient(Data.medecins.get(3), Data.patients.get(14));
        hopital.ajouterPatient(Data.medecins.get(3), Data.patients.get(15));

        hopital.ajouterPatient(Data.medecins.get(4), Data.patients.get(16));
        hopital.ajouterPatient(Data.medecins.get(4), Data.patients.get(17));
        hopital.ajouterPatient(Data.medecins.get(4), Data.patients.get(18));
        hopital.ajouterPatient(Data.medecins.get(4), Data.patients.get(19));

        System.out.println("Nombre de medecins : " + hopital.medecinPatiens.size() + "\n");
        System.out.println("afficher map");
        hopital.afficherMap();
        System.out.println("\nafficher patients de medecin" + Data.medecins.get(0).getNom());
        hopital.afficherMedcinPatients(Data.medecins.get(0));


    }
}