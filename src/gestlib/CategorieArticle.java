/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestlib;

/**
 *
 * @author DALO FAUSTIN
 */
public class CategorieArticle {
    
    private int id_cat;
    private String lib_cat;
   private float prx_acq_cat;
   private float prx_vte_cat;
   private String date_acq_cat;
   private long stock_init_cat;
   private long stock_vendu_cat;
   private String marq_cat;

    public CategorieArticle() {
        
    }

    public CategorieArticle(int id_cat, String lib_cat, float prx_acq_cat, float prx_vte_cat, String date_acq_cat, long stock_init_cat, long stock_vendu_cat, String marq_cat) {
        this.id_cat = id_cat;
        this.lib_cat = lib_cat;
        this.prx_acq_cat = prx_acq_cat;
        this.prx_vte_cat = prx_vte_cat;
        this.date_acq_cat = date_acq_cat;
        this.stock_init_cat = stock_init_cat;
        this.stock_vendu_cat = stock_vendu_cat;
        this.marq_cat = marq_cat;
    }

    public int getId_cat() {
        return id_cat;
    }

    public String getLib_cat() {
        return lib_cat;
    }

    public float getPrx_acq_cat() {
        return prx_acq_cat;
    }

    public float getPrx_vte_cat() {
        return prx_vte_cat;
    }

    public String getDate_acq_cat() {
        return date_acq_cat;
    }

    public long getStock_init_cat() {
        return stock_init_cat;
    }

    public long getStock_vendu_cat() {
        return stock_vendu_cat;
    }

    public String getMarq_cat() {
        return marq_cat;
    }

   
    @Override
    public String toString() {
        return "CategorieArticle{" + "id_cat=" + id_cat + ", lib_cat=" + lib_cat + ", prx_acq_cat=" + prx_acq_cat + ", prx_vte_cat=" + prx_vte_cat + ", date_acq_cat=" + date_acq_cat + ", stock_init_cat=" + stock_init_cat + ", stock_vendu_cat=" + stock_vendu_cat + ", marq_cat=" + marq_cat + '}';
    }

}
