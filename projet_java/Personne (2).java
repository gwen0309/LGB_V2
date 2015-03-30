/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionreservation;

/**
 *
 * @author gwen0309
 */
public class Personne {
    
    private String nom;
    private String prenom;
    private String numrue;
    private String nomrue;
    private String ville;
    private String codepostal;
    private String telephone;

    
    //Constructeur
    public Personne(String nomPers, String prenomPers, String rue, String cp, String v, String tel){
        nom = nomPers;
        prenom = prenomPers;
        numrue = rue;
        codepostal = cp; 
        ville = v; 
        telephone = tel;
    }

    // GET
    public String getNom(){
        return nom;
    }
    
    public String getPrenom(){
        return prenom;
    }
    

    public String getTelephone() {
        return telephone;
    }
    
    // SET
    
    public void setNom(String n){
        this.nom = n;
    }
    
    public void setPrenom(String p){
        this.prenom = p;
    }
  
    public void setTelephone(String tel) {
        this.telephone = tel;
    }

    public String getNumrue() {
        return numrue;
    }

    public void setNumrue(String numrue) {
        this.numrue = numrue;
    }

    public String getNomrue() {
        return nomrue;
    }

    public void setNomrue(String nomrue) {
        this.nomrue = nomrue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodepostal() {
        return codepostal;
    }

    public void setCodepostal(String codepostal) {
        this.codepostal = codepostal;
    }
     
     
}
