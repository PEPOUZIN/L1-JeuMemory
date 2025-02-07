/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeumemory;

import java.util.ArrayList;

/**
 *
 * @author pp541251
 */
public class LesJoueurs {

    private ArrayList<Joueur> lstJ; // une liste de joueurs

    public LesJoueurs() {
        this.lstJ = new ArrayList<Joueur>(); // creation de la liste/instanciation
    }

    public Joueur getJoueur(int i) {
        //retourne le joueur i de la liste de joueurs
        if (i >= 0 && i < this.lstJ.size()) {
            return this.lstJ.get(i);
        } else {
            return null; //sinon on retourne null
        }
    }

    public int getIndiceJoueur(Joueur j) {
        return lstJ.indexOf(j);
        // retourne la position du joueur dans le tableau
    }

    public int getNbJoueurs() {
        //retourne le nombre de Joueur
        return lstJ.size();

    }

    public void ajouteJoueur(Joueur j) {
        //permet d'ajouter un joueur a la liste
        this.lstJ.add(j);
    }

    public Joueur rechJoueur(String p) {
        //On va rechercher un joueur qui a la meme description que le parametre rentrer et le retrouner
        boolean ok = true;
        Joueur val = new Joueur();
        int i = 0;
        while (i < lstJ.size()) {//on parcours la liste
            if (this.getJoueur(i).getPseudo().equals(p)) {
                ok = true;
                val = lstJ.get(i);
                i++;
            } else {
                ok = false;
                i++;
            }

        }
        if (ok == true) {
            return val;//on renvoie le joueur si on l'a trouvé
        } else {
            return null;//on renvoie nul sinon
        }

    }

    public void supprimeJoueur(Joueur j) {
        //on parcour la liste de joueur et on suprime le joueur passer en parametre en regardant celui qui est equivalant dans la liste
        for (int i = 0; i < lstJ.size(); i++) {
            if (this.lstJ.get(i).equals(j)) {
                this.lstJ.remove(i);
            }
        }

    }

    //la methode toString renvoi une chaine de carractere qui contient les informations de tous les joueurs de la liste
    public String toString() {
        String s = "";
        for (int i = 0; i < lstJ.size(); i++) {
            s += i + "- " + getJoueur(i).toString();
        }
        return s;
    }

    public LesJoueurs getGagnants() {
        int max = getJoueur(0).getScore(); //On dit que le joueur a la position 0 a le score max et on le stock dans la variable max;
        for (int i = 1; i < getNbJoueurs(); i++) //on parcour la liste de joueur a partir de 1 et non 0;
        {
            if (getJoueur(i).getScore() > max) {
                max = this.getJoueur(i).getScore();// et si le joueur en position i a un score plus éléver que le joueur en position 0 alors il prends la valeur max et le remplace;
            }
        }
        LesJoueurs lst = new LesJoueurs();// creation d'une nouvelle list lst
        for (int i = 0; i < getNbJoueurs(); i++)//qui commence a 0 et qui parcoure la liste lstJ
        {
            if (getJoueur(i).getScore() == max) {
                lst.ajouteJoueur(getJoueur(i));// Si le joueur en position i a un score = a max on l'ajoute a liste lst
            }
        }
        return lst;
    } // on retourne lst
    //
}
