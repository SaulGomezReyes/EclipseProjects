package com.saul.herencia;

public abstract class Animal {

    String nombre;
    String color;
    String especie;
    int edad;

    public void comer(String tipoAlimento){
        System.out.println("El animal come " + tipoAlimento);
    }

    public abstract void hacerSonido();

    public Animal(String nombre, String color, String especie, int anios) {
        this.nombre = nombre;
        this.color = color;
        this.especie = especie;
        this.edad = anios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", especie='" + especie + '\'' +
                ", anios=" + edad +
                '}';
    }
}
