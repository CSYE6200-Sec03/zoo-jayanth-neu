package edu.neu.csye6200;

public class Driver {

	public static void main(String[] args) {
		/* Calling demo methods inside classes created for holding and showing animal objects */
		
		ZooAnimalAPI.Demo();
		
		ZooAbstractAnimalAPI.Demo();
		
		ZooAnimalisticAPI.Demo();
	}

}

//Console Output
/*
In CamelConcrete Class's toString method
In PigeonConcreteClass's toString method
Inside LionConcrete Class's toString method

In CamelAbstract Class's toString method
In PigeonAbstract Class's toString method
In LionAbstract Class's toString method

In CamelInterface Class's toString method
In PigeonInterfaceClass's toString method
In LionInterfaceClass's toString method
 */
