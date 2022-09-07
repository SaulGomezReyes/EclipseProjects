package com.saul.gom.dominio;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "GENERO_PELICULA")
public class Genero {

    @Id
    @Column(name = "ID_GENERO", columnDefinition = "NUMBER")
    int idGenero;

    @Column(name = "NOMBRE", columnDefinition = "NVARCHAR(100)")
    String nombre;

    @Column(name = "DESCRIPCION", columnDefinition = "NVARCHAR(100)")
    String descripcion;

    @OneToMany(mappedBy = "genero", cascade =  CascadeType.ALL)
    List<Pelicula> lista = new ArrayList<Pelicula>();

    public Genero() {
    }

    public Genero(int idGenero, String nombre, String descripcion) {
        this.idGenero = idGenero;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Genero{" +
                "idGenero=" + idGenero +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
