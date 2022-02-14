package edu.neu.csye6200;

import java.util.ArrayList;

/* For holding and showing animal objects derived from AnimalisticAPI */

public class ZooAnimalisticAPI {
	public static void Demo() {
			
			ArrayList<AnimalisticAPI> zooInterfaceAnimals = new ArrayList<AnimalisticAPI>();
			zooInterfaceAnimals.add(new CamelInterface());
			zooInterfaceAnimals.add(new PigeonInterface());
			zooInterfaceAnimals.add(new LionInterface());
			
			for(AnimalisticAPI obj : zooInterfaceAnimals)
			{
				System.out.println(obj);
			}
			
			System.out.println();
		}
}
