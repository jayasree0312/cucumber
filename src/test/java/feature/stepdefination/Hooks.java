package feature.stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks{
public static WebDriver driver;
	@Before
	public void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiyanz\\eclipse-workspace\\sree\\cucumbertry\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	}
	@After
	public void close() {
		driver.quit();
	}
	

}
