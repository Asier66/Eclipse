package com.mybank.dominio;

public class Cliente {

    private String firstName ;
    private String lastName;
    private Cuenta [] cuentas;
    private int numeroDeCuentas;
    
    public Cliente(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cuentas = new Cuenta[10];
        this.numeroDeCuentas = 0;
    }
    
    public void añadirCuenta(Cuenta acct) {
    	int i = numeroDeCuentas++;
    	cuentas[i] = acct;
    	}
    
    public Cuenta getCuenta(int account_index) {
    	return cuentas[account_index];
    	}

	public int getNumeroDeCuentas() {
		return numeroDeCuentas;
	}

	public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    
}
