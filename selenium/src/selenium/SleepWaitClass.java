package selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepWaitClass {

	@Test
	public void googleSearch() {

		System.setProperty("webdriver.chrome.driver",
		  "C:\\Users\\91777\\workspace\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		//WebElement of Google Search Box
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q' and @title='Search']"));
		searchBox.sendKeys("Selenium-webdriver");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Click the Google Search Result 
		WebElement searchResult = driver.findElement(By.xpath("//li[@role='presentation'][4]"));
		searchResult.click();
		System.out.println("sleep taken successfully");
		
		
		driver.quit();
		

	}

}
