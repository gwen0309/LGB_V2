/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_java;

import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 *
 * @author gwen0309
 */
public class GestionReservation {

    
//-------------- Attributs --------------//
    private ArrayList<Reservation> tabResa; 
    private ArrayList<Vol> tabVol; 
    private ArrayList<Vol> listevol;
    private ArrayList<Aeroport> listeaeroport;
    private ArrayList<Client> tabClient;
   
//-------------- Constructeur --------------//    
    public GestionReservation()
    {
        //Initialisation des tableaux 
        tabResa = new ArrayList(); 
        tabVol = new ArrayList(); 
        listevol = new ArrayList(); 
        listeaeroport = new ArrayList();
        tabClient = new ArrayList();
    }
    
    
/********************************************/ 
/*              RESERVATION                 */
/********************************************/       

    
    public void AjouterReservation()
    {
        Vol v; 
        Reservation r; 
        String c, num_v; 
        Date date_resa; 
        int nb, a, j, m; 
        double ac, p; 
        
        System.out.println("Saisir date de réservation: ");
        System.out.println("Saisir l'année: ");
        a = Clavier.lireInt();
        System.out.println("Saisir le mois: ");
        m = Clavier.lireInt();
        System.out.println("Saisir le jour: ");
        j = Clavier.lireInt(); 
        date_resa = new Date(a-1900,m-1,j);
        
        System.out.println("Saisir une classe (économique, affaire ou première): ");
        c = Clavier.lireString(); 
        System.out.println("Saisir le nombre de passager: ");
        nb = Clavier.lireInt(); 
        System.out.println("Saisir l'acccompte versé: ");
        ac = Clavier.lireDouble(); 
        System.out.println("Saisir le paiement (insérer 0): ");
        p = Clavier.lireDouble(); 
       
        System.out.println("Saisir un numéro de vol: ");
        num_v = Clavier.lireString();
        v= rechercherVol(num_v); 
        
        r = new Reservation(date_resa, c, nb, p, p, v); 
        tabResa.add(r); 
        
    }
    
    public void supprimerReservation()
    {
        Reservation resa; 
        
        System.out.println("Rechercher la réservation à supprimer: ");
        resa = rechercherReservation(); 
        if (resa!=null) // && si il y a une contrainte 
        {
          tabResa.remove(resa); 
        }
        
    }
    
    public Reservation rechercherReservation()
    {
        Reservation resa, trouve = null; 
        int i=0; 
        int num_r; 

        System.out.println("Entrer le numéro de la reservation à rechercher: ");
        num_r = Clavier.lireInt(); 
        
        if(!tabResa.isEmpty())
        {
            while(i<tabResa.size()&& trouve==null)
            {
                resa = tabResa.get(i); 
                
                if(resa.getNumReservation() ==  num_r)
                {
                    trouve = resa; 
                }
                i++;
            } 
        }
         return trouve;
    }
    
    public void modifierReservation()
    { 
        Reservation resa;
        Vol v; 
        int r, num_p; 
        String choix, choix2,choix3; 
        
        resa = rechercherReservation();
        if (resa==null)
        {
            System.out.println("Réservation innexistante");
        }
        else 
        {
            System.out.println("Voulez-vous modifier le nombre de place ? (y/n)");
            choix = Clavier.lireString(); 
            if (choix=="y")
            {
                System.out.println("Entrez le nombre de place: ");
                num_p = Clavier.lireInt(); 
                resa.setNombrePlace(num_p);
            }
            
            System.out.println("Voulez vous supprimer un vol ?(y/n)");
            choix2 = Clavier.lireString(); 
            if (choix2=="y")
            {
                tabVol.remove(resa);
                System.out.println("Vol supprimer.");
            }
            System.out.println("Voulez vous ajouter un nouveau vol ?(y/n)");    
            choix3 = Clavier.lireString();
            if (choix3=="y")
            {
                
                
                
            }
        }
    }
    
    public void ajoutMontant() // A une réservation
    {
        Reservation resa; 
        double mont; 
            
        System.out.println("Reservation pour laquelle vous voulez ajouter un montant: ");
        resa = rechercherReservation(); 
        if (resa==null)
        {
            System.out.println("Reservation inexistante");
        }
        else
        {
            System.out.println("Saisir montant payé");
            mont = Clavier.lireDouble(); 
            resa.setPaiement(mont); 
        }
    }
    
/********************************************/ 
/*                  VOLS                    */
/********************************************/
    
    public Vol SaisirVol(String numvol, Date ddepart, Date hdepart, Date darrivee, Date harrivee, double prix1, int nc1, double prix2, int nc2, Aeroport a1, Aeroport a2) 
    {
        Vol v = new Vol(numvol, ddepart, hdepart, darrivee, harrivee, prix1, nc1, prix2, nc2, a1, a2);
        tabVol.add(v);
        return v; 
    }
    
