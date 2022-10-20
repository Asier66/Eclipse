package com.mybank.dominio;

public class SavingsAccount extends Cuenta{
	
private double interestRate;
    
    public SavingsAccount(double initBalance, double interestRate) {
        super(initBalance);
        this.interestRate = interestRate;
    }
}
