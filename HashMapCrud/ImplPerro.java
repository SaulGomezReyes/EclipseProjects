import java.util.HashMap;

public class ImplPerro implements IntPerro{
	
	HashMap<String, Perro> hash =new HashMap<String, Perro>();

	@Override
	public void guardar(Perro perro) {
		// TODO Auto-generated method stub
		hash.put(perro.getNombre(), perro);
		
	}

	@Override
	public void editar(Perro perro) {
		// TODO Auto-generated method stub
		hash.put(perro.getNombre(), perro);
	}

	@Override
	public void eliminar(Perro perro) {
		// TODO Auto-generated method stub
		hash.remove(perro.getNombre());
	}

	@Override
	public Perro buscar(Perro perro) {
		// TODO Auto-generated method stub
		perro = hash.get(perro.getNombre());
		return perro;
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		
		System.out.println(hash);
	}
	
	

}
