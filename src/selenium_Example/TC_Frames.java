package selenium_Example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_Frames {
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
	driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
	Thread.sleep(4000);
	driver.findElement(By.name("txtEmpFirstName")).sendKeys("NEHA");
	driver.findElement(By.name("txtEmpLastName")).sendKeys("PAL");
	driver.findElement(By.id("btnEdit")).click();
	Thread.sleep(4000);
	System.out.println("NEW EMPLOYEE ADDED");
	//EXIT FROM FRAME
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(4000);
	driver.close();
}
}
