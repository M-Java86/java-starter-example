package com.qa.java;
//Follow-along added variable Strings and booleans 

public class Runner {
	
	// Member -attributes
	public static int id;
	public static String msg = "Hello World";
	
	
	// Member - Method has a Scope
	public static void main(String[] args) {
		//Results.Chemistry +20;
		//Results.displayResults();
		System.out.println("Overall Results:" + Results.ExamOverall());
	}
	
}     

// This task is part of QA Community: Java Beginner -> Operators -> Exercises.

//1). Create a method that accepts two integers as input, 
//then returns an integer that is the sum of these two parameters. 
//(Addition) 


//2). Create the following additional three methods that each take two parameters:
//--//-Multiplication - which takes two numbers and returns the product.
//-Subtraction - which takes two numbers, then returns the result of the subtraction.
//-Division - which takes two numbers, then returns the result of the division.

//Your division method may have returned the wrong result; This is called a rounding error..
//and is quite common in most languages. 
//this is because we were using ints rather than doubles.

//---3). Modify the division method so that it takes Double parameters 
//and then return a Double, if not already.

//--- Some helpful short-hands for Eclipse:

//type - "syso"  + ctrl + space to generate the  System.out.println() method.
	//ctrl + shift + f - auto-format/indent


