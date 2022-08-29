
public class Principal {
	public static void main(String[] args) {

		Hijo hijo = new Hijo("SAul", "Lopez", 23, "amarillo", 12);
		
		System.out.println(hijo);
		
		hijo.setColorOjos("Verde");
		
		System.out.println(hijo);
	}
}
