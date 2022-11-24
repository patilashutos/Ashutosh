package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class class2 {
	 String expURL="Facebook.com";
     String actURL1="Facebook.com";
     String actURL2="Facebook.c"; 
      @Test
     public void m2() {
    	 SoftAssert s=new SoftAssert();
    	 s.assertEquals(actURL1,expURL);
    	 System.out.println("A1");
    	 
    	 s.assertNotEquals(actURL2,expURL);
    	 System.out.println("A2");
    	 
    	 s.assertTrue(true);
    	 System.out.println("A3");
    	 
    	 s.assertTrue(false);
    	 System.out.println("A4");
    	 
    	 s.assertFalse(true, "Assertion failed due to");
    	 System.out.println("A5");
    	 
    	 s.assertFalse(false);
    	 System.out.println("A6");
    	 
    	 s.assertAll();}}
    	 
    	 //s.fail();
    	 //System.out.println("A7");}}
    	 


