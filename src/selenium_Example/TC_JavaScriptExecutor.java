package selenium_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_JavaScriptExecutor {
public static void main(String args[])throws Exception{
	// System.setProperty("webdriver.gecko.driver","F:\\Suresh\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//TEST CASES STEP
		driver.manage().window().maximize();
		driver.get("http://183.82.103.245/nareshit/login.php");
		//driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("nareshit");
	    driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		//using javascriptExecutor to click on login button
				WebElement loginbtn = driver.findElement(By.name("Submit"));
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();",loginbtn);
				Thread.sleep(3000);
				System.out.println("login completed");
				driver.close();
		
}
}
