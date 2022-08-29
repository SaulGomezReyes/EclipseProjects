import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre;
		String sabor;
		double precio;
		String tipoSalasa;

		Taco taco = null;

		int menu, indice, menuEdit;
		Scanner lectura = null;

		ImplTaco imp = new ImplTaco();

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

				System.out.println("Ingrese el nombre del taco");
				lectura = new Scanner(System.in);
				nombre = lectura.nextLine();

				System.out.println("Ingrese el sabor del taco");
				lectura = new Scanner(System.in);
				sabor = lectura.nextLine();

				System.out.println("Ingrese el precio del taco");
				lectura = new Scanner(System.in);
				precio = lectura.nextDouble();

				System.out.println("Ingrese el tipo del salsa del taco");
				lectura = new Scanner(System.in);
				tipoSalasa = lectura.nextLine();

				taco = new Taco(nombre, sabor, precio, tipoSalasa);
				imp.guardar(taco);
				System.out.println("Se registró el nuevo taco --> " + taco.getNombre());

				break;

			case 2:

				System.out.println("Escribe el nombre del elemento para editar");
				lectura = new Scanner(System.in);
				taco = new Taco(lectura.nextLine());

				taco = imp.buscar(taco);

				do {
					System.out.println("Opcion a Editar");
					System.out.println("1 --> Tipo de Salsa");
					System.out.println("2 --> Precio");
					System.out.println("3 --> Salir");

					lectura = new Scanner(System.in);
					menuEdit = lectura.nextInt();

					switch (menuEdit) {
					case 1:
						System.out.println("Nuevo tipo de salsa");
						lectura = new Scanner(System.in);
						tipoSalasa = lectura.nextLine();
						taco.setTipoSalasa(tipoSalasa);
						break;
					case 2:
						System.out.println("Nuevo precio del taco");
						lectura = new Scanner(System.in);
						precio = lectura.nextDouble();
						taco.setPrecio(precio);
						break;
					}

				} while (menuEdit < 3);

				imp.editar(taco);

				System.out.println("Se edito correctamente el siguiente taco" + taco.getNombre());
				break;

			case 3:
				System.out.println("Opción de Eliminar");
				System.out.println("Escribe el nombre del elemento a eliminar");
				taco = new Taco(lectura.nextLine());

				taco = imp.buscar(taco);

				imp.eliminar(taco);

				System.err.println("Elemento eliminado Correctamente!!");

				break;

			case 4:

				System.out.println("No hago nada :D");
				break;

			case 5:

				imp.mostrar();
				break;

			case 6:
				System.out.println("No hago nada :D");
				// imp.eliminarTodo();

				break;
			case 7:

				System.out.println("Escribe el nombre del taco que desas buscar");
				lectura = new Scanner(System.in);
				taco = new Taco(lectura.nextLine());

				taco = imp.buscar(taco);
				System.out.println(taco);

				break;
			case 8:
				System.out.println("No hago nada :D");
				// imp.vacio();
				break;

			}
		} while (menu < 9);
		System.out.println("Fin");

	}

}
