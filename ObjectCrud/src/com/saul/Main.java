package com.saul;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Implementacion imp = new Implementacion();
		
		Torta torta = null;
		
		torta = new Torta("Rusa", 23, "Chica", "Pechuga");
		imp.guardar(torta);
		torta = new Torta("Cubana", 53, "Grande", "Todos");
		imp.guardar(torta);
		torta = new Torta("Suiza", 40, "Mediana", "Queso");
		imp.guardar(torta);
		
		imp.mostrar();
		
	}

}
