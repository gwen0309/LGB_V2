/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import projet_java.Aeroport;
import projet_java.GestionReservation;
import projet_java.Vol;

/**
 *
 * @author gwen0309
 */
public class creervol extends javax.swing.JFrame {
    private GestionReservation gr;
    private ArrayList<Vol> vols;
    /**
     * Creates new form creervol
     */
    public creervol(GestionReservation grv) {
        initComponents();
    }

    creervol() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        novol = new javax.swing.JTextField();
        pc1 = new javax.swing.JTextField();
        hd = new javax.swing.JTextField();
        ha = new javax.swing.JTextField();
        pc2 = new javax.swing.JTextField();
        aeroo = new javax.swing.JTextField();
        nbc1 = new javax.swing.JTextField();
        nbc2 = new javax.swing.JTextField();
        aerod = new javax.swing.JTextField();
        anneed = new javax.swing.JTextField();
        moisd = new javax.swing.JTextField();
        jourd = new javax.swing.JTextField();
        joura = new javax.swing.JTextField();
        moisa = new javax.swing.JTextField();
        anneea = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel2.setText("Merci de saisir les renseignements suivants :");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel3.setText("N° de vol:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel4.setText("Date de départ :");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel5.setText("Heure de départ  : ");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel6.setText("Heure d'arrivée : ");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel7.setText("Date d'arrivée :");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel8.setText("Prix 1ère Classe :");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel9.setText("Prix 2ème Classe :");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel10.setText("Nombre de place 1ère Classe :");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel11.setText("Nombre de place 2ème Classe :");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel12.setText("Aéroport d'origine : ");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel13.setText("Aéroport de destination : ");

        pc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pc1ActionPerformed(evt);
            }
        });

        hd.setText("HH:MM AM");
        hd.setToolTipText("");
        hd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hdActionPerformed(evt);
            }
        });

        ha.setText("HH:MM AM");

        anneed.setText("AAAA");
        anneed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anneedActionPerformed(evt);
            }
        });

        moisd.setText("MM");
        moisd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moisdActionPerformed(evt);
            }
        });

        jourd.setText("JJ");
        jourd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jourdActionPerformed(evt);
            }
        });

        joura.setText("JJ");
        joura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jouraActionPerformed(evt);
            }
        });

        moisa.setText("MM");

        anneea.setText("AAAA");
        anneea.setToolTipText("");

        submit.setText("Soumettre");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        close.setText("Fermer");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                        .addGap(251, 251, 251))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(novol, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(pc2, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                        .addComponent(pc1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jourd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(moisd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(joura, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(moisa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(anneed, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(anneea, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(aeroo))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGap(74, 74, 74)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel5)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(hd, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel6)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(ha, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel11)
                                                            .addComponent(jLabel10))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(nbc1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(nbc2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(70, 70, 70)
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(aerod, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submit)
                .addGap(18, 18, 18)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(novol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jourd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moisd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anneed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(hd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(joura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anneea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(ha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(pc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nbc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(pc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nbc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(aeroo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(aerod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit)
                    .addComponent(close))
                .addContainerGap())
        );

        ha.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("Création d'un vol");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jourdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jourdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jourdActionPerformed

    private void moisdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moisdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moisdActionPerformed

    private void hdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hdActionPerformed

    private void anneedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anneedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anneedActionPerformed

    private void jouraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jouraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jouraActionPerformed

    private void pc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pc1ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        String numvol = novol.getText();
        String jd = jourd.getText();
        String md = moisd.getText();
        String ad = anneed.getText();
        String ja = joura.getText();
        String ma = moisa.getText();
        String aa = anneea.getText();
        String heured = hd.getText();
        String heurea = ha.getText();
        String prix1 = pc1.getText();
        String prix2 = pc2.getText();
        String nc1 = nbc1.getText();
        String nc2 = nbc2.getText();
        String aorigine = aeroo.getText();
        String adestination = aerod.getText();
        Aeroport a1, a2;
        Date ddepart, darrivee, hdepart, harrivee;
        Vol v;
        
        if (numvol.length() ==0 || jd.length() ==0 || md.length() ==0 || ad.length() ==0 || ja.length() ==0 ||
                ma.length() ==0 || aa.length() ==0 ||heured.length() ==0 || heurea.length() ==0 ||
                prix1.length() ==0 || prix2.length() ==0 || nc1.length() ==0 || nc2.length() ==0 ||
                aorigine.length() ==0 || adestination.length() ==0)
	{
		JOptionPane.showMessageDialog(null, "Tous les champs ne sont pas remplis ! " );
		return;
	}	
        
        // Verification de l'heure et de la date
        
        DateFormat df= new SimpleDateFormat("h:mm a");
        
        ddepart = new Date(Integer.parseInt(ad)-1900,Integer.parseInt(md)-1,Integer.parseInt(jd));
        try{
            hdepart = df.parse(heured); // Transformation de la string heured en date hdepart selon le format
        } catch(ParseException e){
            JOptionPane.showMessageDialog(null, "L'heure n'est pas au bon format, recommencez! ! " );
            return;       
        }
        
        darrivee = new Date(Integer.parseInt(aa)-1900,Integer.parseInt(ma)-1,Integer.parseInt(ja));
        try{ // do while en  test try catch pour l'interface grpahique
            harrivee = df.parse(heurea); // Transformation de la string heured en date hdepart selon le format
        } catch(ParseException e){
            JOptionPane.showMessageDialog(null, "L'heure n'est pas au bon format, recommencez!  " );
            return;
        }
        
        if (ddepart.compareTo(darrivee ) > 0) {   // traitement du cas ddepart > darrivee  // alert : erreur darrivee < ddepart resaisir la date arriver
            JOptionPane.showMessageDialog(null, "Erreur ! Votre date d'arrivée est antérieur à la date de départ " );
            return;        
        }else if (ddepart.compareTo(darrivee ) == 0) { // Cas hdépart = harrivee // Resaisir l'heure arrivee
            if (hdepart.compareTo(harrivee) > 0){ // cas harriver antérieur a hdepart --> resaisir heure et re-test
                JOptionPane.showMessageDialog(null, "Ereur ! Heure arrivée est antérieur à l'heure départ" );
                return; 
            }else if(hdepart.compareTo(harrivee) == 0){ // cas de l'heure départ et heure arrivéé identique
                JOptionPane.showMessageDialog(null, "Ereur ! Heure arrivée est égale à l'heure départ" );
                return;         
            }
        } 
        
        v = gr.rechercherVol(numvol) ;
        if (v != null) {            
            a1 = gr.rechercherAeroport(aorigine);
            if(a1 == null){
                JOptionPane.showMessageDialog(null, "Aeroport origine inexistant ! Merci de créer l'aéroport avant de créer le vol ! " );
                return;   
            }else{
                a2 = gr.rechercherAeroport(adestination);
                if(a1 == null){
                    JOptionPane.showMessageDialog(null, "Aeroport destination inexistant ! Merci de créer l'aéroport avant de créer le vol ! " );
                    return;   
                }else{
                    gr.SaisirVol(numvol, ddepart, hdepart, darrivee, harrivee, Double.parseDouble(prix1), 
                            Integer.parseInt(nc1), Double.parseDouble(prix2) , Integer.parseInt(nc2), a1, a2); 
                    JOptionPane.showMessageDialog(null, "Le vol "+numvol+" a bien été créé! " );
                    return; 
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Numéro de vol déja existant " );
            return;        
        }
    }//GEN-LAST:event_submitActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(creervol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(creervol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(creervol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(creervol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new creervol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aerod;
    private javax.swing.JTextField aeroo;
    private javax.swing.JTextField anneea;
    private javax.swing.JTextField anneed;
    private javax.swing.JButton close;
    private javax.swing.JTextField ha;
    private javax.swing.JTextField hd;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField joura;
    private javax.swing.JTextField jourd;
    private javax.swing.JTextField moisa;
    private javax.swing.JTextField moisd;
    private javax.swing.JTextField nbc1;
    private javax.swing.JTextField nbc2;
    private javax.swing.JTextField novol;
    private javax.swing.JTextField pc1;
    private javax.swing.JTextField pc2;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
