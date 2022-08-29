import java.util.HashMap;

public class ImplDEsayuno implements InterHer {
	
	HashMap<String, Desayuno> hash = new HashMap<String, Desayuno>();
	Desayuno desayuno = null;

	@Override
	public void guardar(Object obj) {
		// TODO Auto-generated method stub
desayuno = (Desayuno) obj;
hash.put(desayuno.getNombreD(), desayuno);
	}

	@Override
	public void editar(Object obj) {
		// TODO Auto-generated method stub
		desayuno = (Desayuno) obj;
		hash.put(desayuno.getNombreD(), desayuno);
	}

	@Override
	public void eliminar(Object obj) {
		// TODO Auto-generated method stub
		desayuno = (Desayuno) obj;
		hash.remove(desayuno.getNombreD());
	}

	@Override
	public Object buscar(Object obj) {
		// TODO Auto-generated method stub
		desayuno = (Desayuno) obj;
		return hash.get(desayuno.getNombreD());
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(hash);
	}

}
