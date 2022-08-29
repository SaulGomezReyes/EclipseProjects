import java.util.HashMap;

public class ImplAlumno implements InterHer{

	HashMap<String, Alumno> hash = new HashMap<String, Alumno>();
	Alumno alumno = null;
	
	@Override
	public void guardar(Object obj) {
		// TODO Auto-generated method stub
		alumno = (Alumno) obj;
		hash.put(alumno.getNombre(), alumno);
	}

	@Override
	public void editar(Object obj) {
		// TODO Auto-generated method stub
		hash.put(alumno.getNombre(), alumno);
	}

	@Override
	public void eliminar(Object obj) {
		// TODO Auto-generated method stub
		alumno = (Alumno) obj;
		hash.remove(alumno);
	}

	@Override
	public Object buscar(Object obj) {
		// TODO Auto-generated method stub
		alumno = (Alumno) obj;
		return hash.get(alumno.getNombre());
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(hash);
	}

}
