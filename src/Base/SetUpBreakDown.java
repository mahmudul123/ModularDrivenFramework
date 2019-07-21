package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SetUpBreakDown {
    WebDriver driver;
	@BeforeSuite
	public void beforeSuite(){
			System.setProperty("webdriver.chrome.driver","/Users/mahmudulalam/eclipse-workspace/ModularDrivenFramework/WebDriver/chromedriver");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
	}
	@AfterSuite
	public void afterSuite(){
		System.out.println("*** TEST SUITE ENDED ");
		// close db
		// suite end time
		
	}
	
	@BeforeTest
	public void beforeTest (){
		System.out.println("Before the test");
	}
	@AfterTest
	public void afterTest (){
		System.out.println("After the test");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("---- before each test");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("----- After each test");
	}
	
	
	@Test (priority=3)
	public void logOutTest(){
		System.out.println("Logout at the end");
	}
	
	@Test (priority=1)
	public void logInTest (){
		System.out.println("Login first");
		// selenium code 
	}
	
	@Test (priority=2)
	public void changePassword(){
		System.out.println("change password");
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
