package com.learn.singleton;

import java.lang.reflect.Constructor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws Exception
    {
        Example example1 = Example.takeExample();
        System.out.println(example1.hashCode());
        
        Example example2 = Example.takeExample();
        System.out.println(example2.hashCode());
        
        //To break the singleton design pattern we'll use reflection api's
        //solution-> If object is there ==> throw exception from inside constructor
        Example e1=Example.takeExample();
        System.out.println(e1.hashCode());
        
        Constructor<Example> constructor = Example.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Example e2 = constructor.newInstance();
        System.out.println(e2.hashCode());
    }
}
