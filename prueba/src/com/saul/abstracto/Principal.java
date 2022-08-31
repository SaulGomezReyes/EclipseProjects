package com.saul.abstracto;

public class Principal {

    public static void main(String[] args) {
        Medico medico = new Medico("Juanito","23msd3", "Licenciado", "UNAM", "Podologo","Casa");
        System.out.println("Medico -->"+medico);
        medico.trabajar();
        medico.cobrar();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Programador programador = new Programador("Axel", "NA", "ISC", "UTEZ", "Java", "Flask");
        System.out.println("Programador ~~> " + programador);
        programador.trabajar();
        programador.cobrar();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Actor actor = new Actor("Arnold", "qw234", "Ingeniero", "No se", "Terminator", "Cine");
        System.out.println("Actor ~~> " + actor);
        actor.trabajar();
        actor.cobrar();
    }
}
