package com.qa.java;
//Follow-along added variable Strings and booleans 

public class Runner {
	
	// Member -attributes
	public static int id;
	public static String msg = "Hello World";
	
	
	// Member - Method has a Scope
	public static void main(String[] args) {
		
		int var = 5;
		
		var -= 3;
		
		System.out.println(var);
		
		//int result = 2;
		
		//result -=8; // we can change the value of the variable by using ++;
		
		
		//int result = Calculator.add(5, 5);
		//	boolean flag = true;
		
		//System.out.println(!flag);//-we can change the logic of this statement by add !, which is called logical not argument...
		//..this is going imply the opposite of the statement here. So if it's true, then it will be false and vice versa.
		//This is only used in conjunction with a boolean. 
		
	}
	
		public static int add(int num1, int num2) {
			return num1 + num2;
		}

}
