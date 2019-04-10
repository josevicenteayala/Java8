package com.java.fundamentals.access.modifiers.animals;

public class Animal {
	
	public String animalTypePublic;
	protected String animalTypeProtected;
	String animalTypeDefault;
	private String animalPrivate;
	
	public String getAnimalTypePublic() {
		return animalTypePublic;
	}

	protected String getAnimalTypeProtected() {
		return animalTypeProtected;
	}

	String getAnimalTypeDefault() {
		return animalTypeDefault;
	}

	private String getAnimalPrivate() {
		return animalPrivate;
	}
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		String animalType = animal.animalPrivate;
		animalType = animal.animalTypeDefault;
		animalType = animal.animalTypeProtected;
		animalType = animal.animalTypePublic;
		animal.getAnimalPrivate();
		animal.getAnimalTypeDefault();
		animal.getAnimalTypeProtected();
		animal.getAnimalTypePublic();
		
	}

}
