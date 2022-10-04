package com.curso.varios;

public class EjemploDeVariablesRefernciaHeap {

	
	public static void main (String[] args) {
		
		Alumno a = new Alumno (1);
		metodo1(a);
		System.out.println("id alumno es " + a.getId());
		System.out.println("Fin main");
	}
	
	public static void metodo1(Alumno a) {
		Alumno b = a;
		metodo2();
		System.out.println("fin m1");
	}
	
	public static void metodo2() {
		Alumno c =new Alumno(3);
		System.out.println("fin m2");
	}
}
