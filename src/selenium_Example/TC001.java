package selenium_Example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver; 

public class TC001 {
public static void main(String args[]) throws Exception  {
	WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		Thread.sleep(3000);
		driver.close();
	}
}

