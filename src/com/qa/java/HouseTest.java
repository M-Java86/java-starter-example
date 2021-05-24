package com.qa.java;

public class HouseTest {

}
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
 org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


//Assertions// 
//=======// fail();
//assetTrue | assertFalse// assertEquals| assertNotEquals
//assertNull | assertNotNull/
//assertSame | assertNotSame

//public class HouseTest {
	 @Test
	@Beforeall, @Afterall - special annotations and required to be called with a static method. 
	

	
	@BeforeAll
	public static void start() {
		System.out.print("Start of test\n");
			
		
	}
	


	@BeforeEach
	public static void beforeEach() {
		System.out.println("TEST STARTING");
	
	}
		
	@AfterEach
	public static void afterEach() {
		System.out.println("TEST ENDING");
	
	@Test
	public void Test1() {
		System.out.println("Hello World -1");
		
		//code
		
	}
		@Test
		public void Test2() {
			System.out.println("Hello World- 2");
	


		@AfterAll
		public static void end() {
			//System.out.println("End of test\n");
			
		}
		
}



//