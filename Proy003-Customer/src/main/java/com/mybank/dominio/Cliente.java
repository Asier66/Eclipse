package com.mybank.dominio;

public class Cliente {

    private String firstName ;
    private String lastName;
    private Cuenta cuenta;  
    
    public Cliente(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cuenta = new Cuenta(0);
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
    
}
