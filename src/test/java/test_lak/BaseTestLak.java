package test_lak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTestLak {

	public static WebDriver driver;
	
	@BeforeTest
	public void setup() {
		//open the browser and url and make it available for all the test cases
		//open the chrome browser
		driver = new ChromeDriver();
		
		//open the url  
		driver.get("https://wwww.facebook.com");		
	}

	@AfterTest
	public void tearDown() {
		//once it is executed successfully, browser will get closed
		driver.quit(); 		
	}

}
