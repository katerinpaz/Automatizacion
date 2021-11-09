package testing;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class validarEmailRegistro {
	
	private WebDriver driver;
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}
	
	@Test
	public void testPage() {
		
	
		WebElement searchbox = driver.findElement(By.name("email_create"));
		
		searchbox.clear();
		
		searchbox.sendKeys("pepitoperez@gmail.com");
		
		searchbox.submit();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		

	}

	
	//@After
	/*public void tearDown() {
		driver.quit();
	}*/
}