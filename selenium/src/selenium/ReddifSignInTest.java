package selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ReddifSignInTest {

	@Test
	public void testReddifSignIn() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91777\\workspace\\selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Open the Reddif.com
		driver.get("https://www.rediff.com/");

		// Verify Page Tittle
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle,
				"Rediff.com: News | Rediffmail | Stock Quotes | Shopping");
		
		// Click Sign-in Button
		WebElement singInLink = driver.findElement(By.linkText("Sign in"));
		singInLink.click();
		
		// Verify Sign-in Page Tittle
		Assert.assertEquals(driver.getTitle(), "Rediffmail");
		
		// Insert userName & Password
		WebElement username = driver.findElement(By.id("login1"));
		WebElement password = driver.findElement(By.name("passwd"));
		username.sendKeys("aditya7025@reddif.com");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		password.sendKeys("test@1223");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// Click submit button
		WebElement Signinbtn = driver.findElement(By.name("proceed"));
		Signinbtn.click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Verify the Profile Tittle
		//Assert.assertEquals(driver.getTitle(), "Welcome to Reddif Mail");
		
		driver.quit();
		
	}

}