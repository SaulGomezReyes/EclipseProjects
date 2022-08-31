package com.saul.herencia;

public class Pez extends Animal{

    String tipoAgua;
    int velocidadNado;


    @Override
    public void hacerSonido() {
        System.out.println("El pez hace Gli, Glu");
    }

    public void nadar(){
        System.out.println("El pez anada mucho");
    }

    public Pez(String nombre, String color, String especie, int anios, String tipoAgua, int velocidadNado) {
        super(nombre, color, especie, anios);
        this.tipoAgua = tipoAgua;
        this.velocidadNado = velocidadNado;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    public int getVelocidadNado() {
        return velocidadNado;
    }

    public void setVelocidadNado(int velocidadNado) {
        this.velocidadNado = velocidadNado;
    }

    @Override
    public String toString() {
        return "Pez{" +
                "tipoAgua='" + tipoAgua + '\'' +
                ", velocidadNado=" + velocidadNado +
                ", nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                '}';
    }
}
