package com.company;

public class Ville {

    private String nomVille; //Protéger les variables d'instance avec un private
    private String nomPays;
    private int nombreHabitants;

    public Ville(){ //Constructeur par défaut
        System.out.println("Création d'une ville !");

        nomVille = "Inconnu";
        nomPays = "Inconnu";
        nombreHabitants = 0;

    }

    //*************   ACCESSEURS ************* Acceder aux variable en lecture

    public String getNomVille(){
        return nomVille;
    }

    public String getNomPays(){
        return nomPays;
    }

    public int getNombreHabitants(){
        return nombreHabitants;
    }

    //***************************************

    //*************   MUTATEURS   ************* Permet d'attribuer une valeur aux variable "indirectement"

    public void setNomVille(String lNomVille){
        nomVille = lNomVille;
    }

    public void setNomPays(String lNomPays){
        nomPays = lNomPays;
    }

    public void setNombreHabitants(int lNombreHabitants){
        nombreHabitants = lNombreHabitants;
    }
    //*****************************************
    public Ville(String lNomVille, int lNombreHabitants, String lNomPays){
        System.out.println("Création d'une ville avec paramètres!");

        nomVille = lNomVille;
        nomPays = lNomPays;
        nombreHabitants = lNombreHabitants;

    }

    public void AfficherVille(){
        System.out.println(nomVille +nomPays + nombreHabitants);
    }
}
