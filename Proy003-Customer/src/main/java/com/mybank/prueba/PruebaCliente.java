package com.mybank.prueba;

import com.mybank.dominio.Cuenta;
import com.mybank.dominio.Cliente;

public class PruebaCliente {
    
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Asier","Campos"); 
        System.out.println("Datos de Cliente");
        System.out.println("Nombre: " + cliente.getFirstName() + " " + cliente.getLastName());
        System.out.println("Saldo Actual: " + cliente.getCuenta(1).getBalance());
        
        System.out.println("Ingreso 200");
        cliente.getCuenta(1).deposit(200);
        System.out.println("Saldo Actual: " + cliente.getCuenta(1).getBalance());

        System.out.println("Retiro 150");
        cliente.getCuenta(1).withdraw(150);

        System.out.println("Saldo Actual: " + cliente.getCuenta(1).getBalance());

        Cuenta nueva = new Cuenta(2000);
        //cliente.setCuenta(nueva);
        
        
    }
    
}
