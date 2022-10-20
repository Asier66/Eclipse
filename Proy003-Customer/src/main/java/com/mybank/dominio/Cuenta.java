package com.mybank.dominio;

public class Cuenta {

    protected double balance;
    
    public Cuenta(double initBalance){
        if(initBalance > 0){
            this.balance = initBalance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amt){
        if(amt > 0 ){
            this.balance = this.balance + amt;
        } else {
            System.out.println("No has ingresado " + "o Importe negativo");
        }
        informa("Depositado Exitosamente");
        return true;
    }
    
    public boolean withdraw(double amt){ 
    	boolean result = false;
         if(amt <= balance ){
        	 balance = balance - amt;
             System.out.println("Tiene que ser mayor que 0");
             result = true;
         }
   
         if( balance >= amt ){
             this.balance = this.balance - amt;
         }else{
              System.out.println("No puede sacar porque es mayor");  
         }
         informa("Retirado Exitosamente");
         return result;
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
