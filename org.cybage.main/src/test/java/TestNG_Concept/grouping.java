package TestNG_Concept;

import org.testng.annotations.Test;

public class grouping {
	    @Test(groups="Testing")
		public void m1() {
			System.out.println("TC01");}
		
		@Test
		public void m2() {
			System.out.println("TC02");}
		
		@Test(groups="Testing")
		public void m3() {
			System.out.println("TC03");}
		
		@Test
		public void m4() {
			System.out.println("TC04");}
		
		
		}



