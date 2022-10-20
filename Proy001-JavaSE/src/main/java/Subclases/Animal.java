package Subclases;

public class Animal {
	
	private String sonido;
	
	public void comer() {
		System.out.println("Estoy comiendo");
	}

}

class Perro extends Animal{
	private String raza; 
	
}

class PerroCaza extends Perro{
	private int altura;
	
	public void olfatearPresa() {
		
	}
}

class Gato extends Animal{
	
}

class Vaca extends Animal{
	
}