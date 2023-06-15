package selenium_Example;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_Alert {
public static void main(String args[]) throws Exception {
	//TEST STEP
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(4000);
	Alert a = driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept();
	Thread.sleep(4000);
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(4000);
	driver.findElement(By.linkText("Logout")).click();
	driver.close();
}
}
