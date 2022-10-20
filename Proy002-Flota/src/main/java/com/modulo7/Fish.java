package com.modulo7;

public class Fish extends Animal implements Pet {
	
	private String name;

	protected Fish(int legs) {
		super(0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Los peces juegan en al agua.");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Los peces comen comida.");
	}
	
	public void walk() {
		System.out.println("Los peces no pueden andar.");
	}

}
