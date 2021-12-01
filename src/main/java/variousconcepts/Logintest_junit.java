package variousconcepts;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Logintest_junit {
	static WebDriver driver;
	
	@BeforeClass
 public static void beforeclass() {
	 System.out.println("before class");
 }
	@AfterClass
	public static void afterclass() {
		System.out.println("after class");
	}
	
	@Before
		public  void Launchbrowser() {

			//System.setProperty("webdriver.chrome.driver","C:\\Users\\Naaz\\Desktop\\selenium july\\Session1\\driver\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
			
			
		    driver = new ChromeDriver();
			driver.get("https://techfios.com/billing/?ng=admin");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
		
		@Test
		public  void Logintest() throws InterruptedException {
			
			driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
			driver.findElement(By.id("password")).sendKeys("abc123");
			driver.findElement(By.name("login")).click();
			
			Thread.sleep(3000);
			
		
		}
		

			
		@After
		public  void teardown() {
			System.out.println("close browser");
			driver.close();
		}
	}


