package selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

 public class OptionClassSelenium {

	private static final boolean True = false;
	@Test
	public void sampleOptionsSetBinary() {

		
		  //open Specific Version of Chrome
		  System.setProperty("webdriver.chrome.driver",
		  "C:\\Users\\91777\\workspace\\selenium\\Drivers\\chromedriver.exe");
		  ChromeOptions co = new ChromeOptions();  
		  co.setBinary ("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		  
		   WebDriver driver = new ChromeDriver(co);
		  driver.get("https://google.com");
	}
       @Test
      public void acceptCertificate() {

	System.setProperty("webdriver.chrome.driver",
		  "C:\\Users\\91777\\workspace\\selenium\\Drivers\\chromedriver.exe");

	ChromeOptions co = new ChromeOptions();  
	co.setAcceptInsecureCerts(true);

	WebDriver driver = new ChromeDriver(co);
	driver.manage().window().maximize();

	driver.get("https://cacert.org");
     }
       @Test
       public void OpenHeadLess() {
   		System.setProperty("webdriver.chrome.driver",
		  "C:\\Users\\91777\\workspace\\selenium\\Drivers\\chromedriver.exe");

   		ChromeOptions co = new ChromeOptions();  
   		
   		co.setHeadless(false);

   		WebDriver driver = new ChromeDriver(co);;
   		driver.manage().window().maximize();

   		driver.get("https://cacert.org");
   		String pageTitle = driver.getTitle();
   		Assert.assertEquals(pageTitle, "Welcome to CAcert.org");

       }
      @Test
       public void setArguments() {

   		System.setProperty("webdriver.chrome.driver",
		  "C:\\Users\\91777\\workspace\\selenium\\Drivers\\chromedriver.exe");
   		
   		ChromeOptions co = new ChromeOptions();
   		co.addArguments("--disable-infobars");
   		
   		WebDriver driver = new ChromeDriver(co);
   		driver.manage().window().maximize();
   		
   		driver.get("https://www.bing.com");
      }
       
 }
