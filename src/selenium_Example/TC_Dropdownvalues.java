package selenium_Example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_Dropdownvalues {
public static void main(String args[])throws Exception {
		//TEST STEPS 
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/loging.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(4000);
	//ENTER INTO FRAME
	driver.switchTo().frame("rightMenu");
	//DROPDOWN VALUES
	Select st = new Select(driver.findElement(By.name("loc_code")));
	List<WebElement> values = st.getOptions();
	for(WebElement dropval:values) {
		System.out.println(dropval.getText());
		Thread.sleep(4000);
	}
	//EXIT FROM FRAME
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Logout")).click();
	driver.close();
	
}
}