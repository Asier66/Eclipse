package com.mybank.dominio;

public class TestBanking {

    public static void main(String[] args) {
        Bank bank = new Bank();
        
        bank.addCliente("Asier", "Campos");
        bank.addCliente("Begoña", "Olea");
        bank.addCliente("Jane", "Sims");
        bank.addCliente("Owen", "Bryant");
        
        for ( int i = 0; i < bank.getNumDeClientes(); i++ ) {
            Cliente cliente = bank.getCliente(i);
            
            System.out.println("El cliente numero [" + (i+1) + "] es: " + cliente.getLastName() + ", " + cliente.getFirstName());
        }
    }  
}
