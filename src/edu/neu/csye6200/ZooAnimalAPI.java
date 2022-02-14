package edu.neu.csye6200;

import java.util.ArrayList;

/* For holding and showing animal objects derived from AnimalAPI */

public class ZooAnimalAPI {
	public static void Demo() {
		
			ArrayList<AnimalAPI> zooConcreteAnimals = new ArrayList<AnimalAPI>();
			zooConcreteAnimals.add(new CamelConcrete());
			zooConcreteAnimals.add(new PigeonConcrete());
			zooConcreteAnimals.add(new LionConcrete());
			
			for(AnimalAPI obj : zooConcreteAnimals)
			{
				System.out.println(obj);
			}
			
			System.out.println();
		}
		
	
}
