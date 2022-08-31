package com.saul.herencia;

public class Perro extends Animal{

    String pedigre;
    int tamanioJauria;


    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra, Gua! Gua!");
    }

    public void perseguir(){
        System.out.println("El perro persigue coches");
    }

    public Perro(String nombre, String color, String especie, int anios, String pedigre, int tamanioJauria) {
        super(nombre, color, especie, anios);
        this.pedigre = pedigre;
        this.tamanioJauria = tamanioJauria;
    }

    public String getPedigre() {
        return pedigre;
    }

    public void setPedigre(String pedigre) {
        this.pedigre = pedigre;
    }

    public int getTamanioJauria() {
        return tamanioJauria;
    }

    public void setTamanioJauria(int tamanioJauria) {
        this.tamanioJauria = tamanioJauria;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "pedigre='" + pedigre + '\'' +
                ", tamanioJauria=" + tamanioJauria +
                ", nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", especie='" + especie + '\'' +
                ", anios=" + edad +
                '}';
    }
}
