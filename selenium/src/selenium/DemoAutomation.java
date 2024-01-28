package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91777\\"
				+ "workspace\\selenium\\Drivers\\chromedriver.exe");
    
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	
	}
	

}
