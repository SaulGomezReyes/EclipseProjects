package com.saul.abstracto;

public class Programador extends Profesionista{

    String lenguaje;
    String framework;

    public Programador(String nombre, String cedula, String titulo, String universidad) {
        super(nombre, cedula, titulo, universidad);
    }

    public Programador(String nombre, String cedula, String titulo, String universidad, String lenguaje, String framework) {
        super(nombre, cedula, titulo, universidad);
        this.lenguaje = lenguaje;
        this.framework = framework;
    }

    @Override
    public void trabajar() {
        System.out.println("Programando ando");
    }

    public void tirandoCodigo(){
        System.out.println("Tirando un codiguito");
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "lenguaje='" + lenguaje + '\'' +
                ", framework='" + framework + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", titulo='" + titulo + '\'' +
                ", universidad='" + universidad + '\'' +
                '}';
    }
}
