package com.mybank.prueba;

import com.mybank.dominio.Cuenta;

public class PruebaCuenta {
    
    public static void main(String[] args) {
        
        
        Cuenta c = new Cuenta(200);
        
        Cuenta cuenta = new Cuenta(500);
        
        System.out.println("Saldo " + cuenta.getBalance());
        
        System.out.println("Ingreso 200");
        cuenta.deposit(200);  
        
        System.out.println("Su cuenta es " + cuenta );  
        System.out.println("Ingreso -50");
        cuenta.deposit(-50);
        
        double necesito = -100;
        System.out.println("Retiro -50");
        
        cuenta.withdraw(necesito);
        
        System.out.println(cuenta);

        necesito = 100;
        System.out.println("Retiro 100");

        cuenta.withdraw(necesito); 
        System.out.println(cuenta); 

        necesito = 450;
        System.out.println("Retiro 450");
        cuenta.withdraw(necesito);
        System.out.println(cuenta);  
    }
    
}
