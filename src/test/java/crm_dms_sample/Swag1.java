package crm_dms_sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Swag1 {
	WebDriver driver;
@Test
public void Login() throws InterruptedException
{
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
driver.get("https://www.saucedemo.com/");
driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
driver.findElement(By.xpath("//input[@id='login-button']")).click();
WebElement rClick = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
Actions act=new Actions(driver);
act.contextClick().perform();
Thread.sleep(2000);
List<WebElement> menu = driver.findElements(By.xpath("//a[@class='bm-item menu-item']"));
for (WebElement m : menu) {
	System.out.println(m.getText());
}
Thread.sleep(3000);
WebElement ele1 = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
Select s= new Select(ele1);
List<WebElement> options = s.getOptions();
for (WebElement e : options) {
	System.out.println(e.getText());
}
//JavascriptExecutor js= (JavascriptExecutor) driver;
////js.executeScript("window.scrollBy(0,500)");
//WebElement ele = driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']"));
//js.executeScript("arguments[0].scrollIntoView(true);",ele);
}
}
