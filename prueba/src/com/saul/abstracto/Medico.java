package com.saul.abstracto;

public class Medico extends Profesionista {

    String especialidad;
    String lugarDeTrabajo;

    @Override
    public void trabajar() {
        System.out.println("Lo mismo pero más barato");
    }

    public void recetar() {
        System.out.println("Te receto un golpe >:(");
    }

    public Medico(String nombre, String cedula, String titulo, String universidad, String especialidad, String lugarDeTrabajo) {
        super(nombre, cedula, titulo, universidad);
        this.especialidad = especialidad;
        this.lugarDeTrabajo = lugarDeTrabajo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getLugarDeTrabajo() {
        return lugarDeTrabajo;
    }

    public void setLugarDeTrabajo(String lugarDeTrabajo) {
        this.lugarDeTrabajo = lugarDeTrabajo;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "especialidad='" + especialidad + '\'' +
                ", lugarDeTrabajo='" + lugarDeTrabajo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", titulo='" + titulo + '\'' +
                ", universidad='" + universidad + '\'' +
                '}';
    }
}
