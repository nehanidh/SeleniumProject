package selenium_Example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_WAIT_Statements {
	public static void main(String args[])throws Exception {
		//TEST STEPS 
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/loging.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	//Wait until login button available
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(4));
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Submit"))));
	driver.findElement(By.name("Submit")).click();
	//Wait until employee information: page has to be available
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(4000);
	driver.close();
}
}