/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeumemory;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author pp541251
 */
public class Personnage {
    
    private String famille;//Le personnage a une Famille
    private String nom;// Le personnage a un no
    private int valeur;//Le personnage a une valeur
    private Image photo;//Le personnage a une immage
    //constructeur
    public Personnage( ) {// on initiaise les attributs
        this.famille = "anonyme";// on met anonyme pardefaut car on ne sait pas
        this.nom = "anonyme";// on met anonyme pardefaut car on ne sait pas
        this.valeur= 0;//on mets la valuer a 0,car on en a aucune
        this.photo = new ImageIcon(getClass().getResource("/jeumemory/img/anonyme.png")).getImage();//on met l'image anonyme
    }
    
    //constructeur standar
    public Personnage(String famille, String nom, int valeur){// on initiaise les attributs avec les parametre
        this.famille=famille;
        this.nom=nom;
        this.valeur=valeur;
        this.photo=new ImageIcon(getClass().getResource("/jeumemory/img/"+this.nom+".jpg")).getImage();
        //on va chercher l'image qui correspond au nom
    }
    
    
    //Getter et Setter classique
    public String getFamille() {
        return famille;
    }

    public void setFamille(String famille) {
        this.famille = famille;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public Image getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = new ImageIcon(getClass().getResource("/memory/img/"+photo)).getImage();
    }
     //la methode toString renvoi une chaine de carractere qui contient les informations du Personnage
    public String toString(){
        String resul=this.nom+" de la famille "+this.famille;
        resul+= " valeur: "+this.valeur;
        return resul;
    }
     public void setImgBouton(JButton jb){
        //Prends un bouton en entré , construit une image(avec l'image contenue dans photo) a la taille du bouton,et affecte l'image au bouton
         Image img=photo.getScaledInstance(jb.getWidth(), jb.getHeight(), Image.SCALE_SMOOTH);
         jb.setIcon(new ImageIcon(img));   
     }
}
