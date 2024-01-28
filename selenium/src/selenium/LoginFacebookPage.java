package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebookPage {
	public static void main(String[] args) throws InterruptedException {
		        System.setProperty("webdriver.chrome.driver","C:\\Users\\91777\\workspace\\selenium\\Driver\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		        // Maximing the Window
		        driver.manage().window().maximize();
				driver.get("http://facebook.com/");
				Thread.sleep(2000);
				WebElement email = driver.findElement(By.id("email"));
				email.sendKeys("7774875129");
				WebElement password = driver.findElement(By.id("pass"));
				password.sendKeys("@12253");
				Thread.sleep(200);
				driver.findElement(By.name("login")).click();
				  
				  System.exit(0);
				
	}
}
