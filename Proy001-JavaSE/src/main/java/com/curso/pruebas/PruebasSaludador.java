package com.curso.pruebas;
import com.curso.varios.Saludador;
import java.util.*;

public class PruebasSaludador {

	public static void main(String[] args) {
		// Uso de la clase Saludador
		
		int numeroCamiones = 2;
		
		//1.  Se puede crear un objeto Saludador
		//     crear un objeto de la clase, intanciar un objeto de la clase
		//s1 es una variable de referencia que apunta a objetos de tipo Saludador
		//com.curso.varios.Saludador s1;
		Saludador s1 = new Saludador();
		
		//2.  Pedir saludar pasando nombre -> muestra "Hola" + nombre
		
		System.out.println(s1.saluda("Asier Campos"));
		
		//3.  Pedir saludar sin nombre -> muestra "Hola Amigo"
		
		System.out.println(s1.saluda());
		
		//4.  Crear saludador en el que indique el saludo
		Saludador s2 = new Saludador("Buenos Dias");
		
		//5.  Pedir saludo sin nombre "Buenos Dias Amigo"
		System.out.println(s2.saluda());

	}

}
