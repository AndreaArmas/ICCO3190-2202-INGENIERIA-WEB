/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "nomina")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nomina.findAll", query = "SELECT n FROM Nomina n"),
    @NamedQuery(name = "Nomina.findByIdNomina", query = "SELECT n FROM Nomina n WHERE n.idNomina = :idNomina"),
    @NamedQuery(name = "Nomina.findByValorHoraTrabajo", query = "SELECT n FROM Nomina n WHERE n.valorHoraTrabajo = :valorHoraTrabajo"),
    @NamedQuery(name = "Nomina.findByValorMulta", query = "SELECT n FROM Nomina n WHERE n.valorMulta = :valorMulta"),
    @NamedQuery(name = "Nomina.findBySueldoTotal", query = "SELECT n FROM Nomina n WHERE n.sueldoTotal = :sueldoTotal")})
public class Nomina implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_nomina")
    private Integer idNomina;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor_hora_trabajo")
    private Float valorHoraTrabajo;
    @Column(name = "horas_trabajadas")
    private int horas_trabajadas;
    @Column(name = "valor_multa")
    private Float valorMulta;
    @Column(name = "sueldo_total")
    private Float sueldoTotal;
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
    @ManyToOne(optional = false)
    private Persona idPersona;

    public Nomina() {
    }

    public Nomina(Integer idNomina) {
        this.idNomina = idNomina;
    }

    public Integer getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(Integer idNomina) {
        this.idNomina = idNomina;
    }

    public Float getValorHoraTrabajo() {
        return valorHoraTrabajo;
    }

    public void setValorHoraTrabajo(Float valorHoraTrabajo) {
        this.valorHoraTrabajo = valorHoraTrabajo;
    }

    public Float getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(Float valorMulta) {
        this.valorMulta = valorMulta;
    }

    public Float getSueldoTotal() {
        return sueldoTotal;
    }

    public void setSueldoTotal(Float sueldoTotal) {
        this.sueldoTotal = sueldoTotal;
    }

    public Persona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Persona idPersona) {
        this.idPersona = idPersona;
    }

    public int getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setHoras_trabajadas(int horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNomina != null ? idNomina.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nomina)) {
            return false;
        }
        Nomina other = (Nomina) object;
        if ((this.idNomina == null && other.idNomina != null) || (this.idNomina != null && !this.idNomina.equals(other.idNomina))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Nomina[ idNomina=" + idNomina + " ]";
    }
    
}
