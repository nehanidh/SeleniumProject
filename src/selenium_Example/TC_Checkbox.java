package selenium_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TC_Checkbox {
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
	//CLICK ON CHECKBOX
	//DT   VAR   VV
	for(int i = 1; i<= 10; i = i+2) {
	driver.findElement(By.xpath("//*[@id = 'standardView']/table/tbody/tr["+i+"]/td[1]/input")).click();
	Thread.sleep(4000);
	System.out.println("Clicked on checkbox of"+i);
	//EXIT FROM FRAME
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Logout")).click();
	driver.close();
	}
}
}