    public Vol rechercherVol(String num_v)
    {
        Vol v, trouve = null; 
        int i=0; 

        if(!tabVol.isEmpty())
        {
            while(i<tabVol.size()&& trouve==null)
            {
                v = tabVol.get(i); 
                
                if(v.getNumeroVol().equalsIgnoreCase(num_v))
                {
                    trouve = v; 
                }
                i++;
            } 
        }
         return trouve;
    }
    
    public void afficherVols(){
        int i;
        
        if(!listevol.isEmpty()){
            for(i=0; i<listevol.size(); i++){
                System.out.println("-------");
                System.out.println(listevol.get(i).getNumeroVol());
                System.out.println(listevol.get(i).getAeroportOrigine().getNomAeroport());
                System.out.println(listevol.get(i).getAeroportDestination().getNomAeroport());
                System.out.println(listevol.get(i).getDateDepart());
                System.out.println(listevol.get(i).getHeureDepart());
                System.out.println(listevol.get(i).getDateArrivee());
                System.out.println(listevol.get(i).getHeureArrivee());
            }
        }
    }
    
    
     
/********************************************/ 
/*                 CLIENT                   */
/********************************************/
    /*
    public void AjouterClient()
    {
        Client c;  
        String log_c, mdp_c, nom_c, prenom_c, add_c, tel_c; 
        int nb = 0; 
        
        System.out.println("Entrez un login: ");
        log_c = Clavier.lireString();
        
        c=RechercherClient(log_c); 
        
        System.out.println("Entrez un mot de passe: ");
        mdp_c = Clavier.lireString();
        System.out.println("Entrez votre nom: ");
        nom_c = Clavier.lireString();
        System.out.println("Entrez votre prénom: ");
        prenom_c = Clavier.lireString();
        System.out.println("Entrez votre adresse: ");
        add_c = Clavier.lireString();
        System.out.println("Entrez votre numéros de téléphone: ");
        tel_c = Clavier.lireString();
        c = new Client (nom_c, prenom_c, add_c, tel_c, log_c, mdp_c); 
        tabClient.add(c); 
        
        System.out.println("Le client a été créé !");
    }*/

    public Client AjouterClient(String nom, String prenom, String rue, String cp, String v, String tel, String log, String mdp, String mail) {
        Client cli;
        cli = new Client(nom, prenom, rue, cp, v, tel, log, mdp, mail);
        tabClient.add(cli);
        System.out.println(tabClient.size());
        return cli;
    }
    
    public Client RechercherClient(String log_c)
    {
        Client client, trouve = null; 
        
        int i=0; 
        
        if(!tabClient.isEmpty())
            
            while(i<tabClient.size()&& trouve==null)
            {
                client = tabClient.get(i); 
                if (client.getLogin().equalsIgnoreCase(log_c))
                {
                    trouve = client; 
                }
                i++; 
            }
        return trouve;
    }
    
    public ArrayList<Client> ListeClient()
    {
        ArrayList<Client> listeclient;
        listeclient = new ArrayList();
        if (!tabClient.isEmpty()){
            for (int i = 0; i<tabClient.size();i++)
            {
               
                    listeclient.add(tabClient.get(i));
                }
                
            }
        return listeclient;
    }
    
    
/********************************************/ 
/*                AEROPORT                  */
/********************************************/
    public Aeroport saisirAeroport(String numa, String noma, String tela, String adda){
        //throw new UnsupportedOperationException("Not supported yet.");
        Aeroport a;
        String num;
        String nom;       
        String addr;
        String tel;

        a=rechercherAeroport(numa);
        if(a == null){
            a = new Aeroport(numa,noma,tela, adda);
            listeaeroport.add(a);
        }else{
                System.out.println("Aeroport existant !");        
        }
        return a;

    }

    public Aeroport rechercherAeroport(String numaeroport){ // Article car renvoi un objet de type article
        Aeroport a, trouve = null; // ou Article trouve = null;
        int i = 0;
                
        if(!listeaeroport.isEmpty()){
            while(i<listeaeroport.size() && trouve == null){
                a=listeaeroport.get(i); // recupère le contenu du constructeur du ième élement
                if(a.getNumeroAeroport().equalsIgnoreCase(numaeroport)){
                    trouve = a;
                }
                i++;
            }
        }
        return trouve;
    }
    
    public void listerAeroports(){
        int i;
        
        if(!listeaeroport.isEmpty()){
            for(i=0; i<listeaeroport.size(); i++){
                System.out.println("-------");
                System.out.println(listeaeroport.get(i).getNumeroAeroport());
                System.out.println(listeaeroport.get(i).getNomAeroport());
                System.out.println(listeaeroport.get(i).getAdresse());
                System.out.println(listeaeroport.get(i).getTelephone());
                
            }
        }
    }        

    

    

   

    
}
