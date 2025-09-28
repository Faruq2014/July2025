package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenApplication {

	/*
	 * open facebook with chrome browser enter invalid user name enter valid
	 * password click on log in button facebook should not logged in then close the
	 * facebook
	 */

	WebDriver driver;

	@BeforeTest
	public void openApp() {
		System.out.println("opening Facebook");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	}

	@Test
	public void invalidLoginTest() {
		System.out.println("Testing  Facebook");
		driver.findElement(By.id("email")).sendKeys("hl@bmail.com");
		driver.findElement(By.id("pass")).sendKeys("hjkdh23");
		driver.findElement(By.name("login")).click();
	}

	@Test
	public void validLoginTest() {

		System.out.println("Testing  Facebook");
		driver.findElement(By.id("email")).sendKeys("hl@bmail.com");
		driver.findElement(By.id("pass")).sendKeys("P@1234");
		driver.findElement(By.name("login")).click();

	}

	@AfterTest
	public void closeApp() {
		System.out.println("closing  Facebook");
		driver.quit();

	}

}
