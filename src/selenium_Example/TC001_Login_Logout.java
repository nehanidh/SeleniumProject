package selenium_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class TC001_Login_Logout {
	
	//Test Data
	//DT     VAR        VV
static String   url = 	"http://127.0.0.1/orangehrm-2.6/login.php";
static String username = "nareshit";
static String password = "nareshit";
static String title1 = "OrangeHRM - New Level of HR Management";
static String title2 = "OrangeHRM";
public static void main(String args[]) throws Exception  {
	//Test steps
	WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		Thread.sleep(3000);
		System.out.println("Application opened");
		//Verify application title
		//Actual result==Expected result
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
			System.out.println("Title matched");
		}
		else {
			System.out.println("Title not matched");
			System.out.println(driver.getTitle());
		}
		//Test Data : Hard coded
		//driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		Thread.sleep(3000);
		//driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(3000);
		//Test Data : Variable 
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		Thread.sleep(3000);
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("Login completed");
		//Verify Title
		if(driver.getTitle().equals("OrangeHRM")) {
			System.out.println("Title matched");
		}
		else {
			System.out.println("Title not matched");
			System.out.println(driver.getTitle());
		}
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		System.out.println("Logout completed");
		driver.close();
	}
}
