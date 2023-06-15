package selenium_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_Dropdown {
public static void main(String args[])throws Exception {
		//TEST STEPS 
	//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Asus\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(4000);
	//ENTER INTO FRAME
	driver.switchTo().frame("rightMenu");
	Select st = new Select(driver.findElement(By.name("loc_code")));
	st.selectByVisibleText("Emp.ID"); // OR
	st.selectByIndex(1); // OR
	st.selectByValue("0");// in html code we get this value
	Thread.sleep(4000);
	driver.findElement(By.name("loc_name")).sendKeys("0308");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@value='Search']")).click();
	Thread.sleep(4000);
	//EXIT FROM FRAME
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(4000);
	driver.close();
}
}
