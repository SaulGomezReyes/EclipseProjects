import java.util.HashMap;

public class ImplTela implements IntTela{

	HashMap<String, Tela> hash = new HashMap<String, Tela>();
	
	@Override
	public void guardar(Tela tela) {
		// TODO Auto-generated method stub
		hash.put(tela.getTipo(), tela);
	}

	@Override
	public void editar(Tela tela) {
		// TODO Auto-generated method stub
		hash.put(tela.getTipo(), tela);
	}

	@Override
	public void eliminar(Tela tela) {
		// TODO Auto-generated method stub
		hash.remove(tela.getTipo());
	}

	@Override
	public Tela buscar(Tela tela) {
		// TODO Auto-generated method stub
		 tela = hash.get(tela.getTipo()); 
		return tela;
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
		System.err.println("Lista eliminada!!!");
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
		System.out.println("El total de elementos son: "+ hash.size());
	}

	
}
