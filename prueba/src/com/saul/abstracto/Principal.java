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
    }
}
