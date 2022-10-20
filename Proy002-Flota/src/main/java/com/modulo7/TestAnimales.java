package com.modulo7;

public class TestAnimales {
	public static void main(String[] args) {
		
		Fish f = new Fish(0);
		Cat c = new Cat("Fluffy");
		Animal a = new Fish(0);
		Animal e = new Spider();
		Pet p = new Cat();
			
		f.play();
		c.play();
		e.eat();
		c.walk();
	}
}
