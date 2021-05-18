package com.qa.java;

////This task is part of QA Community: Java Beginner -> Operators -> Exercises.

	public class Results {
	
	public static double Physics = 130;
	public static double Chemsitry = 100;
	public static double Biology = 112;
	public static double total = Physics + Chemsitry + Biology;
	public static double percentage;
	
		public static void displayResults() {
		System.out.println("Physics Marks: " + Physics);
		System.out.println("Chemistry Mark: " + "Chemistry");
		System.out.println("Biology Mark: " + Biology);
		System.out.println("\nOverall Mark : " +  total);
	}
	     public static double ExamOverall() {
	    	 
	  
		//overall percentage that the person has got by multiplying
		//their score by 100 and then dividing by 450
	     return percentage = total * 100 / 450; 
	}
	}


//1) //Create a method that accepts two integers as input, then returns an integer that is the sum of these two parameters. (Addition) 
 

//2). Create the following additional three methods that each take two parameters:

 


	
//Multiplication - which takes two numbers and returns the product.
	//Subtraction - which takes two numbers, then returns the result of the subtraction.
	//Division - which takes two numbers, then returns the result of the division.

//Your division method may have returned the wrong result; This is called a rounding error and is quite common in most languages. this is because we were using ints rather than doubles.
 
//3). Modify the division method so that it takes Double parameters and then return a Double, if not already.
 
//---
 



//Some helpful short-hands for Eclipse:


	
//type - "syso"  + ctrl + space to generate the  System.out.println() method.
	//ctrl + shift + f - auto-format/indent