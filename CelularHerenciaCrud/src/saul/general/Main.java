package saul.general;

import java.util.Scanner;

import saul.entity.Celular;
import saul.entity.Marca;
import saul.entity.SistemaOperativo;
import saul.implementacion.ImpCelular;
import saul.implementacion.ImpMarca;
import saul.implementacion.ImpSistemas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String modelo;
		int precio;
		int ram;

		ImpCelular impCelular = new ImpCelular();
		ImpMarca impMarca = new ImpMarca();
		ImpSistemas impSistemas = new ImpSistemas();

		Celular celular = null;
		Marca marca = null;
		SistemaOperativo sistema = null;

		int menu, indice, menuEdit;
		Scanner lectura = null;
		// Guardar Desayuno

		marca = new Marca("Samsung", "Korea", 12);
		impMarca.guardar(marca.getNombre(), marca);

		marca = new Marca("Motorola", "Japon", 19);
		impMarca.guardar(marca.getNombre(), marca);

		marca = new Marca("Xiaomi", "China", 23);
		impMarca.guardar(marca.getNombre(), marca);

		impMarca.mostar();

		// Sistema

		sistema = new SistemaOperativo("Andoroid", "x32", "v5.19");
		impSistemas.guardar(sistema.getNombre(), sistema);

		sistema = new SistemaOperativo("IOS", "x64", "v9.28");
		impSistemas.guardar(sistema.getNombre(), sistema);

		impSistemas.mostar();

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

				System.out.println("Ingrese el modelo del celular");
				lectura = new Scanner(System.in);
				modelo = lectura.nextLine();

				System.out.println("Ingrese el precio del celular");
				lectura = new Scanner(System.in);
				precio = lectura.nextInt();

				System.out.println("Ingrese la ram del celular");
				lectura = new Scanner(System.in);
				ram = lectura.nextInt();

				System.out.println("Ingrese la marca del celular");
				lectura = new Scanner(System.in);
				marca = (Marca) impMarca.buscar(lectura.nextLine());

				System.out.println("Ingrese el sistema del celular");
				lectura = new Scanner(System.in);
				sistema = (SistemaOperativo) impSistemas.buscar(lectura.nextLine());

				celular = new Celular(modelo, precio, ram, marca, sistema);
				impCelular.guardar(celular.getModelo(), celular);
				System.out.println("Se registró el nuevo celular--> " + celular.getModelo());

				break;

			case 2:

				System.out.println("Escribe el nombre del elemento para editar");
				lectura = new Scanner(System.in);
				celular = new Celular(lectura.nextLine());

				celular = (Celular) impCelular.buscar(celular.getModelo());

				do {
					System.out.println("Opcion a Editar");
					System.out.println("1 --> Precio");
					System.out.println("2 --> Ram");
					System.out.println("3 --> Marca");
					System.out.println("4 --> Salir");

					lectura = new Scanner(System.in);
					menuEdit = lectura.nextInt();

					switch (menuEdit) {
					case 1:
						System.out.println("Nuevo precio del Celular");
						lectura = new Scanner(System.in);
						precio = lectura.nextInt();
						celular.setPrecio(precio);
						break;
					case 2:
						System.out.println("Nuevo ram del Celular");
						lectura = new Scanner(System.in);
						ram = lectura.nextInt();
						celular.setRam(ram);
						break;
					case 3:
						System.out.println("Nuevo marca del Celular");
						lectura = new Scanner(System.in);
						marca = (Marca) impMarca.buscar(lectura.nextLine());
						celular.setMarca(marca);
						break;
					}

				} while (menuEdit < 4);

				impCelular.editar(celular.getModelo(), celular);

				System.out.println("Se edito correctamente el siguiente celular " + celular.getModelo());
				break;

			case 3:
				System.out.println("Opción de Eliminar");
				System.out.println("Escribe el nombre del elemento a eliminar");
				lectura = new Scanner(System.in);
				celular = new Celular(lectura.nextLine());
				celular = (Celular) impCelular.buscar(celular.getModelo());

				impCelular.eliminar(celular.getModelo());

				System.err.println("Elemento eliminado Correctamente!!");

				break;


			case 4:

				impCelular.contar();
				break;
				
			case 5:

				impCelular.mostar();
				break;

			case 6:

				impCelular.vaciar();
				break;
			case 7:

				System.out.println("Escribe el nombre del elemento para buscar");
				lectura = new Scanner(System.in);
				celular = new Celular(lectura.nextLine());

				celular = (Celular) impCelular.buscar(celular.getModelo());

				System.out.println(celular);
				break;
			case 8:

				impCelular.comprobar();
				break;

			}
		} while (menu < 9);
		System.err.println("~~~~~~Vuelva Pronto!!~~~~~~");

	}

}
