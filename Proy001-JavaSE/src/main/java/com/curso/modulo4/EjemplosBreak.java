package com.curso.modulo4;

import java.util.Iterator;

public class EjemplosBreak {

	public static void main(String[] args) {
		int a = 7;
		//CASO 1. BREAK
		for (int i = 2; i < a ; i++) {
			System.out.println(" linea " + i);
			if( i == 4) break;
			System.out.println(" y escribo esto  " );
		}

		//CASO 2. CONTINUE
		
		for (int i = 2; i < a ; i++) {
			System.out.println(" linea " + i);
			if( i == 4) continue;
			System.out.println(" y escribo esto  " );
		}
		
		//CASO 3.  Break con etiqueta
		for (int i = 2; i < a; i++) {

			System.out.println(" linea  " + i);
					
			for( int j = 0; j < 3; j++ ) {
				System.out.println(j); //0
				if (i == 4) break;
					System.out.println(" y escribo esto   ");
			}
			System.out.println("----- bucle externo ---- ");
		}
	}

}
