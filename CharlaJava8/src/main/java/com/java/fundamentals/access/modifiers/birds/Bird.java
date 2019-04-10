package com.java.fundamentals.access.modifiers.birds;

import com.java.fundamentals.access.modifiers.animals.Animal;

public class Bird extends Animal{

	public static void main(String[] args) {
		Bird bird = new Bird();
		String animalType = bird.animalTypePublic;
		animalType = bird.animalTypeProtected;
		bird.getAnimalTypePublic();
		bird.getAnimalTypeProtected();
		
		Animal animalBird = new Bird();
		animalType = animalBird.animalTypePublic;
		animalType = animalBird.getAnimalTypePublic();
		
		Animal animal = new Animal();
		animalType = animal.animalTypePublic;
		animal.getAnimalTypePublic();
				
			
	}

}
