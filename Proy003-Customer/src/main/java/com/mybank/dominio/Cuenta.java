package com.mybank.dominio;

public class Cuenta {

    private double balance;
    
    public Cuenta(double initBalance){
        if(initBalance > 0){
            this.balance = initBalance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt){
        if(amt > 0 ){
            this.balance = this.balance + amt;
        } else {
            System.out.println("No has ingresado " + "o Importe negativo");
        }
        informa("Depositado Exitosamente");
    }
    
    public void withdraw(double amt){        
         if(amt <= 0 ){
             System.out.println("Tiene que ser mayor que 0");
             return;
         }
   
         if( balance >= amt ){
             this.balance = this.balance - amt;
         }else{
              System.out.println("No puede sacar porque es mayor");  
         }
         informa("Retirado Exitosamente");
    }
    
    @Override
    public String toString() {
        return "Cuenta{" + "balance=" + balance + '}';
    }
        
    private void informa(String msg){
        System.out.println(".....");
        System.out.println(msg);
        System.out.println("....");
    }    
            
}
