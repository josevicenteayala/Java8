package co.com.intergrupo.charla.java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateSearch {

	public PredicateSearch() {
	}

	public static void main(String[] args) {
		List<Animal> animalList = new ArrayList<>();
		Animal dogAnimal = new Animal(true);
		Animal fishAnimal = new Animal(false);
		Animal frogAnimal = new Animal(true);
		
		animalList.add(dogAnimal);
		animalList.add(fishAnimal);
		animalList.add(frogAnimal);
		
		print(animalList,a -> a.isCanWalk());
		
	}

	private static void print(List<Animal> animalList, Predicate<Animal> predicate) {
		for(Animal animal: animalList) {
			if(predicate.test(animal)) {
				System.out.println("PredicateSearch.print(): the Animal can walk");
			}
		}
	}
	
}

class Animal{
	
	private boolean canWalk;
	
	public Animal(boolean canWalk) {
		this.canWalk = canWalk;
	}
	
	public boolean isCanWalk() {
		return canWalk;
	}
}
