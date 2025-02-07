/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeumemory;

import javax.swing.ImageIcon;

/**
 *
 * @author pp541251
 */
public class JeuMemory extends javax.swing.JFrame {

    private LesPersonnages persos;//On a une liste de personages
    private LesJoueurs joueurs;//On a une liste de joueurs qui joue la partie

    //constructeur
    public JeuMemory() {
        initComponents();//creation de l'interface
        this.persos = new LesPersonnages();//Creation d'une liste de personnages
        this.joueurs = new LesJoueurs();//creation d'une liste de joueurs
        //On crée des Joueurs qui vont nous permettre de tester nos différentes boites de dialogue
        Joueur j = new Joueur("Lara", "epiques");
        j.setPhoto(new ImageIcon(getClass().getResource("/jeumemory/img/lara.jpg")).getImage());
        joueurs.ajouteJoueur(j);
        j = new Joueur("Jack", "rares");
        j.setPhoto(new ImageIcon(getClass().getResource("/jeumemory/img/jack.png")).getImage());
        joueurs.ajouteJoueur(j);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        Demarrer = new javax.swing.JButton();
        Recommencer = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Parametres = new javax.swing.JMenu();
        Options = new javax.swing.JMenuItem();
        AjoutJoueur = new javax.swing.JMenuItem();
        Visualiser = new javax.swing.JMenu();
        Jouer = new javax.swing.JMenuItem();
        Carte = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        Tranfert_Test = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Memory");

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.GridLayout(3, 1));

        jLabel1.setText("Nb de personnages trouvés:2");
        jPanel2.add(jLabel1);

        jLabel2.setText("Nb de personnages restants:8");
        jPanel2.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel3.setText("C'est a Lara de jouer:");
        jPanel2.add(jLabel3);

        jPanel1.add(jPanel2, java.awt.BorderLayout.NORTH);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel3.setLayout(new java.awt.GridLayout(1, 2));

        Demarrer.setText("Demarrer");
        jPanel3.add(Demarrer);

        Recommencer.setText("Recommencer");
        jPanel3.add(Recommencer);

        jPanel1.add(jPanel3, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel1, java.awt.BorderLayout.WEST);

        jPanel4.setLayout(new java.awt.GridLayout(4, 5));
        jPanel4.add(jButton1);
        jPanel4.add(jButton2);
        jPanel4.add(jButton3);
        jPanel4.add(jButton4);
        jPanel4.add(jButton5);
        jPanel4.add(jButton6);
        jPanel4.add(jButton7);
        jPanel4.add(jButton8);
        jPanel4.add(jButton9);
        jPanel4.add(jButton10);
        jPanel4.add(jButton11);
        jPanel4.add(jButton12);
        jPanel4.add(jButton13);
        jPanel4.add(jButton14);
        jPanel4.add(jButton15);
        jPanel4.add(jButton16);
        jPanel4.add(jButton17);
        jPanel4.add(jButton18);
        jPanel4.add(jButton19);
        jPanel4.add(jButton20);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        Parametres.setText("Parametre");

        Options.setText("Options");
        Options.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptionsActionPerformed(evt);
            }
        });
        Parametres.add(Options);

        AjoutJoueur.setText("Ajout Joueur");
        AjoutJoueur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjoutJoueurActionPerformed(evt);
            }
        });
        Parametres.add(AjoutJoueur);

        jMenuBar1.add(Parametres);

        Visualiser.setText("Visualiser");

        Jouer.setText("Joueur");
        Jouer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JouerActionPerformed(evt);
            }
        });
        Visualiser.add(Jouer);

        Carte.setText("Carte");
        Carte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarteActionPerformed(evt);
            }
        });
        Visualiser.add(Carte);

        jMenuBar1.add(Visualiser);

        jMenu1.setText("Test");

        Tranfert_Test.setText("Tranfert_Test");
        Tranfert_Test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tranfert_TestActionPerformed(evt);
            }
        });
        jMenu1.add(Tranfert_Test);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JouerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JouerActionPerformed
        //Quand on clique sur Jouer ouvre la boîte de dialogue VisuJoueurDlg
        VisuJoueurDlg diag = new VisuJoueurDlg(this, true, this.joueurs);//creationde la boîte
        diag.setVisible(true);//rends la fenêtre visible
    }//GEN-LAST:event_JouerActionPerformed

    private void OptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptionsActionPerformed
        //Quand on clique sur  Option ouvre la boîte de dialogue InitDlg
        InitDlg diag = new InitDlg(this, true);//creation de la boîte
        diag.setVisible(true);//rends la fenêtre visible
        if (diag.getOk() == true) // accesseur pour récupérer l’indicateur
        {
            LesJoueurs lj = diag.getJoueurs(); // accesseur pour récupérer le joueur saisi
            int niveau = diag.getNiveau();//recupere le niveau choisi
            this.persos = new LesPersonnages(niveau);// cree une liste de personnages avec le niveau choisi qui contiendra le bon nombre de personnage
        }
    }//GEN-LAST:event_OptionsActionPerformed

    private void AjoutJoueurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjoutJoueurActionPerformed
        //Quand on clique sur AjoutJoueur ouvre la boîte de dialogue SaisieJoueurDlg
        SaisieJoueurDlg diag = new SaisieJoueurDlg(this, true, this.persos);//creation de la boîte
        diag.setVisible(true);//rends la fenêtre visible
        if (diag.isOk() == true) // accesseur pour récupérer l’indicateur
        {
            this.joueurs.ajouteJoueur(diag.getJoueur());//On ajoute le joueur crée a la liste de joueur
        }
    }//GEN-LAST:event_AjoutJoueurActionPerformed

    private void CarteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarteActionPerformed
        //Teste pour voir si un joueur fonctionne:
        Joueur j = new Joueur("Lara", "epiques");
        j.setPhoto(new ImageIcon(getClass().getResource("/jeumemory/img/lara.jpg")).getImage());

        //on appelle cette methode qui ajoute des cartes au joueur créé
        j.initPaquetTest();

        //Creaton de la boite de dialogue VisuPersonnagesDlg
        VisuPersonnagesDlg diag = new VisuPersonnagesDlg(this, true, j);
        diag.setVisible(true);

    }//GEN-LAST:event_CarteActionPerformed

    private void Tranfert_TestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tranfert_TestActionPerformed
        // TODO add your handling code here:
        Joueur j1 = new Joueur("FanMemory0", "commun");
        j1.initPaquetTest();
        Joueur j2 = new Joueur("FanMemory1", "commun");
        j2.getPaquets().ajoutePerso(new Personnage("epiques", "burnout", 20));
        j2.getPaquets().ajoutePerso(new Personnage("epiques", "funk-ops", 30));
        j2.getPaquets().ajoutePerso(new Personnage("alpins-femmes", "mogul-master", 10));
        this.joueurs.ajouteJoueur(j1);
        this.joueurs.ajouteJoueur(j2);
        TransfertDlg diag = new TransfertDlg(this, true, joueurs, 0);
        diag.setVisible(true);
    }//GEN-LAST:event_Tranfert_TestActionPerformed

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
            java.util.logging.Logger.getLogger(JeuMemory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JeuMemory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JeuMemory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JeuMemory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JeuMemory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AjoutJoueur;
    private javax.swing.JMenuItem Carte;
    private javax.swing.JButton Demarrer;
    private javax.swing.JMenuItem Jouer;
    private javax.swing.JMenuItem Options;
    private javax.swing.JMenu Parametres;
    private javax.swing.JButton Recommencer;
    private javax.swing.JMenuItem Tranfert_Test;
    private javax.swing.JMenu Visualiser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
