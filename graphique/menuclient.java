/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucie
 */
public class menuclient extends javax.swing.JFrame {

    /**
     * Creates new form menuclient
     */
    public menuclient() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        recherchevol = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        recherchevol_dest = new javax.swing.JMenuItem();
        recherchevol_date = new javax.swing.JMenuItem();
        recherchevol_datedest = new javax.swing.JMenuItem();
        gestionresa = new javax.swing.JMenu();
        creerresa = new javax.swing.JMenuItem();
        modifresa = new javax.swing.JMenuItem();
        consultresa = new javax.swing.JMenuItem();
        gestioncompte = new javax.swing.JMenu();
        modifcoordonnees = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu Client", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12), new java.awt.Color(0, 51, 102))); // NOI18N

        jLabel1.setText("Bonjour + nom + prénom");

        jButton1.setText("Quitter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        recherchevol.setText("Rechercher un vol");
        recherchevol.add(jSeparator1);

        recherchevol_dest.setText("En fonction d'une destination");
        recherchevol.add(recherchevol_dest);

        recherchevol_date.setText("En fonction d'une date");
        recherchevol_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recherchevol_dateActionPerformed(evt);
            }
        });
        recherchevol.add(recherchevol_date);

        recherchevol_datedest.setText("En fonction d'une date et d'une destination");
        recherchevol.add(recherchevol_datedest);

        jMenuBar1.add(recherchevol);

        gestionresa.setText("Gestion des réservations");

        creerresa.setText("Créer une réservation");
        gestionresa.add(creerresa);

        modifresa.setText("Modifier une réservation");
        gestionresa.add(modifresa);

        consultresa.setText("Consulter une réservation");
        gestionresa.add(consultresa);

        jMenuBar1.add(gestionresa);

        gestioncompte.setText("Gestion de compte");

        modifcoordonnees.setText("Modifier ses coordonnées");
        gestioncompte.add(modifcoordonnees);

        jMenuItem1.setText("Afficher les réservations");
        gestioncompte.add(jMenuItem1);

        jMenuBar1.add(gestioncompte);

        setJMenuBar(jMenuBar1);

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recherchevol_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recherchevol_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recherchevol_dateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(menuclient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuclient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuclient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuclient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuclient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem consultresa;
    private javax.swing.JMenuItem creerresa;
    private javax.swing.JMenu gestioncompte;
    private javax.swing.JMenu gestionresa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem modifcoordonnees;
    private javax.swing.JMenuItem modifresa;
    private javax.swing.JMenu recherchevol;
    private javax.swing.JMenuItem recherchevol_date;
    private javax.swing.JMenuItem recherchevol_datedest;
    private javax.swing.JMenuItem recherchevol_dest;
    // End of variables declaration//GEN-END:variables
}
