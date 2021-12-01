package variousconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintest {
	static WebDriver driver;
	
	
  
   
	public static void main(String[] args) throws InterruptedException {
	
		Launchbrowser();
		Logintest();
		teardown();
		
		
		
		
	}
	public static void Launchbrowser() {

		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Naaz\\Desktop\\selenium july\\Session1\\driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		
		
	    driver = new ChromeDriver();
		driver.get("https://techfios.com/billing/?ng=admin");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	public static void Logintest() throws InterruptedException {
		
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		
	
	}
	

		
	
	public static void teardown() {
		
		driver.close();
	}
}
