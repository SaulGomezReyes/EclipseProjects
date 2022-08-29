import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String color;
		String material;
		String piso;
		double precio;
		int cuartos;
		int banos;

		Casa casa = null;

		int menu, indice, menuEdit;
		Scanner lectura = null;

		ImplCasa imp = new ImplCasa();

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

				System.out.println("Ingrese el color de la casa");
				lectura = new Scanner(System.in);
				color = lectura.nextLine();

				System.out.println("Ingrese el material de la casa");
				lectura = new Scanner(System.in);
				material = lectura.nextLine();
				
				System.out.println("Ingrese el piso de la casa");
				lectura = new Scanner(System.in);
				piso = lectura.nextLine();

				System.out.println("Ingrese el precio de la casa");
				lectura = new Scanner(System.in);
				precio = lectura.nextDouble();

				System.out.println("Ingrese los cuartos de la casa");
				lectura = new Scanner(System.in);
				cuartos = lectura.nextInt();
				
				System.out.println("Ingrese los baños de la casa");
				lectura = new Scanner(System.in);
				banos = lectura.nextInt();

				casa = new Casa(color, material, piso,  cuartos, banos, precio);
				imp.guardar(casa);
				System.out.println("Se registró la nueva casa--> " + casa.getColor());

				break;

			case 2:

				System.out.println("Escribe el color del elemento para editar");
				lectura = new Scanner(System.in);
				casa = new Casa(lectura.nextLine());

				casa = imp.buscar(casa);

				do {
					System.out.println("Opcion a Editar");
					System.out.println("1 --> Baños");
					System.out.println("2 --> Material");
					System.out.println("3 --> Precio");
					System.out.println("4 --> Salir");

					lectura = new Scanner(System.in);
					menuEdit = lectura.nextInt();

					switch (menuEdit) {
					case 1:
						System.out.println("Nuevo numero de baños de la Casa");
						lectura = new Scanner(System.in);
						banos = lectura.nextInt();
						casa.setBanos(banos);
						break;
					case 2:
						System.out.println("Nuevo material de la casa");
						lectura = new Scanner(System.in);
						material = lectura.nextLine();
						casa.setMaterial(material);
						break;
					case 3:
						System.out.println("Nuevo precio de la casa");
						lectura = new Scanner(System.in);
						precio = lectura.nextDouble();
						casa.setPrecio(precio);
						break;
					}

				} while (menuEdit < 4);

				imp.editar(casa);

				System.out.println("Se edito correctamente la siguiente casa " + casa.getColor());
				break;

			case 3:
				System.out.println("Opción de Eliminar");
				System.out.println("Escribe el nombre del elemento a eliminar");
				casa = new Casa(lectura.nextLine());

				casa = imp.buscar(casa);

				imp.eliminar(casa);

				System.err.println("Elemento eliminado Correctamente!!");

				break;

			case 4:

				imp.contar();
				break;

			case 5:

				imp.mostrar();
				break;

			case 6:

				imp.eliminarTodo();

				break;
			case 7:

				System.out.println("Escribe el color de la casa que desas buscar");
				lectura = new Scanner(System.in);
				casa = new Casa(lectura.nextLine());

				casa = imp.buscar(casa);
				System.out.println(casa);

				break;
			case 8:

				imp.vacio();
				break;

			}
		} while (menu < 9);
		System.err.println("~~~~~~Vuelva Pronto!!~~~~~~");
	}

}
