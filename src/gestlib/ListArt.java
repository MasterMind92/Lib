/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestlib;

import java.util.Scanner;

/**
 *
 * @author DALO FAUSTIN
 */
public class ListArt {
    
    private int n;
    private int nbArt;
    private CategorieArticle  list [ ];
    
    public ListArt(int nb){
        this.n= nb;
        this.list = new CategorieArticle[this.n];
        this.nbArt= 1;
    }
    
  public String getArticle(int pos){
      return this.list[pos].toString();
  }

    public String getList( int pos) {
        return this.list[pos].getLib_cat();
    }
    
    public int getNbArt() {
        return nbArt;
    }
    
    public void Ajouter ( CategorieArticle art){
        
//      Scanner sc = new Scanner(System.in);
//      Article sexy= new Article();
//      String temp;
//      
//       System.out.println(" Veuillez renseigner un article");
//       System.out.println(" Libelle");
//       temp= sc.nextLine();         
//       sexy.setLib(temp);
//       System.out.println(" prix  d'acquisition :");
//       temp= sc.nextLine();
//       sexy.setPrxAcq(temp);
//       System.out.println(" prix de vente ");
//       temp= sc.nextLine();
//       sexy.setPrxVte(temp);
//       System.out.println(" date d'acquisition ");
//       temp= sc.nextLine();
//       sexy.setDteAcq(temp);
//       System.out.println(" date de Vente ");
//       temp= sc.nextLine();
//       sexy.setDteVte(temp);
//      System.out.println(" Quantite ");
//       temp= sc.nextLine();
//       sexy.setQte(temp);
//       System.out.println("Marque ");
//       temp= sc.nextLine();
//       sexy.setMarque(temp);
     
        this.list[nbArt] = art;
        
//        System.out.println("Article enregistre avec succes \n" + this.list[nbArt].toString());
        nbArt ++;
        
    }
    
   public static void main(String[] args) throws Exception{
      
       ArtDAO dao = new ArtDAO();
       
      ListArt list = new ListArt(7);
      
      list= dao.getAllArticles();
      
      String chaine = list.getList(4);
      
       System.out.println(chaine);
   }
     
}
