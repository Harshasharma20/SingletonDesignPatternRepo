package com.learn.singleton;

public class Jalebi {
	
    //eager way of creating singleton object
	private static Jalebi jalebi = new Jalebi();
	
	private static Jalebi getJalebi() {
		 return  jalebi;
	}
}

/*
 * here is some advantage or disadvantage of both way
 * in eager way, firstly all the static variables and methods will be initialized, and 
 * object will be created whether client need or not in whole the application at the time of class loading.
 * In lazy loading, if we are not concerning about threads or thread safety thwn this way is good ..but we are dealing with muliple
 * threads then it will create problem
 */

/*
 * WE CAN BREAK THE SINGLETON DESIGN PATTEN BY USING THREE WAYS:-
 * Reflection API's to break singleton pattern
 * 
 * 
 */

