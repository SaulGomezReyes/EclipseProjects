import java.util.HashMap;

public class ImplCasa implements IntCasa {

	HashMap<String, Casa> hash = new HashMap<String, Casa>();

	@Override
	public void guardar(Casa casa) {
		// TODO Auto-generated method stub
		hash.put(casa.getColor(), casa);
	}

	@Override
	public void editar(Casa casa) {
		// TODO Auto-generated method stub
		hash.put(casa.getColor(), casa);
	}

	@Override
	public void eliminar(Casa casa) {
		// TODO Auto-generated method stub
		hash.remove(casa.getColor());
	}

	@Override
	public Casa buscar(Casa casa) {
		// TODO Auto-generated method stub
		casa = hash.get(casa.getColor());
		return casa;
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(hash.values());
	}

	@Override
	public void eliminarTodo() {
		// TODO Auto-generated method stub
		hash.clear();
		System.err.println("~~~~~~Todos los elementos de la lista han sido eliminados!!!~~~~~~");
	}

	@Override
	public void vacio() {
		// TODO Auto-generated method stub
		if (hash.isEmpty()) {
			System.err.println("La lista esta vacia!!!");
		} else {
			System.out.println("La lista NOOO esta vacia");
		}
	}

	@Override
	public void contar() {
		// TODO Auto-generated method stub
		System.out.println("El total de elementos son: " + hash.size());
	}

}
