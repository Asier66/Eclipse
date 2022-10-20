package com.mybank.dominio;

import com.mybank.dominio.*;

public class CustomerReport {
    
    private Bank bank;
    
    public CustomerReport() {
    }
    
    public Bank getBank() {
        return bank;
    }
    
    public void setBank(Bank bank) {
        this.bank = bank;
    }
    
    public void generateReport() {
        
        System.out.println("\tCUSTOMER REPORT");
        System.out.println("\t================");
        
        for ( int cust_idx = 0;
        cust_idx < bank.getNumDeClientes();
        cust_idx++ ) {
            Cliente cliente = bank.getCliente(cust_idx);
            
            System.out.println();
            System.out.println("Cliente: "
                    + cliente.getLastName() + ", "
                    + cliente.getFirstName());
            
            for ( int acct_idx = 0;
            acct_idx < cliente.getNumeroDeCuentas();
            acct_idx++ ) {
                Cuenta cuenta = cliente.getCuenta(acct_idx);
                String  account_type = "";
                
                if ( cuenta instanceof SavingsAccount ) {
                    account_type = "Savings Account";
                } else if ( cuenta instanceof CheckingAccount ) {
                    account_type = "Checking Account";
                } else {
                    account_type = "Unknown Account Type";
                }
                
                System.out.println("    " + account_type + ": current balance is "
                        + cuenta.getBalance());
            }
        }
    }
}
