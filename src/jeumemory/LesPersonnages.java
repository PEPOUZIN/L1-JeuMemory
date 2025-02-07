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
public class LesPersonnages {
    
    private ArrayList<Personnage> persos;//On travail sur une liste de personnages.

    public ArrayList<Personnage> getPersos() {
        return persos;
    }
    
    public LesPersonnages() {
      this.persos = new ArrayList<Personnage>();//On crée la liste de personnages
     }
         
     public int getTaille() { 
         return this.persos.size(); 
     }
     //Permet d'avoir la taille de la liste
     
    public int getScore(){   
        int sc = 0;
        for(int i=0; i<getTaille(); i++)
           sc+=getPerso(i).getValeur();
        return sc;
    }
    //Permet de savoir le cumule de point de la liste persos
          
    public Personnage getPerso(int i){
        if (i>=0 && i<this.persos.size())
             return this.persos.get(i);
        else return null;
    }
    //Retounre un personnage de a ieme position de la liste persos
    
    public LesPersonnages getPersosFamille(String f)
    {   LesPersonnages lp = new LesPersonnages();
        for(int i=0; i<getTaille(); i++)
            if(getPerso(i).getFamille().equals(f))
                lp.ajoutePerso(getPerso(i));
        return lp;
    }
    //Retourne une liste qui contient tous les personnage d'une meme famille donné en paramètre
    
    public void retirePerso(Personnage p)
    { 
        int i=0; 
        boolean trouve = false;
        while(i<getTaille() && !trouve){
          if (getPerso(i).getNom().equals(p.getNom())){
              this.persos.remove(i);  
              trouve = true;
          }
          else i++;
        }      
    }
    //Si un personnage existe il le retire de la liste a laquelle est appliqué cette fonction.
    
    public ArrayList<String> getFamilles(){
        ArrayList<String> lst = new ArrayList<String>();
       
        for(int i=0;i<this.persos.size();i++){
            Personnage p =this.persos.get(i);
            boolean trouve=false;
            
            for(int j=0;j<lst.size();j++)
                if(lst.get(j).equals(p.getFamille()))
                    trouve = true;
            
            if(!trouve) lst.add(p.getFamille());
                
        }
        return lst;
    }
    // methode qui permet de recuperer dans uns liste toutes les familles sans doublons
   public LesPersonnages retirePersos(int n)
    { LesPersonnages lcr = new LesPersonnages();
        for (int i=0; i<=n; i++)
        {
            lcr.ajoutePerso(getPerso(0));
            this.persos.remove(0);  
        }
        return lcr;
    } 
   //Retire les niemes premiers personnages de la liste
    
    public LesPersonnages retirePersosFamille(String f)
    { 
        LesPersonnages lcr = new LesPersonnages();
        int i = 0;
        while(i<getTaille()){
            if (getPerso(i).getFamille().equals(f)) {
                lcr.ajoutePerso(getPerso(i));
                this.persos.remove(i);  
            }
            else i++;
        }
        return lcr;
    }
    //Retire tous les personnages d'une même famille
     
    public void retireCartes()
    { 
           persos.clear();
    }
    //Permet de vider la liste
	@Override
        
        
    public String toString() {
        String s = "";
        for(int i=0; i<getTaille(); i++)
            s+=i+"- "+getPerso(i).toString();
       return s;
    }
    // a obtenir une représentation textuelle de l'objet
	
    
    //Constructeur standard,On va construie des personnages (avec le nombre passer en parametre) que l'on va ajouter a la liste "perso" que l'on crée 
    public LesPersonnages(int nc) {
        this.persos = new ArrayList<Personnage>();
        if (nc >= 4){ // 2 familles
            ajoutePerso(new Personnage("communs", "assault-trooper", 10));
            ajoutePerso(new Personnage("communs", "commando", 20));
            ajoutePerso(new Personnage("rares", "absolute-zero", 10));
            ajoutePerso(new Personnage("rares", "arctice-assassin", 20));
        }
        if (nc >= 10){ // 4 familles
            ajoutePerso(new Personnage("communs", "devestrator", 30));
            ajoutePerso(new Personnage("rares", "brawler", 30));
            ajoutePerso(new Personnage("alpins-femmes", "mogul-master", 10));
            ajoutePerso(new Personnage("alpins-femmes", "mogul-master-can", 20));
            ajoutePerso(new Personnage("as-des-pistes", "alpine-ace", 10));
            ajoutePerso(new Personnage("as-des-pistes", "alpine-ace-can", 20));
        }
        if (nc >= 18){ // 6 familles

            ajoutePerso(new Personnage("alpins-femmes", "mogul-master-chn", 30));
            ajoutePerso(new Personnage("as-des-pistes", "alpine-ace-chn", 30));
            ajoutePerso(new Personnage("legendaires", "power-chord", 10));
            ajoutePerso(new Personnage("legendaires", "raptor", 20));
            ajoutePerso(new Personnage("legendaires", "raven", 30));
            ajoutePerso(new Personnage("epiques", "burnout", 10));
            ajoutePerso(new Personnage("epiques", "funk-ops", 20));
            ajoutePerso(new Personnage("epiques", "rex", 30));
        }
        if (nc == 32){ // 6 familles
            ajoutePerso(new Personnage("communs", "dominator", 40));
            ajoutePerso(new Personnage("communs", "highrise-assault-trooper", 50));
            ajoutePerso(new Personnage("communs", "jungle-scout", 60));
            ajoutePerso(new Personnage("communs", "pathfinder", 70));
            ajoutePerso(new Personnage("rares", "brilliant-striker", 40));
            ajoutePerso(new Personnage("rares", "brite-bomber", 50));
            ajoutePerso(new Personnage("rares", "circuit-breaker", 60));
            ajoutePerso(new Personnage("rares", "dazzle", 70));
            ajoutePerso(new Personnage("alpins-femmes", "mogul-master-fra", 40));
            ajoutePerso(new Personnage("alpins-femmes", "mogul-master-gbr", 50));
            ajoutePerso(new Personnage("as-des-pistes", "alpine-ace-fra", 40));
            ajoutePerso(new Personnage("as-des-pistes", "alpine-ace-gbr", 50));
            ajoutePerso(new Personnage("legendaires", "red-knight", 40));
            ajoutePerso(new Personnage("epiques", "shadow-ops", 40));
        }
        
    }
    
    
    public void ajoutePerso(Personnage a){
        persos.add(a);
    }
    //Ajoute un personnage a la liste persos
    
    public void ajoutePersos(LesPersonnages a){
        for(int i=0 ;i<a.getTaille();i++)this.persos.add(a.getPerso(i));
    }
    //ajoute les personnages de la liste "a"  a la liste persos.
}
