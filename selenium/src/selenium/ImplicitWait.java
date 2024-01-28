package selenium;


import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	
	@Test
	public void testimplicitWait(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91777\\workspace\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		//Apply Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//WebElement of Google Search Box
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q' and @title='Search']"));
		searchBox.sendKeys("Selenium-webdriver");
		
		//Click the Google Search Result 
		WebElement searchResult = driver.findElement(By.xpath("//li[@role='presentation'][4]"));
		searchResult.click();
		driver.quit();
		
	}

}
