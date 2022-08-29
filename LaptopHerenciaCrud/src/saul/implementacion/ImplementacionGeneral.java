package saul.implementacion;

import java.util.HashMap;

import saul.general.InterMethod;

public class ImplementacionGeneral implements InterMethod {

	HashMap<Object, Object> has = new HashMap<Object, Object>();

	@Override
	public void guardar(Object key, Object obj) {
		// TODO Auto-generated method stub
		has.put(key, obj);

	}

	@Override
	public void editar(Object key, Object obj) {
		// TODO Auto-generated method stub
		has.put(key, obj);
	}

	@Override
	public void eliminar(Object key) {
		// TODO Auto-generated method stub
		has.remove(key);
	}

	@Override
	public Object buscar(Object key) {
		// TODO Auto-generated method stub
		return has.get(key);
	}

	@Override
	public void mostar() {
		// TODO Auto-generated method stub
		System.out.println(has);
	}

	@Override
	public void contar() {
		// TODO Auto-generated method stub
		System.out.println("El numero de elementos es " + has.size());

	}

	@Override
	public void vaciar() {
		// TODO Auto-generated method stub
		has.clear();
		System.err.println("La lista ha sido vaciada");
	}

	@Override
	public void comprobar() {
		// TODO Auto-generated method stub
		if (has.isEmpty()) {
			System.out.println("La lista Noooo tiene datos");
		} else {
			System.err.println("La lista Siiii tiene datos");
		}
	}

}
