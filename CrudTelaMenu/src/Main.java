import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tipo;
		String color;
		double precio;
		String textura;
		int metro;

		Tela tela = null;

		int menu, indice, menuEdit;
		Scanner lectura = null;

		ImplTela imp = new ImplTela();

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

				System.out.println("Ingrese el tipo de tela");
				lectura = new Scanner(System.in);
				tipo = lectura.nextLine();

				System.out.println("Ingrese el color de tela");
				lectura = new Scanner(System.in);
				color = lectura.nextLine();

				System.out.println("Ingrese el precio de tela");
				lectura = new Scanner(System.in);
				precio = lectura.nextDouble();

				System.out.println("Ingrese la textura de tela");
				lectura = new Scanner(System.in);
				textura = lectura.nextLine();
				
				System.out.println("Ingrese los metros de tela");
				lectura = new Scanner(System.in);
				metro = lectura.nextInt();

				tela = new Tela(tipo, color, textura, metro, precio);
				imp.guardar(tela);
				System.out.println("Se registró la nueva tela--> " + tela.getTipo());

				break;

			case 2:

				System.out.println("Escribe el nombre del elemento para editar");
				lectura = new Scanner(System.in);
				tela = new Tela(lectura.nextLine());

				tela = imp.buscar(tela);

				do {
					System.out.println("Opcion a Editar");
					System.out.println("1 --> Color");
					System.out.println("2 --> Precio");
					System.out.println("3 --> Salir");

					lectura = new Scanner(System.in);
					menuEdit = lectura.nextInt();

					switch (menuEdit) {
					case 1:
						System.out.println("Nuevo color de Tela");
						lectura = new Scanner(System.in);
						color = lectura.nextLine();
						tela.setColor(color);
						break;
					case 2:
						System.out.println("Nuevo precio del taco");
						lectura = new Scanner(System.in);
						precio = lectura.nextDouble();
						tela.setPrecio(precio);
						break;
					}

				} while (menuEdit < 3);

				imp.editar(tela);

				System.out.println("Se edito correctamente la siguiente tela" + tela.getTipo());
				break;

			case 3:
				System.out.println("Opción de Eliminar");
				System.out.println("Escribe el nombre del elemento a eliminar");
				tela = new Tela(lectura.nextLine());

				tela = imp.buscar(tela);

				imp.eliminar(tela);

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

				System.out.println("Escribe el nombre del taco que desas buscar");
				lectura = new Scanner(System.in);
				tela = new Tela(lectura.nextLine());

				tela = imp.buscar(tela);
				System.out.println(tela);

				break;
			case 8:
					
				imp.vacio();
				break;

			}
		} while (menu < 9);
		System.out.println("Fin");


	}

}
