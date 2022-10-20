package Equals;

public class PruebaEquals {
	
	public static void main(String[] args) {
		//comparacion entre tipos primitivos
		
		int a = 500;
		int b = 500; 
		System.out.println("a == b " + (a==b));
		
		//comparacio entre objetos
		
		Cliente c1 = new Cliente(1,"Laura");
		Cliente c2 = new Cliente(1,"Laura");
		
		System.out.println("c1 == c2 " + (c1==c2));
		
		/*
		 * Cliente extiende de Object
		 * y como no sobreescribe equals()
		 * usa ==
		 */
	}

}
