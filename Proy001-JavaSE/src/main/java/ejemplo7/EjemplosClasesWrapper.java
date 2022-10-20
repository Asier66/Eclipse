package ejemplo7;

public class EjemplosClasesWrapper {

	public static void main(String[] args) {
		int numero = 2;
		Integer numero2 = new Integer(2);
		Integer numero3 = 2;
		
		int a = numero3; //.intValue()
		
		int b = numero3 + new Integer(4);
		
		
		Integer n1 = 3;
		Integer n2 = 3;
		Integer n3 = new Integer(12);
		
		System.out.println("n1 == n2 " + (n1 == n2));
		System.out.println("n1 == n3 " + (n1 == n3));
		
		if(n1.equals(n2)) {
			System.out.println("n1 y n2 son iguales");
		}
		
		if(n1.equals(n3)) {
			System.out.println("n1 y n3 son iguales");
		}
	}
	
}
