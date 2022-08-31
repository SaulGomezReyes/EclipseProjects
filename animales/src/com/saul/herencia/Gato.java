package com.saul.herencia;

public class Gato extends Animal{

    String volumenRonroneo;
    String comidaFavorita;

    @Override
    public void hacerSonido() {
        System.out.println("El gato hace Miau! Miau!");
    }

    public void pelear(){
        System.out.println("El gato pelea con otros gatos");
    }

    public Gato(String nombre, String color, String especie, int anios, String volumenRonroneo, String comidaFavorita) {
        super(nombre, color, especie, anios);
        this.volumenRonroneo = volumenRonroneo;
        this.comidaFavorita = comidaFavorita;
    }

    public String getVolumenRonroneo() {
        return volumenRonroneo;
    }

    public void setVolumenRonroneo(String volumenRonroneo) {
        this.volumenRonroneo = volumenRonroneo;
    }

    public String getComidaFavorita() {
        return comidaFavorita;
    }

    public void setComidaFavorita(String comidaFavorita) {
        this.comidaFavorita = comidaFavorita;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "volumenRonroneo='" + volumenRonroneo + '\'' +
                ", comidaFavorita='" + comidaFavorita + '\'' +
                ", nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                '}';
    }
}
