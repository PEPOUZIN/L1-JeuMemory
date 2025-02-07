/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeumemory;

import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author pp541251
 */
public class Joueur {

    private String pseudo;//On choisi un pseudo pour le joueur
    private LesPersonnages paquets;//on declare un paquet qui contiendra les personnages du joueur
    private Image photo;// une image pour le joueur
    private int score;//un int pour son score
    private String famillepref;//la famillepref est la categorie du joueur

    //constructeur 
    public Joueur(String pseudo, String f) {
        //on initialise les attributs
        this.pseudo = pseudo;
        this.paquets = new LesPersonnages();
        this.famillepref = f;

    }

    //constructeur pardefaut
    public Joueur() {
        this.paquets = new LesPersonnages();//on crée un paquet de joueur
        this.famillepref = "anonyme";// on met anonyme par defaut a sa categorie
        this.pseudo = "anonyme";// on met anonyme par defaut a son pseudo
        this.photo = new ImageIcon(getClass().getResource("/jeumemory/img/anonyme.png")).getImage();//On lui met l'image ananyme.png 
        this.score = 0;//on met son score a 0
    }

    //Getter et Setter 
    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public LesPersonnages getPaquets() {
        return paquets;
    }

    public void setPaquets(LesPersonnages paquets) {
        this.paquets = paquets;
    }

    public Image getPhoto() {
        return photo;
    }

    public void setPhoto(Image photo) {
        this.photo = photo; //new ImageIcon(getClass().getResource("/jeumemory/img/"+photo+".png")).getImage();
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getFamillepref() {
        return famillepref;
    }

    public void setFamillepref(String famillepref) {
        this.famillepref = famillepref;
    }

    //la methode toString renvoi une chaine de carractere qui contient les informations de joueur
    public String toString() {
        return "Joueur" + this.pseudo + "\nfamille préférée:" + this.getFamillepref()
                + "\nen possession des personnages :" + this.getPaquets() + "\nScore:" + this.score;
    }

    //La methode equals permet de comparer deux joueur
    public boolean equals(Joueur j) {
        if (j == this) {
            return true;
        } else {
            return false;
        }
    }

    public void ajoutePersoPaquet(Personnage p) {
        //cette methode permet d'ajouter un personnage au paquet de personnage
        this.paquets.ajoutePerso(p);
    }

    public void initPaquetTest() {
        //permet de tester la fenetre VisuPersonnageDlg en ajoutant des personnages au paquet 
        ajoutePersoPaquet(new Personnage("communs", "assault-trooper", 10));
        ajoutePersoPaquet(new Personnage("communs", "commando", 20));
        ajoutePersoPaquet(new Personnage("rares", "absolute-zero", 10));
    }
}
