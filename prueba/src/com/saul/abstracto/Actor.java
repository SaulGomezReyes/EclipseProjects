package com.saul.abstracto;

public class Actor extends Profesionista{

    String pelicula;
    String plataforma;

    @Override
    public void trabajar() {
        System.out.println("Actuando Ando");
    }

    public Actor(String nombre, String cedula, String titulo, String universidad, String pelicula, String plataforma) {
        super(nombre, cedula, titulo, universidad);
        this.pelicula = pelicula;
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "pelicula='" + pelicula + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", titulo='" + titulo + '\'' +
                ", universidad='" + universidad + '\'' +
                '}';
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
}
