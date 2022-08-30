package com.saul.abstracto;

public abstract class Profesionista {

    String nombre;
    String cedula;
    String titulo;
    String universidad;

    public void cobrar(){
        System.out.println("Cobrar");
    }

    public abstract void trabajar();


    public Profesionista(String nombre, String cedula, String titulo, String universidad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.titulo = titulo;
        this.universidad = universidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }
}
