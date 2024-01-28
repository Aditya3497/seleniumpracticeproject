package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FirstProgram {
	
	public static void main(String [] args ){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91777\\workspace\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://google.com");
		driver.get("https://www.cognizant.com/in/en");
	driver.quit();
	
	

	}
}
