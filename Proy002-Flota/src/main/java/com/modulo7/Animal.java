package com.modulo7;

public abstract class Animal {
	protected int legs;
	    
	    protected Animal(int legs) {
	        this.legs = legs;
	    }
	    
	    public abstract void eat();
	    
	    public void walk() {
	        System.out.println("Este animal anda usando " + legs + " piernas.");
	    }
}
