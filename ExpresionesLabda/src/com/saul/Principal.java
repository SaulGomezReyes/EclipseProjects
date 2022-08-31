package com.saul;

public class Principal {
    public static void main(String[] args) {
        ICalculadoraLamda suma = (a,b) -> a+b;
        System.out.println(suma.operacion(5,6));

        ICalculadoraLamda multi = (a,b) -> a*b;
        System.out.println(multi.operacion(5,6));
    }
}
