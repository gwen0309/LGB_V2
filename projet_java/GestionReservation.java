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
    public Vol saisirVol(String numvol, String jd, String md, String ad, String ja,String ma,String aa, String heured, String heurea, String prix1, String prix2, String nc1, String nc2, String aorigine, String adestination){
        Vol v;
        Aeroport a1, a2;
        Date ddepart, darrivee;
        Date hdepart = null, harrivee = null;
        
        DateFormat df= new SimpleDateFormat("h:mm a");
        
        ddepart = new Date(Integer.parseInt(ad)-1900,Integer.parseInt(md)-1,Integer.parseInt(jd));
        try{ // do while en  test try catch pour l'interface grpahique
            hdepart = df.parse(heured); // Transformation de la string heured en date hdepart selon le format
        } catch(ParseException e){
            System.out.println("L'heure n'est pas au bon format ! Recommencez!");
        }
        
        darrivee = new Date(Integer.parseInt(aa)-1900,Integer.parseInt(ma)-1,Integer.parseInt(ja));
        try{ // do while en  test try catch pour l'interface grpahique
            harrivee = df.parse(heurea); // Transformation de la string heured en date hdepart selon le format
        } catch(ParseException e){
            System.out.println("L'heure n'est pas au bon format ! Recommencez!");
        }
        
        // Test sur la date
        if (ddepart.compareTo(darrivee ) > 0) {   // traitement du cas ddepart > darrivee  // alert : erreur darrivee < ddepart resaisir la date arriver
                System.out.println("Erreur ! Votre date d'arrivée est antérieur à la date de départ");
            }else if (ddepart.compareTo(darrivee ) == 0) { // Cas hdépart = harrivee // Resaisir l'heure arrivee
                if (hdepart.compareTo(harrivee) > 0){ // cas harriver antérieur a hdepart --> resaisir heure et re-test
                    System.out.println("Ereur ! Heure arrivée est antérieur à l'heure départ");
                }else if(hdepart.compareTo(harrivee) == 0){ // cas de l'heure départ et heure arrivéé identique
                    System.out.println("Erreur ! Heure arrivée est égale à l'heure départ");               
                }
            }   
        
        a1 = rechercherAeroport();
        if(a1 == null){
            System.out.println("Aeroport Origine non trouver, merci de  saisir les données de l'aeroport");
            a1 = saisirAeroport();
        }
        
        a2 = rechercherAeroport();
        if(a2 == null){
            System.out.println("Aeroport Destination non trouver, merci de  saisir les données de l'aeroport");
            a2 = saisirAeroport();
        }
        
        
        v = new Vol(numvol, ddepart, hdepart, darrivee, harrivee, Double.parseDouble(prix1), Integer.parseInt(nc1), Double.parseDouble(prix2), Integer.parseInt(nc2), a1, a2);
        tabVol.add(v);
        System.out.println(tabVol.size());
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
                    System.out.println("Login déjà utilisé, veuillez choisir un autre login.");
                    //AjouterClient(); 
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
    public Aeroport saisirAeroport(){
        Aeroport a;
        String num;
        String nom;       
        String addr;
        String tel;
        
        a=rechercherAeroport();
        if(a == null){
            System.out.println("Aeroport non trouver ! ");
            System.out.println("Saisir le numéro de l'aeroport");
            num= Clavier.lireString();

            System.out.println("Saisir le nom de l'aeroport");
            nom = Clavier.lireString();

            System.out.println("Saisir le telephone de l'aeroport");
            tel = Clavier.lireString();

            System.out.println("Saisir l'adresse de l'aeroport");
            addr = Clavier.lireString();

            a = new Aeroport(num,nom,addr, tel);
            listeaeroport.add(a);
            System.out.println("Aeroport créer ! ");
        }else{
                System.out.println("Aeroport existant !");        
        }
        return a;
    }

    public Aeroport rechercherAeroport(){ // Article car renvoi un objet de type article
        Aeroport a, trouve = null; // ou Article trouve = null;
        String num;
        int i = 0;
        
        System.out.println("Numéro de l'aeroport à rechercher: ");
        num = Clavier.lireString();
        
        if(!listeaeroport.isEmpty()){
            while(i<listeaeroport.size() && trouve == null){
                a=listeaeroport.get(i); // recupère le contenu du constructeur du ième élement
                if(a.getNumeroAeroport().equalsIgnoreCase(num)){
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

    public Vol SaisirVol(String numvol, String jd, String md, String ad, String ja, String ma, String aa, String heured, String heurea, String prix1, String prix2, String nc1, String nc2, String aorigine, String adestination) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
