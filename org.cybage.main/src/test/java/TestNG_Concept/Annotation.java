package TestNG_Concept;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	@BeforeSuite
	public void m1() {
		System.out.println("Before Suit");}
		
	@AfterSuite
	public void m2() {
		System.out.println("After Suite");}
		
	@BeforeTest
	public void m3() {
		System.out.println("Before Test");}
		
	@AfterTest
	public void m4() {
		System.out.println("After Test");}
		
	@BeforeClass
	public void m5() {
		System.out.println("Before Class");}
		
	@BeforeMethod
	public void m6() {
		System.out.println("Before Method");}
		
	@Test
	public void m7() {
		System.out.println("Test1");}
	
	@AfterClass
	public void m8() {
		System.out.println("After Class");}
		
	@AfterMethod
	public void m9() {
		System.out.println("After Method");}}
		

		
	


