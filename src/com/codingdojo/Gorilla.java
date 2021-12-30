package com.codingdojo;

public class Gorilla extends Mammal {
	
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	
	public int throwSomething() {
		System.out.println("The Gorilla threw something");
		energyLevel -= 5;
		return energyLevel;
	}
	
	public int eatBananas() {
		System.out.println("The Gorilla is happy");
		energyLevel += 10;
		return energyLevel;
	}
	
	public int climb() {
		System.out.println("The gorilla has climbed a tree");
		energyLevel -= 10;
		return energyLevel;
	}
}
