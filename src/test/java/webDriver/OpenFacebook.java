package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenFacebook {
	
	WebDriver driver;
	
	@BeforeMethod
	public void openApp() {
		System.out.println("opening Facebook");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();	
		
	}
	
	@Test
	public void validLoginTest () {
		System.out.println("Testing  Facebook");
		driver.findElement(By.id("email")).sendKeys("hl@bmail.com");
		driver.findElement(By.id("pass")).sendKeys("hjkdh23");
		driver.findElement(By.name("login")).click();	
		
	}
	
	@Test
	public void invalidLoginTest () {
		System.out.println("Testing  Facebook");
		driver.findElement(By.id("email")).sendKeys("hl@bmail.com");
		driver.findElement(By.id("pass")).sendKeys("P@1234");
		driver.findElement(By.name("login")).click();
		
	}
	
	@AfterMethod
	public void closeApp() {
		System.out.println("closing  Facebook");
		driver.quit();
		
	}
	
	

}
