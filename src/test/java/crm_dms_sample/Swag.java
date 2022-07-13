package crm_dms_sample;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Swag {
	WebDriver driver;
	@Test
//@Parameters("Browser")
	public void HomeSwagTest()
{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();		
	/** step1: to maximize the window**/
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("https://www.saucedemo.com/");
}
}
