package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class class1 {
         String expURL="Facebook.com";
         String actURL1="Facebook.com";
         String actURL2="Facebook.c"; 
         
         @Test
         public void m1() {
        	 Assert.assertEquals(actURL1,expURL);
        	 System.out.println("A1");
        	 
        	 Assert.assertNotEquals(actURL2,expURL);
        	 System.out.println("A2");
        	 
        	 Assert.assertTrue(true);
        	 System.out.println("A3");
        	 
        	 Assert.assertTrue(false);
        	 System.out.println("A4");
        	 
        	 Assert.assertFalse(true, "Assertion failed due to");
        	 System.out.println("A5");
        	 
        	 Assert.assertFalse(false);
        	 System.out.println("A6");}}
        	 
        	 
         
         

