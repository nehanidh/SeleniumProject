package selenium_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_FileUpload {
public static void main(String args[])throws Exception{
	 //System.setProperty("webdriver.gecko.driver","C:\\Users\\Asus\\Downloads\\geckodriver-v0.33.0-win64\\");
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	//driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nareshit");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath("//input[@value='Add']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='txtEmpLastName']")).sendKeys("PAL");
	
	driver.findElement(By.xpath("//*[@name='txtEmpFirstName']")).sendKeys("NEHA");
	//TO UPLOAD FILE
	WebElement fileInput = driver.findElement(By.xpath("//input[@type='file'][@name='photofile']"));
	
	fileInput.sendKeys("C:\\Adactin\\Templates\\Defect Template 1.xlsx");
	Thread.sleep(3000);
	System.out.println("File uploaded successfully");
	driver.findElement(By.xpath("//*[@id='btnEdit']")).click();
	Thread.sleep(3000);
	System.out.println("New emplyee added");
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Logout")).click();
	driver.close();
}
}
