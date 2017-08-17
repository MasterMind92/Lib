/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestlib;

import java.sql.*;

/**
 *
 * @author DALO FAUSTIN
 */
public class ArtDAO {
    
    private static Connection conx;
   
    
    public ArtDAO() throws Exception {
        
            // 1. Get a connection  to the database
           this.conx = DriverManager.getConnection("jdbc:mysql://localhost:3306/librairie" ,"root","");
           
           if (this.conx!=null) {
              
            System.out.println(conx);
            System.out.println("Connexion a la base de donnees effectuee avec succes ");
            
        } else {
             System.out.println("La connexion a echouer !!");
        }
    }
    
    public int getNbArticles() throws SQLException {
       
        Statement req= null;
        ResultSet count= null;
        
        int nb=1;
        
         req= this.conx.createStatement();
         count = req.executeQuery("select COUNT(id_cat) as nb from categorie");
            
            while(count.next()){
                
                nb= Integer.valueOf(count.getString("nb"));
                
            }
            
            return nb;
    }
    
    public ListArt getAllArticles () throws SQLException {
        
        Statement req= null;
        ResultSet result= null;
        int i= 0;
        
            req= this.conx.createStatement();
            result = req.executeQuery(" select id_cat, lib_cat, prx_acq_cat, prx_vte_cat, date_acq_cat, qte_dispo_cat, qte_vendu_cat, marq_cat from categorie");
           
            int n =  this.getNbArticles();
         
           ListArt list= new ListArt(n+1);
            
            while (result.next()) {  
                
               CategorieArticle art= new CategorieArticle (Integer.valueOf(result.getString("id_cat")), result.getString("lib_cat"), Float.valueOf(result.getString("prx_acq_cat")) , Float.valueOf(result.getString("prx_vte_cat")), result.getString("date_acq_cat"), Long.valueOf( result.getString("qte_dispo_cat")), Long.valueOf(result.getString("qte_vendu_cat")), result.getString("marq_cat"));
                
               list.Ajouter(art);          
               i++;
               
            }
            
        return list;
     } 
    
           
    public void getCategories(){
         Statement req= null;
        ResultSet result= null;
        
        CategorieArticle[] list ={};
        
        int i= 1;
        
        try {
            
            req= this.conx.createStatement();
            result = req.executeQuery(" ");
           
            while (result.next()) {  
                
              // list[i] = new Article(result.getString("id_art"), result.getString("lib_art"), result.getString("prx_acq_art"), result.getString("prx_vte_art"), result.getString("date_acq_art"), result.getString("date_vte_art"), result.getString("Qte_dispo_art"), result.getString("marq_art"), result.getString("lib_cat"));
               //list[i].toString();
               //i++;
                System.out.println(result.getString("lib_cat"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            
        }
    }
      public static void main(String[] args ) throws Exception {
          ArtDAO dao = new ArtDAO();
          
          dao.getAllArticles();
          
      } 
} 
        
        

