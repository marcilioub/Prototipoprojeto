/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft_all;

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
 * @author Marcilio
 */
@Entity
@Table(name = "entradas", catalog = "BDSoftAll", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Entradas.findAll", query = "SELECT e FROM Entradas e")
    , @NamedQuery(name = "Entradas.findById", query = "SELECT e FROM Entradas e WHERE e.id = :id")
    , @NamedQuery(name = "Entradas.findByDataOperacao", query = "SELECT e FROM Entradas e WHERE e.dataOperacao = :dataOperacao")
    , @NamedQuery(name = "Entradas.findByCedenteSacado", query = "SELECT e FROM Entradas e WHERE e.cedenteSacado = :cedenteSacado")
    , @NamedQuery(name = "Entradas.findByReferente", query = "SELECT e FROM Entradas e WHERE e.referente = :referente")
    , @NamedQuery(name = "Entradas.findByObservacoes", query = "SELECT e FROM Entradas e WHERE e.observacoes = :observacoes")
    , @NamedQuery(name = "Entradas.findByValor", query = "SELECT e FROM Entradas e WHERE e.valor = :valor")})
public class Entradas implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "data_operacao")
    @Temporal(TemporalType.DATE)
    private Date dataOperacao;
    @Basic(optional = false)
    @Column(name = "cedente_sacado")
    private String cedenteSacado;
    @Basic(optional = false)
    @Column(name = "referente")
    private String referente;
    @Column(name = "observacoes")
    private String observacoes;
    @Basic(optional = false)
    @Column(name = "valor")
    private double valor;

    public Entradas() {
    }

    public Entradas(Integer id) {
        this.id = id;
    }

    public Entradas(Integer id, String cedenteSacado, String referente, double valor) {
        this.id = id;
        this.cedenteSacado = cedenteSacado;
        this.referente = referente;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public Date getDataOperacao() {
        return dataOperacao;
    }

    public void setDataOperacao(Date dataOperacao) {
        Date oldDataOperacao = this.dataOperacao;
        this.dataOperacao = dataOperacao;
        changeSupport.firePropertyChange("dataOperacao", oldDataOperacao, dataOperacao);
    }

    public String getCedenteSacado() {
        return cedenteSacado;
    }

    public void setCedenteSacado(String cedenteSacado) {
        String oldCedenteSacado = this.cedenteSacado;
        this.cedenteSacado = cedenteSacado;
        changeSupport.firePropertyChange("cedenteSacado", oldCedenteSacado, cedenteSacado);
    }

    public String getReferente() {
        return referente;
    }

    public void setReferente(String referente) {
        String oldReferente = this.referente;
        this.referente = referente;
        changeSupport.firePropertyChange("referente", oldReferente, referente);
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        String oldObservacoes = this.observacoes;
        this.observacoes = observacoes;
        changeSupport.firePropertyChange("observacoes", oldObservacoes, observacoes);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        double oldValor = this.valor;
        this.valor = valor;
        changeSupport.firePropertyChange("valor", oldValor, valor);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entradas)) {
            return false;
        }
        Entradas other = (Entradas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "soft_all.Entradas[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
