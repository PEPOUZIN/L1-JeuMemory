/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeumemory;

import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author pp541251
 */
public class VisuPersonnagesDlg extends javax.swing.JDialog {
    

    /**
     * Creates new form VisuPersonnagesDlg
     */
    
    private Joueur j;//Attribut joueur car on va travailler sur un joueur pour avoir ses cartes
    
    public VisuPersonnagesDlg(java.awt.Frame parent, boolean modal,Joueur lj) {
        super(parent, modal);
        initComponents();
        this.j=lj;
        initPanneau();//appel des composant pour construire l'interace
        LabelScore.setText("Score:"+j.getPaquets().getScore());// on affiche le score
        LabelCarte.setText("Cartes du joueur :"+j.getPseudo());//on affiche le nom du joueur auquel on regarde les cartes
    }
    
    
    public void initPanneau(){
        int nb = j.getPaquets().getTaille();//taille de gridL en fonction de nombre de carte
        PCartes.setLayout(new GridLayout(1,nb));//definition de gridlayout
        for (int i=0; i< nb; i++){// creation des boutons
            JButton jb= new JButton(); 
            jb.setName(""+i);
            PCartes.add(jb);// on ajoute les boutons au Pannel
        }this.pack();//permet d'ajuster correctement la taille des composants apres des ajouts.
    
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
        LabelCarte = new javax.swing.JLabel();
        PCartes = new javax.swing.JPanel();
        LabelScore = new javax.swing.JLabel();
        JBAfficher = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        LabelCarte.setText("Cartes du Joueurs :");
        LabelCarte.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(LabelCarte, java.awt.BorderLayout.NORTH);

        javax.swing.GroupLayout PCartesLayout = new javax.swing.GroupLayout(PCartes);
        PCartes.setLayout(PCartesLayout);
        PCartesLayout.setHorizontalGroup(
            PCartesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        PCartesLayout.setVerticalGroup(
            PCartesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 245, Short.MAX_VALUE)
        );

        jPanel1.add(PCartes, java.awt.BorderLayout.CENTER);

        LabelScore.setText("Score:");
        jPanel1.add(LabelScore, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        JBAfficher.setText("Afficher");
        JBAfficher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAfficherActionPerformed(evt);
            }
        });
        getContentPane().add(JBAfficher, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBAfficherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAfficherActionPerformed
        
        for(int i=0;i<this.j.getPaquets().getTaille();i++){
               JButton jp=(JButton)PCartes.getComponent(i);//on recupere le composant en position i.
               Image img;//on defini l'icone du bouton par celle du personnage;
               img = j.getPaquets().getPerso(i).getPhoto().getScaledInstance(jp.getWidth(), jp.getHeight(), Image.SCALE_DEFAULT);
               jp.setIcon(new ImageIcon(img));
        
        }
        this.pack();//permet d'ajuster correctement la taille des composants apres des ajouts.
    }//GEN-LAST:event_JBAfficherActionPerformed

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
            java.util.logging.Logger.getLogger(VisuPersonnagesDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisuPersonnagesDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisuPersonnagesDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisuPersonnagesDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VisuPersonnagesDlg dialog = new VisuPersonnagesDlg(new javax.swing.JFrame(), true,new Joueur());
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAfficher;
    private javax.swing.JLabel LabelCarte;
    private javax.swing.JLabel LabelScore;
    private javax.swing.JPanel PCartes;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
