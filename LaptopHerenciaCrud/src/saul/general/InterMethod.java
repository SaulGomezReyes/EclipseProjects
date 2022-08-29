package saul.general;

public interface InterMethod {
	public void guardar(Object key, Object obj);

	public void editar(Object key, Object obj);

	public void eliminar(Object key);

	public Object buscar(Object key);

	public void mostar();

	public void contar();

	public void vaciar();

	public void comprobar();
}
