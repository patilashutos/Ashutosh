package TestNG_Concept;

import org.testng.annotations.Test;

public class Keyword5 {
	
	@Test
	public void m1() {
		System.out.println("TC01");}
	
	@Test(timeOut=2000)
	public void m2() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("TC02");}
	
		@Test
	public void m3() {
		System.out.println("TC03");}
	
	@Test
	public void m4() {
		System.out.println("TC04");}
	
}
