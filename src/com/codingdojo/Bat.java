package com.codingdojo;

public class Bat extends Mammal {
	
	public Bat(int energyLevel) {
		super(energyLevel);
	}
  
	public int fly() {
		System.out.println("WOOSH!!");
		energyLevel -= 50;
		return energyLevel;
	}
	
	public int eatHumans() {
		System.out.println("Yummy human!");
		energyLevel += 25;
		return energyLevel;
	}
	
	public int attackTown() {
		System.out.println("Town on fire");
		energyLevel -= 100;
		return energyLevel;
	}
}
