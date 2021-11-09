package testing;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class validarRegistro {

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
		
	
		WebElement EmailAddress = driver.findElement(By.name("email"));
		
		WebElement password = driver.findElement(By.name("passwd"));
		
		EmailAddress.clear();
		password.clear();
		
		EmailAddress.sendKeys("katerin0120pazo@gmail.com");
		password.sendKeys("12345678");
		
		//EmailAddress.submit();
		password.submit();

		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		

	}

	
	//@After
	/*public void tearDown() {
		driver.quit();
	}*/
}
