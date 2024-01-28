package selenium;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeout {
	
	@SuppressWarnings("deprecation")
	@Test
	public void pageLoadTimeOutTest(){
		
		System.setProperty("webdriver.chrome.driver",
		  "C:\\Users\\91777\\workspace\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Define Page Load TimeOut
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		driver.get("https://edition.cnn.com/");
		
		driver.quit();
		
	}

}