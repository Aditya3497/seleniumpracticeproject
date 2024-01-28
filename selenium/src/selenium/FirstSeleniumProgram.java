package selenium;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProgram {
	
  @Test
	public void verifyFaceBookHomePage(){
		
		String URL = "https://www.facebook.com";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91777\\workspace\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
	

driver.manage().window().maximize();
		
		String pageTitle = driver.getTitle();
		System.out.println("We get the Title Like :" +pageTitle);
		
		Assert.assertEquals(pageTitle, "Facebook – log in or sign up");
		
	
		
		
	}

}
