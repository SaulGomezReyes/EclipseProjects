import java.util.Scanner;

public class MainMoto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String modelo;
		String marca;
		double precio;
		int motor;

		Moto moto = null;

		int menu, indice, menuEdit;
		Scanner lectura = null;

		ImpleMoto imp = new ImpleMoto();

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

				System.out.println("Ingrese el modelo de la moto");
				lectura = new Scanner(System.in);
				modelo = lectura.nextLine();

				System.out.println("Ingrese la marca de la moto");
				lectura = new Scanner(System.in);
				marca = lectura.nextLine();

				System.out.println("Ingrese el precio de la moto");
				lectura = new Scanner(System.in);
				precio = lectura.nextDouble();

				System.out.println("Ingrese el motor de la moto");
				lectura = new Scanner(System.in);
				motor = lectura.nextInt();

				moto = new Moto(modelo, marca, precio, motor);
				imp.guardar(moto);
				System.out.println("Se registró la nueva moto--> " + moto.getModelo());

				break;

			case 2:

				System.out.println("Escribe el nombre del elemento para editar");
				lectura = new Scanner(System.in);
				moto = new Moto(lectura.nextLine());

				moto = imp.buscar(moto);

				do {
					System.out.println("Opcion a Editar");
					System.out.println("1 --> Marca");
					System.out.println("2 --> Precio");
					System.out.println("3 --> Motor");
					System.out.println("4 --> Salir");

					lectura = new Scanner(System.in);
					menuEdit = lectura.nextInt();

					switch (menuEdit) {
					case 1:
						System.out.println("Nueva marca de la Moto");
						lectura = new Scanner(System.in);
						marca = lectura.nextLine();
						moto.setMarca(marca);
						break;
					case 2:
						System.out.println("Nuevo precio de la moto");
						lectura = new Scanner(System.in);
						precio = lectura.nextDouble();
						moto.setPrecio(precio);
						break;
					case 3:
						System.out.println("Nuevo motor de la moto");
						lectura = new Scanner(System.in);
						motor = lectura.nextInt();
						moto.setMotor(motor);
						break;
					}

				} while (menuEdit < 4);

				imp.editar(moto);

				System.out.println("Se edito correctamente la siguiente moto" + moto.getModelo());
				break;

			case 3:
				System.out.println("Opción de Eliminar");
				System.out.println("Escribe el nombre del elemento a eliminar");
				moto = new Moto(lectura.nextLine());

				moto = imp.buscar(moto);

				imp.eliminar(moto);

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

				System.out.println("Escribe el nombre de la moto que desas buscar");
				lectura = new Scanner(System.in);
				moto = new Moto(lectura.nextLine());

				moto = imp.buscar(moto);
				System.out.println(moto);

				break;
			case 8:

				imp.vacio();
				break;

			}
		} while (menu < 9);
		System.out.println("Fin");

	}

}
