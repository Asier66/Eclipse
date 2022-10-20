package ejemplo7;

public class EjemploStatic {

	private static int revision;
	
	
	public static void hazAlgo() {
		// TODO Auto-generated method stub

	}
	public static class ClaseInterna {
		
	}
	
	/*La variable estatica revision se crea la primera vez que se carga 
	 * la clase EjemplosStatic y solo hay una para toda la aplicacion
	 */
	
	public static void main(String[] args) {
		//EjemploStatic.revision = 3;
		EjemploStatic c = new EjemploStatic();
	}
}
