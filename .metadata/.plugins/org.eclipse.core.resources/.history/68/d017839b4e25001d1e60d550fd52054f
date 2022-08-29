import java.util.HashMap;

public class ImpleMoto implements IntMoto {

	HashMap<String, Moto> hash = new HashMap<String, Moto>();

	@Override
	public void guardar(Moto moto) {
		// TODO Auto-generated method stub
		hash.put(moto.getModelo(), moto);
	}

	@Override
	public void editar(Moto moto) {
		// TODO Auto-generated method stub
		hash.put(moto.getModelo(), moto);
	}

	@Override
	public void eliminar(Moto moto) {
		// TODO Auto-generated method stub
		hash.remove(moto.getModelo());
	}

	@Override
	public Moto buscar(Moto moto) {
		// TODO Auto-generated method stub
		moto = hash.get(moto.getModelo());
		return moto;
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