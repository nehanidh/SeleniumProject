package selenium_Example;


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_WindowHandlers { 
public static void main(String args[])throws Exception{
	//TEST STEP
	WebDriver driver = new FirefoxDriver();
	//1st window
	driver.get("file:///C:/Users/Asus/Downloads/multiplewindows.html");
	Thread.sleep(2000);
	//2nd window
	driver.findElement(By.id("btn2")).click();
	Thread.sleep(2000);
	//3rd window
	driver.findElement(By.id("btn3")).click();
	Thread.sleep(2000);
	ArrayList<String>windinfo = new ArrayList<String>(driver.getWindowHandles());
	//driver.switchTo().window(Windinfo.get(0));
	driver.switchTo().window(windinfo.get(0));
	Thread.sleep(2000);
	driver.close();
	//driver.quit();
}

}
