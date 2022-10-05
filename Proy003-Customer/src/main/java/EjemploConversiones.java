
public class EjemploConversiones {

	public static void main(String[] args) {
		
		// 8 tipos primitivos
		byte b = 1; //8 bits -128 .. 0 .. 127
		
		short s = 1; //16 bits
		
		int i = 1; //32 bits
		
		long l = 1; //64 bits
		
		//literales enteros
		int numero = 1; //literal de tipo int 32bits
		
		long n2 = 1; //literal entero 32bits 1 cabe en un long de 64bits
		
		long n3 = 1L; //literal tipo long 64bits
		
		//int n4 = 1l;
		
		//casting enteros
		
		int x = 2;
		long y = x; //cabe casting implicito
		long z = 999999999L;
		int zz = (int)z; //casting explicito
						 //jvm mete la tijera y corta los 32 primeros bits de los 64bits existentes
		//00000000000..000001
		//xxxxxxxxxxx..000000000..01
		System.out.println(z);
		System.out.println(zz);
		
		
		//decimales
		float f = 45.5f;   //32bits
		double d = 333.0; //64bits
		
		long sss = 1;
		
		//caracter
		char letra = '1'; //64bits
		char letra2 = '\u03A6';
		
		System.out.println(letra2);
		
		int valor = letra;
		System.out.println(letra);
		System.out.println((char)(++valor));
		
		
		
		
	}

}
