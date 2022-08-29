package saul.implementacion;

import java.util.HashMap;

import saul.general.InterMetodos;

public class ImpGeneral implements InterMetodos{

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
		
	}

	@Override
	public void vaciar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comprobar() {
		// TODO Auto-generated method stub
		
	}
	
}
