package selenium_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import static org.testng.Assert.assertEquals;
//import static org.testng.Assert.assertTrue;


public class TC_Drag_Drop 
{
public static void main(String args[])throws Exception{
	//TEST STEP
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("https://jqueryui.com/droppable/");
	Thread.sleep(3000);
	 System.out.println(driver.getTitle());
	//VERIFY TITLE: STOP EXECUTION IN CASE OF CONDITION FAILED
	
     assertEquals(driver.getTitle(),"Droppable | jQuery UI");
     System.out.println(driver.getTitle());
	//assertEquals(driver.getTitle(),"Droppable|jQuearyUI");
	Thread.sleep(3000);
	System.out.println("Title matched");
	//ENTER INTO FRAME
	driver.switchTo().frame(0);
	Actions ac = new Actions(driver);
	
	ac.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).perform();
	
	System.out.println("Drag&Drop");
	Thread.sleep(3000);
	//EXIT FROM FRAME
	driver.switchTo().defaultContent();
	driver.close();
}

	
}

