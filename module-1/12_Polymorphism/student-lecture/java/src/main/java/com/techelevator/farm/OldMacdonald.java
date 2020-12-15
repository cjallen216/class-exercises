package com.techelevator.farm;

import java.util.ArrayList;
import java.util.List;

public class OldMacdonald
{
	public static void main(String[] args)
	{

		// add logic to sing about the farm
		List<Singable> farmThings = new ArrayList<Singable>();
		
		farmThings.add(new Chicken());
		farmThings.add(new Cow());
		farmThings.add(new Tractor());
		
		
		for (Singable thing : farmThings)
		{
			singVerse(thing);
		}
		
		
	}

	public static void singVerse(Singable farmItem)
	{
		String name = farmItem.getName();
		String sound = farmItem.getSound();

		System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
		System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
		System.out.println("With a " + sound + " " + sound + " here");
		System.out.println("And a " + sound + " " + sound + " there");
		System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
		System.out.println();

	}
	
	public static void cowDemo()
	{
		Cow cow = new Cow();
		System.out.println(cow.getSound());
		cow.startEating();
		System.out.println(cow.getSound());
		
		FarmAnimal animal = cow;
		System.out.println(animal.getSound());
	}
	
	public static void chickenDemo()
	{
		FarmAnimal pig = new FarmAnimal("Pig", "oink!");
		Chicken chicken = new Chicken();
		
		// implicit conversion
		// because a chicken IS A FarmAnimal
		FarmAnimal animal = chicken;
		System.out.println(animal.getName());

		// animal doesn't know that layEgg() is available
		// to do that we need to convert the animal to a chicken
		// we have to do explicit conversion 
		// b/c NOT every animal IS A chicken
		Chicken chicken2 = (Chicken)animal;
		chicken2.layEgg();
		
		
		System.out.println(pig.getName() + " says " + pig.getSound());
		System.out.println(chicken.getName() + " says " + chicken.getSound());
		chicken.layEgg();
	}
}