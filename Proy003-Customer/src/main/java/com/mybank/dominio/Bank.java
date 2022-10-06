package com.mybank.dominio;

public class Bank {

    private  Cliente[] clientes;
    private  int numeroDeClientes;

    public Bank() {
        clientes = new Cliente[10];
        numeroDeClientes = 0;
    }

    public  void addCliente(String nombre, String apellido) {
        int i = numeroDeClientes++;
        clientes[i] = new Cliente(nombre, apellido);
    }

    public  int getNumDeClientes() {
        return numeroDeClientes;
    }

    public  Cliente getCliente(int indice_cliente) {
        return clientes[indice_cliente];
    }
}
