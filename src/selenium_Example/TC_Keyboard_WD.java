package selenium_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_Keyboard_WD {
public static void main(String args[]) throws Exception{
	//TEST STEPS
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys("selenium");
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	driver.close();
}
}
