package com.learn.singleton;

public class Example {
	
	private static Example example;
	
	//creating constructor
	// If we make private constructor restricted then we can't make object of it in another class
	private Example() {
		
	}
	
	//method
	
	//lazy way of creating singleton objects
	public static Example takeExample() {
		if(example == null) {
			example = new Example();
		}
		
		return example;
	}

}



/*To make singleton object 
 * step 1 - varibale and constructor should be private 
 * step 2 - method and variable should be static
 * 
 */



