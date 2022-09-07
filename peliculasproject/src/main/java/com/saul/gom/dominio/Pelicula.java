package com.saul.gom.dominio;

import javax.persistence.*;

@Entity
@Table(name = "CRUD_PELICULA")
public class Pelicula {

    @Id
    @Column(name = "ID_PELICULA", columnDefinition = "NUMBER")
    int idPelicula;

    @Column(name = "NOMBRE", columnDefinition = "NVARCHAR(100)")
    String nombre;

    @Column(name = "DURACION", columnDefinition = "NUMBER")
    int duracion;

    @Column(name = "COSTO", columnDefinition = "NUMBER")
    double costo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_PAIS")
    Pais pais;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_GENERO")
    Genero genero;

    public Pelicula() {
    }

    public Pelicula(int idPelicula, String nombre, int duracion, double costo, Pais pais, Genero genero) {
        this.idPelicula = idPelicula;
        this.nombre = nombre;
        this.duracion = duracion;
        this.costo = costo;
        this.pais = pais;
        this.genero = genero;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "idPelicula=" + idPelicula +
                ", nombre='" + nombre + '\'' +
                ", duracion=" + duracion +
                ", costo=" + costo +
                ", pais=" + pais +
                ", genero=" + genero +
                '}';
    }
}
