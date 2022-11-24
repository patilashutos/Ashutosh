package TestNG_Concept;

import org.testng.annotations.Test;

public class Keywords2 {
	
	@Test(priority=4)
	public void m1() {
		System.out.println("TC01");}
	
	@Test(priority=1)
	public void m2() {
		System.out.println("TC02");}
	
	@Test(priority=3)
	public void m3() {
		System.out.println("TC03");}
	
	@Test(priority=2)
	public void m4() {
		System.out.println("TC04");}
	
	
	}
	


