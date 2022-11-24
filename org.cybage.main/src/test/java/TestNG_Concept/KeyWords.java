package TestNG_Concept;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeyWords {
    @BeforeClass
    public void m1() {
    	System.out.println("Before Class");}
    
    @BeforeMethod
    public void m2() {
    	System.out.println("Before Method");}
    
    @AfterClass
    	public void m3() { 
    		System.out.println("After Class");}
    	
   @AfterMethod
     public void m4() {
	   System.out.println("After Method");
    	}
    
    @Test
    public void TC1() {
    	System.out.println("Test1");}
    
    @Test
    public void TC2() {
    	System.out.println("Test2");}
    
    @Test
    public void TC3() {
    	System.out.println("Test3");}
    
    
 
    
    
    }

