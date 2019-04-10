package com.java.fundamentals.access.modifiers.animals;

public class Pet extends Animal {

	public static void main(String[] args) {
		Pet pet = new Pet();
		String animalType = pet.animalTypeDefault;
		animalType = pet.animalTypeProtected;
		animalType = pet.animalTypePublic;
		pet.getAnimalTypeDefault();
		pet.getAnimalTypeProtected();
		pet.getAnimalTypePublic();
		
		Animal petAnimal = new Pet();
		animalType = petAnimal.animalTypeDefault;
		animalType = petAnimal.animalTypeProtected;
		animalType = petAnimal.animalTypePublic;
		petAnimal.getAnimalTypeDefault();
		petAnimal.getAnimalTypeProtected();
		petAnimal.getAnimalTypePublic();
		
		Animal animal = new Animal();
		animalType = animal.animalTypeDefault;
		animalType = animal.animalTypeProtected;
		animalType = animal.animalTypePublic;
		animal.getAnimalTypeDefault();
		animal.getAnimalTypeProtected();
		animal.getAnimalTypePublic();			
		
	}

}
