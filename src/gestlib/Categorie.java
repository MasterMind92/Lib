/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestlib;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author DALO FAUSTIN
 */
@Entity
@Table(name = "categorie", catalog = "librairie", schema = "")
@NamedQueries({
    @NamedQuery(name = "Categorie.findAll", query = "SELECT c FROM Categorie c"),
    @NamedQuery(name = "Categorie.findByIdCat", query = "SELECT c FROM Categorie c WHERE c.idCat = :idCat"),
    @NamedQuery(name = "Categorie.findByLibCat", query = "SELECT c FROM Categorie c WHERE c.libCat = :libCat"),
    @NamedQuery(name = "Categorie.findByPrxAcqCat", query = "SELECT c FROM Categorie c WHERE c.prxAcqCat = :prxAcqCat"),
    @NamedQuery(name = "Categorie.findByPrxVteCat", query = "SELECT c FROM Categorie c WHERE c.prxVteCat = :prxVteCat"),
    @NamedQuery(name = "Categorie.findByDateAcqCat", query = "SELECT c FROM Categorie c WHERE c.dateAcqCat = :dateAcqCat"),
    @NamedQuery(name = "Categorie.findByStockInitCat", query = "SELECT c FROM Categorie c WHERE c.stockInitCat = :stockInitCat"),
    @NamedQuery(name = "Categorie.findByStockVenduCat", query = "SELECT c FROM Categorie c WHERE c.stockVenduCat = :stockVenduCat"),
    @NamedQuery(name = "Categorie.findByMarqCat", query = "SELECT c FROM Categorie c WHERE c.marqCat = :marqCat"),
    @NamedQuery(name = "Categorie.findByIdFourn", query = "SELECT c FROM Categorie c WHERE c.idFourn = :idFourn")})
public class Categorie implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cat")
    private Integer idCat;
    @Column(name = "lib_cat")
    private String libCat;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "prx_acq_cat")
    private Float prxAcqCat;
    @Column(name = "prx_vte_cat")
    private Float prxVteCat;
    @Column(name = "date_acq_cat")
    @Temporal(TemporalType.DATE)
    private Date dateAcqCat;
    @Column(name = "stock_init_cat")
    private Integer stockInitCat;
    @Column(name = "stock_vendu_cat")
    private Integer stockVenduCat;
    @Column(name = "marq_cat")
    private String marqCat;
    @Column(name = "id_fourn")
    private Integer idFourn;

    public Categorie() {
    }

    public Categorie(Integer idCat) {
        this.idCat = idCat;
    }

    public Integer getIdCat() {
        return idCat;
    }

    public void setIdCat(Integer idCat) {
        Integer oldIdCat = this.idCat;
        this.idCat = idCat;
        changeSupport.firePropertyChange("idCat", oldIdCat, idCat);
    }

    public String getLibCat() {
        return libCat;
    }

    public void setLibCat(String libCat) {
        String oldLibCat = this.libCat;
        this.libCat = libCat;
        changeSupport.firePropertyChange("libCat", oldLibCat, libCat);
    }

    public Float getPrxAcqCat() {
        return prxAcqCat;
    }

    public void setPrxAcqCat(Float prxAcqCat) {
        Float oldPrxAcqCat = this.prxAcqCat;
        this.prxAcqCat = prxAcqCat;
        changeSupport.firePropertyChange("prxAcqCat", oldPrxAcqCat, prxAcqCat);
    }

    public Float getPrxVteCat() {
        return prxVteCat;
    }

    public void setPrxVteCat(Float prxVteCat) {
        Float oldPrxVteCat = this.prxVteCat;
        this.prxVteCat = prxVteCat;
        changeSupport.firePropertyChange("prxVteCat", oldPrxVteCat, prxVteCat);
    }

    public Date getDateAcqCat() {
        return dateAcqCat;
    }

    public void setDateAcqCat(Date dateAcqCat) {
        Date oldDateAcqCat = this.dateAcqCat;
        this.dateAcqCat = dateAcqCat;
        changeSupport.firePropertyChange("dateAcqCat", oldDateAcqCat, dateAcqCat);
    }

    public Integer getStockInitCat() {
        return stockInitCat;
    }

    public void setStockInitCat(Integer stockInitCat) {
        Integer oldStockInitCat = this.stockInitCat;
        this.stockInitCat = stockInitCat;
        changeSupport.firePropertyChange("stockInitCat", oldStockInitCat, stockInitCat);
    }

    public Integer getStockVenduCat() {
        return stockVenduCat;
    }

    public void setStockVenduCat(Integer stockVenduCat) {
        Integer oldStockVenduCat = this.stockVenduCat;
        this.stockVenduCat = stockVenduCat;
        changeSupport.firePropertyChange("stockVenduCat", oldStockVenduCat, stockVenduCat);
    }

    public String getMarqCat() {
        return marqCat;
    }

    public void setMarqCat(String marqCat) {
        String oldMarqCat = this.marqCat;
        this.marqCat = marqCat;
        changeSupport.firePropertyChange("marqCat", oldMarqCat, marqCat);
    }

    public Integer getIdFourn() {
        return idFourn;
    }

    public void setIdFourn(Integer idFourn) {
        Integer oldIdFourn = this.idFourn;
        this.idFourn = idFourn;
        changeSupport.firePropertyChange("idFourn", oldIdFourn, idFourn);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCat != null ? idCat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categorie)) {
            return false;
        }
        Categorie other = (Categorie) object;
        if ((this.idCat == null && other.idCat != null) || (this.idCat != null && !this.idCat.equals(other.idCat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gestlib.Categorie[ idCat=" + idCat + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
