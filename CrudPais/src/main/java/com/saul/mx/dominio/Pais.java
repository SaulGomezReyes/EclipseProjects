package com.saul.mx.dominio;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PAISES2")
public class Pais {

    @Id
    @Column(name = "ID_PAIS", columnDefinition = "NUMBER")
    int idPais;

    @Column(name = "NOMBRE", columnDefinition = "NVARCHAR(100)")
    String nombre;

    @Column(name = "CAPITAL", columnDefinition = "NVARCHAR(100)")
    String capital;

    @Column(name = "CONTINENTE", columnDefinition = "NVARCHAR(100)")
    String continente;

    @OneToMany(mappedBy = "pais", cascade =  CascadeType.ALL)
    List<Estado> lista = new ArrayList<Estado>();

    public Pais() {
    }

    public Pais(int idPais, String nombre, String capital, String continente) {
        this.idPais = idPais;
        this.nombre = nombre;
        this.capital = capital;
        this.continente = continente;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "idPais=" + idPais +
                ", nombre='" + nombre + '\'' +
                ", capital='" + capital + '\'' +
                ", continente='" + continente + '\'' +
                '}';
    }
}
