import java.util.HashMap;



public class ImplDeporte implements IntDeporte {

	HashMap<String, Deporte> hash = new HashMap<String, Deporte>();
	Deporte deporte = null;

	@Override
	public void guardar(Object obj) {
		// TODO Auto-generated method stub
		deporte = (Deporte) obj;
		hash.put(deporte.getNombre(), deporte);
	}

	@Override
	public void editar(Object obj) {
		// TODO Auto-generated method stub
		deporte = (Deporte) obj;
		hash.put(deporte.getNombre(), deporte);
	}

	@Override
	public void eliminar(Object obj) {
		// TODO Auto-generated method stub
		deporte = (Deporte) obj;
		hash.remove(deporte.getNombre());
	}

	@Override
	public Object buscar(Object obj) {
		// TODO Auto-generated method stub
		deporte = (Deporte) obj;

		return hash.get(deporte.getNombre());
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(hash);
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
