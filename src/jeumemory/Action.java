/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeumemory;

/**
 *
 * @author pp541251
 */
public abstract class Action {
    //attribut
    private Joueur j;
    private String descriptif;
    private String deroulement;//sera rempli avec le deroulement action
    
    
    public Action(){
        this.j=null;
        this.descriptif="";
        this.deroulement="";
    }

    public Action(Joueur j, String descriptif) {
        this.j = j;
        this.descriptif = descriptif;
        this.deroulement="";
    }

    public Joueur getJ() {
        return j;
    }

    public void setJ(Joueur j) {
        this.j = j;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }

    public String getDeroulement() {
        return deroulement;
    }

    public void setDeroulement(String deroulement) {
        this.deroulement = deroulement;
    }
    
    
}
