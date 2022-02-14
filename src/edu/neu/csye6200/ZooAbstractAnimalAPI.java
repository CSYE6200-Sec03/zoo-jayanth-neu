package edu.neu.csye6200;

import java.util.ArrayList;

/* For holding and showing animal objects derived from AbstractAnimalAPI */

public class ZooAbstractAnimalAPI {
	
	public static void Demo() {
		
		ArrayList<AbstractAnimalAPI> zooAbstractAnimals = new ArrayList<AbstractAnimalAPI>();
		zooAbstractAnimals.add(new CamelAbstract());
		zooAbstractAnimals.add(new PigeonAbstract());
		zooAbstractAnimals.add(new LionAbstract());
		
		for(AbstractAnimalAPI obj : zooAbstractAnimals)
		{
			System.out.println(obj);
		}
		
		System.out.println();
	}
		
}
