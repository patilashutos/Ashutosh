package testclasswithbase;

import org.testng.annotations.BeforeClass;

import BasePackage.BaseClass;

public class testclasswithbase extends BaseClass{
	
	@BeforeClass
	public void m1() throws InterruptedException {
		launchBrowser("chrome");
	}
	}
