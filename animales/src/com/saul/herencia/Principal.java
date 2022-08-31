package com.saul.herencia;

public class Principal {
    public static void main(String[] args) {
        Perro perro = new Perro("Firulais", "Cafe", "Perruna", 22, "Certificado", 12);
        perro.hacerSonido();
        perro.comer("Croquetas");
        perro.perseguir();

        System.out.println(perro);

        Pez pez = new Pez("Doris", "azul", "Dorado", 1, "Salada", 23);
        pez.hacerSonido();
        pez.comer("algas");
        pez.nadar();

        System.out.println(pez);
    }
}
