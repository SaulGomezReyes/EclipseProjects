package saul.general;

import java.util.Scanner;

import saul.entity.Laptop;
import saul.entity.Tarjeta;
import saul.implementacion.ImplLaptop;
import saul.implementacion.ImplTarjeta;

public class Main {
	public static void main(String[] args) {

		String modelo;
		int discoDuro;
		int ram;
		double precio;

		ImplLaptop impLaptop = new ImplLaptop();
		ImplTarjeta impTarjeta = new ImplTarjeta();

		Laptop laptop = null;
		Tarjeta tarjeta = null;

		int menu, indice, menuEdit;
		Scanner lectura = null;
		// Guardar Desayuno

		tarjeta = new Tarjeta("Samsung", "DDR3", 290);
		impTarjeta.guardar(tarjeta.getFabricante(), tarjeta);

		tarjeta = new Tarjeta("AMD", "DDR4", 290);
		impTarjeta.guardar(tarjeta.getFabricante(), tarjeta);

		tarjeta = new Tarjeta("Kingstone", "DDR5", 290);
		impTarjeta.guardar(tarjeta.getFabricante(), tarjeta);

		impTarjeta.mostar();

		// Sistema

		do {

			System.out.println("Bienvenido!! \n Seleccione una opción:");
			System.out.println("1 ---> Alta");
			System.out.println("2 ---> Editar");
			System.out.println("3 ---> Eliminar");
			System.out.println("4 ---> Contar");
			System.out.println("5 ---> Mostrar Todo");
			System.out.println("6 ---> Eliminar Todo");
			System.out.println("7 ---> Buscar");
			System.out.println("8 ---> Hay elementos o no?");

			System.out.println("9 ---> Salir");
			lectura = new Scanner(System.in);
			menu = lectura.nextInt();

			switch (menu) {
			case 1:
				System.out.println("Registro nuevo");

				System.out.println("Ingrese el modelo de la laptop");
				lectura = new Scanner(System.in);
				modelo = lectura.nextLine();

				System.out.println("Ingrese el disco duro de la laptop");
				lectura = new Scanner(System.in);
				discoDuro = lectura.nextInt();

				System.out.println("Ingrese la ram de la laptop");
				lectura = new Scanner(System.in);
				ram = lectura.nextInt();

				System.out.println("Ingrese el precio de la laptop");
				lectura = new Scanner(System.in);
				precio = lectura.nextDouble();

				System.out.println("Ingrese la tarjeta grafica de la laptop");
				lectura = new Scanner(System.in);
				tarjeta = (Tarjeta) impTarjeta.buscar(lectura.nextLine());

				laptop = new Laptop(modelo, discoDuro, ram, tarjeta, precio);
				impLaptop.guardar(laptop.getModelo(), laptop);
				System.out.println("Se registró la nueva laptop--> " + laptop.getModelo());

				break;

			case 2:

				System.out.println("Escribe el nombre del elemento para editar");
				lectura = new Scanner(System.in);
				laptop = new Laptop(lectura.nextLine());

				laptop= (Laptop) impLaptop.buscar(laptop.getModelo());

				do {
					System.out.println("Opcion a Editar");
					System.out.println("1 --> Precio");
					System.out.println("2 --> Tarjeta");
					System.out.println("3 --> Salir");

					lectura = new Scanner(System.in);
					menuEdit = lectura.nextInt();

					switch (menuEdit) {
					case 1:
						System.out.println("Nuevo precio de la Laptop");
						lectura = new Scanner(System.in);
						precio = lectura.nextDouble();
						laptop.setPrecio(precio);
						break;
					case 2:
						System.out.println("Nuevo tarjeta de la laptop");
						lectura = new Scanner(System.in);
						tarjeta = (Tarjeta) impTarjeta.buscar(lectura.nextLine());
						laptop.setTarjetaGrafica(tarjeta);
						break;

					}

				} while (menuEdit < 3);

				impLaptop.editar(laptop.getModelo(), laptop);

				System.out.println("Se edito correctamente la siguiente laptop " + laptop.getModelo());
				break;

			case 3:
				System.out.println("Opción de Eliminar");
				System.out.println("Escribe el nombre del elemento a eliminar");
				lectura = new Scanner(System.in);
				laptop = new Laptop(lectura.nextLine());
				laptop= (Laptop) impLaptop.buscar(laptop.getModelo());

				impLaptop.eliminar(laptop.getModelo());

				System.err.println("Elemento eliminado Correctamente!!");

				break;

			case 4:

				impLaptop.contar();
				break;

			case 5:

				impLaptop.mostar();
				break;

			case 6:

				impLaptop.vaciar();
				break;
			case 7:

				System.out.println("Escribe el nombre del elemento para buscar");
				lectura = new Scanner(System.in);
				laptop = new Laptop(lectura.nextLine());

				laptop= (Laptop) impLaptop.buscar(laptop.getModelo());

				System.out.println(laptop);
				break;
			case 8:

				impLaptop.comprobar();
				break;

			}
		} while (menu < 9);
		System.err.println("~~~~~~Vuelva Pronto!!~~~~~~");
	}

}
