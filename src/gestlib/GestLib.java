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
public class GestLib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        try {
            // 1. Get a connection  to the database
            Connection conx= DriverManager.getConnection("jdbc:mysql://localhost:3306/librairie" ,"root","");
            
            //2. Creation d'une requete
            Statement req= conx.createStatement();
            
            //3.Execution de la requete SQL
            ResultSet result = req.executeQuery("select * from article");
            
            //4. Recuperation des resultats
            while (result.next()) {                
                System.out.println(result.getString("lib_art")+" "+ result.getString("prx_vte_art"));
            }
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
       
        
    }
    
}
